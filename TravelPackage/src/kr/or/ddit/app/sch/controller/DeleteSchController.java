package kr.or.ddit.app.sch.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.sch.service.ISchService;
import kr.or.ddit.app.sch.service.SchServiceImpl;
import kr.or.ddit.app.sch.vo.SchVO;


@WebServlet("/sch/schDelete.do")
public class DeleteSchController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pkgId = req.getParameter("pkgId");
		String schDay = req.getParameter("schDay");
		
		// 1. 서비스 객체 생성하기
		ISchService schService = SchServiceImpl.getInstance();
		
		SchVO sv = new SchVO();
		sv.setPkgId(pkgId);
		sv.setSchDay(Integer.parseInt(schDay));
		
		schService.removeSch(sv);
		
		String redirectUrl = req.getContextPath() + "/pkg/pkgDetail.do?pkgId=" + pkgId;
		
		resp.sendRedirect(redirectUrl);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
