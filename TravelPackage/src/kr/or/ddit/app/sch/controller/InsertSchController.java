package kr.or.ddit.app.sch.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.sch.service.ISchService;
import kr.or.ddit.app.sch.service.SchServiceImpl;
import kr.or.ddit.app.sch.vo.SchVO;
import kr.or.ddit.app.schcomb.service.ISchCombService;
import kr.or.ddit.app.schcomb.service.SchCombServiceImpl;
import kr.or.ddit.app.schcomb.vo.SchCombVO;
import kr.or.ddit.app.common.service.AtchFileServiceImpl;
import kr.or.ddit.app.common.service.IAtchFileService;
import kr.or.ddit.app.common.vo.AtchFileVO;

@MultipartConfig
@WebServlet("/sch/schInsert.do")
public class InsertSchController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pkgId = req.getParameter("pkgId");
		req.setAttribute("pkgId", pkgId);
		req.getRequestDispatcher("/sch/schInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String pkgId = req.getParameter("pkgId");
		String schDay = req.getParameter("schDay");
		String acmId = req.getParameter("acmId");
		String vehcId = req.getParameter("vehcId");
		String tourIds = req.getParameter("tourId");
		
		ISchService schService = SchServiceImpl.getInstance();
		
		SchVO sv = new SchVO();
		sv.setPkgId(pkgId);
		sv.setSchDay(Integer.parseInt(schDay));
		sv.setAcmId(acmId);
		sv.setVehcId(vehcId);
		sv.setTourIds(tourIds);
		
		int cnt = schService.registerSch(sv);
		
		
		
		String redirectUrl = req.getContextPath() + "/pkg/pkgDetail.do?pkgId=" + pkgId;
		resp.sendRedirect(redirectUrl);
	}
}












