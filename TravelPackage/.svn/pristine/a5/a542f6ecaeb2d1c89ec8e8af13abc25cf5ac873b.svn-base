package kr.or.ddit.app.acm.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.acm.service.AcommodationServiceImpl;
import kr.or.ddit.app.acm.service.IAcommodationService;
import kr.or.ddit.app.acm.vo.AcommodationVO;

@WebServlet("/acm/AcmSearch.do")
public class SearchAcommodationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sch = req.getParameter("search");
		// 1. 서비스 객체 생성하기
		IAcommodationService acmService = AcommodationServiceImpl.getInstance();
		
		// 2. 회원목록 조회
		List<AcommodationVO> acmList = acmService.search(sch);
		req.setAttribute("acmList", acmList);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/acm/AcmSearch.jsp");
		
		dispatcher.forward(req, resp); // 뷰 페이지로 전달
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
