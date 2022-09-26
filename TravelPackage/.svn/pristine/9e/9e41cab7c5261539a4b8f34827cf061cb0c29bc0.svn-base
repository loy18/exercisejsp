package kr.or.ddit.app.pkg.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;
import kr.or.ddit.app.tour.vo.TourVO;


@WebServlet("/pkg/pkgDelete.do")
public class DeletePkgController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] pkgIds = req.getParameterValues("pkgId");
		
		// 1. 서비스 객체 생성하기
		IPkgService pkgService = PkgServiceImpl.getInstance();
		
		// 2. 삭제 처리
		for(String pkgId : pkgIds) {
			PkgVO tv = pkgService.getPkg(pkgId);
			int cnt = pkgService.removePkg(pkgId);
		}
		resp.getWriter().write("OK");
//		String msg = "";
//		
//		if(cnt > 0) {
//			msg = "성공";
//		} else {
//			msg = "실패";
//		}
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("msg", msg);
//		
//		// 3. 목록화면으로 이동하기
//		String redirectUrl = req.getContextPath() + "/pkg/pkgList.do";
//		
//		resp.sendRedirect(redirectUrl);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
