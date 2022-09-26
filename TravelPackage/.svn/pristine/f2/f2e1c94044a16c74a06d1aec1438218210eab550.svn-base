package kr.or.ddit.app.rsv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.rsv.service.IRsvService;
import kr.or.ddit.app.rsv.service.RsvServiceImpl;
import kr.or.ddit.app.rsv.vo.RsvVO;

@WebServlet("/Delete.do")
public class DeleteController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IRsvService rsvService = RsvServiceImpl.getInstance();

		String a = req.getParameter("RsvId");
		System.out.println(a);

		RsvVO rv = new RsvVO();

		rsvService.removeRsv(a);

		String redirectUrl = req.getContextPath() + "/customer/rsv.do";

		resp.sendRedirect(redirectUrl);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
