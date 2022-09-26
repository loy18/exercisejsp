package kr.or.ddit.app.pkg.controller;

import java.io.File;
import java.io.IOException;  
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;


/**
 * Servlet implementation class UpdateMemberController
 */
@MultipartConfig
@WebServlet("/pkg/pkgUpdate.do")
public class UpdatePkgController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      String pkgId = req.getParameter("pkgId");
      
      // 1. 서비스 객체 생성하기
      IPkgService pkgService = PkgServiceImpl.getInstance();
      PkgVO pv = pkgService.getPkg(pkgId);
      
      IAtchFileService fileService = AtchFileServiceImpl.getInstance();
      
      if(pv.getAtchFileId() > 0) { // 첨부파일 존재
    	  // 1-2. 첨부파일 정보 조회
    	  AtchFileVO fileVO = new AtchFileVO();
    	  fileVO.setAtchFileId(pv.getAtchFileId());
    	  
    	  List<AtchFileVO> atchFileList = 
    			  fileService.getAtchFileList(fileVO);
    	  
    	  req.setAttribute("atchFileList", atchFileList);
      }
      
      req.setAttribute("pv", pv);
      
      req.getRequestDispatcher("/pkg/pkgUpdate.jsp").forward(req, resp);
      
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse resp)
    */
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		// 1. 파라미터 데이터 가져오기
	   	String pkgId = req.getParameter("pkgId");
	   	String pkgNm = req.getParameter("pkgNm");
	   	String pkgCont = req.getParameter("pkgCont");
		String pkgDay = req.getParameter("pkgDay");
		String pkgPri = req.getParameter("pkgPri");
		String pkgReg = req.getParameter("pkgReg");
		String pkgGui = req.getParameter("pkgGui");
		String pkgMinTo = req.getParameter("pkgMinTo");
		String pkgMaxTo = req.getParameter("pkgMaxTo");
		String pkgWrt = req.getParameter("pkgWrt");
		String atchFileId = req.getParameter("fileId");
		
		
		
		// 2. 서비스 객체 생성하기
		IPkgService pkgService = PkgServiceImpl.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		
		// 첨부파일 저장하기
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req, getServletContext().getRealPath("/") + File.separator + "pkg");
		 
	   // 3. 회원정보 수정하기
		PkgVO pv = new PkgVO();
		pv.setPkgId(Long.parseLong(pkgId));
		pv.setPkgNm(pkgNm);
		pv.setPkgCont(pkgCont);
		pv.setPkgDay(pkgDay);
		pv.setPkgPri(Integer.parseInt(pkgPri));
		pv.setPkgReg(pkgReg);
		pv.setPkgGui(pkgGui);
		pv.setPkgMinTo(pkgMinTo);
		pv.setPkgMaxTo(pkgMaxTo);
		pv.setPkgWrt(pkgWrt);
	   
	   if(atchFileVO == null) { // 새로운 첨부파일이 존재하지 않으면
		   // 기존 첨부 파일 ID 설정하기
		   pv.setAtchFileId(Long.parseLong(atchFileId));
	   } else { 
		   // 신규 첨부 파일 ID 설정하기
		   pv.setAtchFileId(atchFileVO.getAtchFileId());
	   }
	   
	   
	   int cnt = pkgService.modifyPkg(pv);
	   String msg = "";
	   
	   if(cnt > 0) {
		   msg = "성공";
	   }else {
		   msg = "실패";
	   }
	   
	  
	   HttpSession session = req.getSession();
	   session.setAttribute("msg", msg);
	   
	  
	   // 4. 목록 조회 화면으로 이동
	   String redirectUrl  = req.getContextPath() + "/pkg/pkgList.do";
	   
	   resp.sendRedirect(redirectUrl);
	   
   }

}