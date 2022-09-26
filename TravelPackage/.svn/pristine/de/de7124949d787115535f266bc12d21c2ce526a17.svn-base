package kr.or.ddit.app.rsv.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.rsv.service.IRsvService;
import kr.or.ddit.app.rsv.service.RsvServiceImpl;
import kr.or.ddit.app.rsv.vo.RsvVO;

@WebServlet("/admin/adminRsv.do")
public class adminController extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IRsvService rsvService = RsvServiceImpl.getInstance();
		
		List<RsvVO> rsvList = rsvService.getAllRsvList();
		req.setAttribute("rsvList", rsvList);
		
		for(int i =0; i< rsvList.size(); i++) {
			
			System.out.println(rsvList.get(i).getRsvDate().substring(2, 10) + rsvList.get(i).getRsvId());
			System.out.println(rsvList.get(i).getPkgNm());
			System.out.println(rsvList.get(i).getRsvQty());
			System.out.println(rsvList.get(i).getComPkgDay().substring(2, 10));
			System.out.println(rsvList.get(i).getRsvApp().substring(2, 10));
			System.out.println(rsvList.get(i).getRsvStat());
			System.out.println("===============================================================================");
		}
		
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("adminRsv.jsp");

		dispatcher.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
