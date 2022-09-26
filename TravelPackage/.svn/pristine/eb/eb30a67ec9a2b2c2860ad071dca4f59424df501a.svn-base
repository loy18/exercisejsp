package kr.or.ddit.app.basic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.review.service.IReviewService;
import kr.or.ddit.app.review.service.ReviewServiceImpl;
import kr.or.ddit.app.review.vo.ReviewVO;


@WebServlet("/detailPage.do")
public class ListDetailPageController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");

		IReviewService reviewService = ReviewServiceImpl.getInstance();

		List<ReviewVO> reviewList = reviewService.getAllReviewList();
		req.setAttribute("reviewList", reviewList);

		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/detailPage.jsp");
		
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
