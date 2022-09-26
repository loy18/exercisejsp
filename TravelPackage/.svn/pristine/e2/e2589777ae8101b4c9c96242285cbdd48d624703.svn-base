package kr.or.ddit.app.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;

@MultipartConfig
@WebServlet("/qna/qnaUpdate.do")
public class UpdateQnaController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String qnaNo = req.getParameter("qnaNo");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		QnaVO qv = qnaService.getQna(qnaNo);
		
		req.setAttribute("qv", qv);
		
		req.getRequestDispatcher("/qna/qnaUpdate.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String qnaNo = req.getParameter("qnaNo");
		String qnaTitle = req.getParameter("qnaTitle");
		String qnaCont = req.getParameter("qnaCont");
		String qnaState = req.getParameter("qnaState");
		String memMail = req.getParameter("memMail");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		QnaVO qv = new QnaVO();
		qv.setQnaNo(qnaNo);
		qv.setQnaTitle(qnaTitle);
		qv.setQnaCont(qnaCont);
		qv.setQnaState(qnaState);
		qv.setMemMail(memMail);
		
		int cnt = qnaService.modifyQna(qv);
		
		String redirectUrl = req.getContextPath() + "/qna/qnaList.do"; 
		resp.sendRedirect(redirectUrl);
		
	}

}














