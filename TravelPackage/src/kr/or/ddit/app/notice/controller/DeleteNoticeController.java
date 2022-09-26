package kr.or.ddit.app.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.notice.service.INoticeService;
import kr.or.ddit.app.notice.service.NoticeServiceImpl;
import kr.or.ddit.app.notice.vo.NoticeVO;

@WebServlet("/notice/delete.do")
public class DeleteNoticeController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] noticeIds = req.getParameterValues("noticeId");
		System.out.println(noticeIds);
		
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		
		for (String ntId : noticeIds) {
			NoticeVO nv = noticeService.getNotice(ntId);
			int cnt = noticeService.removeNotice(ntId);
			String msg = "";
			
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
		HttpSession session = req.getSession();
		session.setAttribute("msg",msg);
	}
		resp.getWriter().write("OK");
		
//		String redirectUrl = req.getContextPath() + "/notice/noticeList.do"; 
//		resp.sendRedirect(redirectUrl);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
