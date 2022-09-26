package kr.or.ddit.app.rsv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.rsv.service.IRsvService;
import kr.or.ddit.app.rsv.service.RsvServiceImpl;
import kr.or.ddit.app.rsv.vo.RsvVO;

@WebServlet("/Update.do")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String rsvId = req.getParameter("RsvId");
		String yon = req.getParameter("yon");

		IRsvService service = RsvServiceImpl.getInstance();

		RsvVO rv = new RsvVO();
		rv.setRsvId(rsvId);

		if (yon.equals("확정")) {
			service.modifyRsv(rv);
		} else {
			service.modifyRsv2(rv);
		}
		
		String redirectUrl = req.getContextPath() + "/admin/adminRsv.do"; 
		resp.sendRedirect(redirectUrl);
	}

}
