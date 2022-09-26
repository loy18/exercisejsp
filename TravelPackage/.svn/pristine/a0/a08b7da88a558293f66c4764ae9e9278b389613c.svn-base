package kr.or.ddit.app.compkg.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.compkg.service.IComPkgService;
import kr.or.ddit.app.compkg.service.ComPkgServiceImpl;
import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;

@MultipartConfig
@WebServlet("/compkg/comPkgInsert.do")
public class InsertComPkgController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pkgId = req.getParameter("pkgId");
		
		IPkgService pkgService = PkgServiceImpl.getInstance();
		PkgVO pv = pkgService.getPkg(pkgId);
		
		
		
		req.setAttribute("pv", pv);
		req.getRequestDispatcher("/compkg/comPkgInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String pkgId = req.getParameter("pkgId");
		String comPkgDay = req.getParameter("comPkgDay");
		String comPkgWrt = req.getParameter("comPkgWrt");
		
		ComPkgVO cpv = new ComPkgVO();
		cpv.setPkgId(pkgId);
		cpv.setComPkgDay(comPkgDay);
		cpv.setComPkgWrt(comPkgWrt);
		
		
		IComPkgService comPkgService = ComPkgServiceImpl.getInstance();

		
		int cnt = comPkgService.registerComPkg(cpv);
		
		
		String redirectUrl = req.getContextPath() + "/pkg/pkgDetail.do?pkgId=" + pkgId;
		resp.sendRedirect(redirectUrl);
	}
}












