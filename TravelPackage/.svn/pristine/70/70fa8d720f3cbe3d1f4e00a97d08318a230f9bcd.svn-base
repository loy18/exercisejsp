package kr.or.ddit.app.pkg.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;
import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;

@MultipartConfig
@WebServlet("/pkg/pkgInsert.do")
public class InsertPkgController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/pkg/pkgInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String pkgNm = req.getParameter("pkgNm");
		String pkgCont = req.getParameter("pkgCont");
		String pkgDay = req.getParameter("pkgDay");
		String pkgPri = req.getParameter("pkgPri");
		String pkgReg = req.getParameter("pkgReg");
		String pkgGui = req.getParameter("pkgGui");
		String pkgMinTo = req.getParameter("pkgMinTo");
		String pkgMaxTo = req.getParameter("pkgMaxTo");
		String pkgRd = req.getParameter("pkgRd");
		String pkgWrt = req.getParameter("pkgWrt");
		
		IPkgService PkgService = PkgServiceImpl.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		// 첨부파일 저장하기
		AtchFileVO atchFileVO = fileService.saveAtchFileList(req, getServletContext().getRealPath("/") + File.separator + "pkg");
		
		PkgVO pv = new PkgVO();
		pv.setPkgNm(pkgNm);
		pv.setPkgDay(pkgDay);
		pv.setPkgCont(pkgCont);
		pv.setPkgPri(Integer.parseInt(pkgPri));
		pv.setPkgReg(pkgReg);
		pv.setPkgGui(pkgGui);
		pv.setPkgMinTo(pkgMinTo);
		pv.setPkgMaxTo(pkgMaxTo);
		pv.setPkgRd(pkgRd);
		pv.setPkgWrt(pkgWrt);
		pv.setAtchFileId(atchFileVO.getAtchFileId());
		
		int cnt = PkgService.registerPkg(pv);
		
//		req.getRequestDispatcher("/Pkg/PkgList.do").forward(req, resp);
		
		String redirectUrl = req.getContextPath() + "/pkg/pkgList.do";
		resp.sendRedirect(redirectUrl);
	}
	
	public static void main(String[] args) {
		IPkgService PkgService = PkgServiceImpl.getInstance();
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		// 첨부파일 저장하기
//		AtchFileVO atchFileVO = fileService.saveAtchFileList(req, getServletContext().getRealPath("/") + File.separator + "pkg");
		
		PkgVO pv = new PkgVO();
		pv.setPkgNm("이름");
		pv.setPkgDay("날짜");
		pv.setPkgCont("날짜");
		pv.setPkgPri(Integer.parseInt("30"));
		pv.setPkgReg("날짜");
		pv.setPkgGui("날짜");
		pv.setPkgMinTo("3");
		pv.setPkgMaxTo("4");
		pv.setPkgRd("2020-02-02");
		pv.setPkgWrt("dksgkdyd");
//		pv.setAtchFileId(atchFileVO.getAtchFileId());
		
		int cnt = PkgService.registerPkg(pv);
	}
}












