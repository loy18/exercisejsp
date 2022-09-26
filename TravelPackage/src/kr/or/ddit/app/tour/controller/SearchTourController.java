package kr.or.ddit.app.tour.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.tour.service.TourServiceImpl;
import kr.or.ddit.app.tour.service.ITourService;
import kr.or.ddit.app.tour.vo.TourVO;

@WebServlet("/tour/tourSearch.do")
public class SearchTourController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sch = req.getParameter("search");
		// 1. 서비스 객체 생성하기
		ITourService tourService = TourServiceImpl.getInstance();
		
		// 2. 회원목록 조회
		List<TourVO> tourList = tourService.searchList(sch);
		req.setAttribute("tourList", tourList);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/tour/tourSearch.jsp");
		
		dispatcher.forward(req, resp); // 뷰 페이지로 전달
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
