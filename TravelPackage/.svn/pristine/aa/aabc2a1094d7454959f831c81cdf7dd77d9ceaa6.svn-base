package kr.or.ddit.app.review.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.review.service.IReviewService;
import kr.or.ddit.app.review.service.ReviewServiceImpl;
import kr.or.ddit.app.review.vo.ReviewVO;

@WebServlet("/review/reviewDelete.do")
public class DeleteReviewController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] reviewIds = req.getParameterValues("reviewId");
		
		IReviewService reviewService = ReviewServiceImpl.getInstance();
		
		for(String reviewId : reviewIds) {
			ReviewVO rv = reviewService.getReview(reviewId);
			int cnt = reviewService.removeReview(reviewId);
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
		
//		String redirectUrl = req.getContextPath() + "/review/reviewList.do";
//		resp.sendRedirect(redirectUrl);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
