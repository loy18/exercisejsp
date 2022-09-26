package kr.or.ddit.app.sch.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import kr.or.ddit.app.sch.service.ISchService;
import kr.or.ddit.app.sch.service.SchServiceImpl;
import kr.or.ddit.app.sch.vo.SchVO;
import kr.or.ddit.app.tour.service.ITourService;
import kr.or.ddit.app.tour.service.TourServiceImpl;
import kr.or.ddit.app.tour.vo.TourVO;


/**
 * Servlet implementation class UpdateMemberController
 */
@MultipartConfig
@WebServlet("/sch/schUpdate.do")
public class UpdateSchController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
    */
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
      String pkgId = req.getParameter("pkgId");
      String schDay = req.getParameter("schDay");
      
      SchVO searchSch = new SchVO();
      searchSch.setPkgId(pkgId);
      searchSch.setSchDay(Integer.parseInt(schDay));
      
      ISchService schService = SchServiceImpl.getInstance();
      ITourService tourService = TourServiceImpl.getInstance();
      SchVO sv = schService.getSchForDay(searchSch);
      List<String> list = schService.getTourList(sv);
      List<TourVO> tourList = new ArrayList<TourVO>();
      
      for(int i=0; i<list.size(); i++) {
    	  TourVO tv = tourService.getTour(list.get(i));
    	  tourList.add(tv);
      }
      
      
      req.setAttribute("sv", sv);
      req.setAttribute("tourList", tourList);
      req.getRequestDispatcher("/sch/schUpdate.jsp").forward(req, resp);
      
      
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest req, HttpServletResponse resp)
    */
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		// 1. 파라미터 데이터 가져오기
		String schId = req.getParameter("schId");
		String schNm = req.getParameter("schNm");
		String schSe = req.getParameter("schSe");
		String schAddr = req.getParameter("schAddr");
		String schPri = req.getParameter("schPri");
		String schMaxTo = req.getParameter("schMaxTo");
		String schWrt = req.getParameter("schWrt");
		String atchFileId = req.getParameter("fileId");
		
		// 2. 서비스 객체 생성하기
		ISchService schService = SchServiceImpl.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		
		// 첨부파일 저장하기
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req, getServletContext().getRealPath("/") + File.separator + "sch");
		 
	   // 3. 회원정보 수정하기
		SchVO sv = new SchVO();
//	   sv.setSchId(schId);
//	   sv.setSchNm(schNm);
//	   sv.setSchSe(schSe);
//	   sv.setSchAddr(schAddr);
//	   sv.setSchPri(schPri);
//	   sv.setSchMaxTo(schMaxTo);
//	   sv.setSchWrt(schWrt);
//	   
//	   if(atchFileVO == null) { // 새로운 첨부파일이 존재하지 않으면
//		   // 기존 첨부 파일 ID 설정하기
//		   sv.setAtchFileId(Long.parseLong(atchFileId));
//	   } else { 
//		   // 신규 첨부 파일 ID 설정하기
//		   sv.setAtchFileId(atchFileVO.getAtchFileId());
//	   }
	   
	   
	   int cnt = schService.modifySch(sv);
	   
	   String msg = "";
	   
	   if(cnt > 0) {
		   msg = "성공";
	   }else {
		   msg = "실패";
	   }
	   
	  
	   HttpSession session = req.getSession();
	   session.setAttribute("msg", msg);
	   
	  
	   // 4. 목록 조회 화면으로 이동
	   String redirectUrl  = req.getContextPath() + "/sch/schList.do";
	   
	   resp.sendRedirect(redirectUrl);
	   
   }

}