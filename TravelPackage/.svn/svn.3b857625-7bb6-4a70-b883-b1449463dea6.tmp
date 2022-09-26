package kr.or.ddit.app.basic.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.notice.service.INoticeService;
import kr.or.ddit.app.notice.service.NoticeServiceImpl;
import kr.or.ddit.app.notice.vo.NoticeVO;
import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;

@WebServlet("/admin/adminNotice.do")
public class ListAdminNoticeController extends HttpServlet {
/**
 * 
 * 관리자는 그냥 다 보여주고 페이지 접근에서 제한거는 걸로 일단 생각함
 */
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		INoticeService noticeService = NoticeServiceImpl.getInstance();
		IQnaService qnaService = QnaServiceImpl.getInstance();

		String noticeId = req.getParameter("noticeId");
		List<NoticeVO> noticeList = noticeService.getAllNoticeList();
		req.setAttribute("noticeList", noticeList);

//		String id = (String) req.getSession().getAttribute("id");

		List<QnaVO> qnaAllList = qnaService.getAllQnaList();
		req.setAttribute("qnaAllList", qnaAllList);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/admin/adminNotice.jsp");

		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
