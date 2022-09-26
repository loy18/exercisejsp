package kr.or.ddit.app.acm.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.acm.service.AcommodationServiceImpl;
import kr.or.ddit.app.acm.service.IAcommodationService;
import kr.or.ddit.app.acm.vo.AcommodationVO;

@WebServlet("/acm/AcmDelete.do")
public class DeleteAcommodationController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] acmIds = req.getParameterValues("acmId");
		
		// 1. 서비스 객체 생성하기
		IAcommodationService acmService = AcommodationServiceImpl.getInstance();
		
		// 2. 삭제 처리
		for(String acmId : acmIds) {
		AcommodationVO av = acmService.getAcm(acmId);
		System.out.println(av);
		int cnt = acmService.delete(acmId);
		String msg = "";
		
		if(cnt > 0) {
			msg = "성공";
		} else {
			msg = "실패";
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("msg", msg);
		}
		resp.getWriter().write("OK");
	
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
