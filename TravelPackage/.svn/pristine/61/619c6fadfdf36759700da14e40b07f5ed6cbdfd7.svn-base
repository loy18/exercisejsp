package kr.or.ddit.app.tour.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.tour.service.ITourService;
import kr.or.ddit.app.tour.service.TourServiceImpl;
import kr.or.ddit.app.tour.vo.TourVO;


@WebServlet("/tour/tourDelete.do")
public class DeleteTourController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] tourIds = req.getParameterValues("tourId");
		
		// 1. 서비스 객체 생성하기
		ITourService tourService = TourServiceImpl.getInstance();
		
		// 2. 삭제 처리
		for(String tourId : tourIds) {
			TourVO tv = tourService.getTour(tourId);
			int cnt = tourService.removeTour(tourId);	
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
		
		
//		// 3. 목록화면으로 이동하기
//		String redirectUrl = req.getContextPath() + "/tour/tourList.do";
//		
//		resp.sendRedirect(redirectUrl);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
