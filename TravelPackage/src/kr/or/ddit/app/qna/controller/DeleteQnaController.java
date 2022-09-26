package kr.or.ddit.app.qna.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;

@WebServlet("/qna/delete.do")
public class DeleteQnaController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] qnaNos = req.getParameterValues("qnaNo");
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		for (String qtNo : qnaNos) {
			QnaVO qv = qnaService.getQna(qtNo);
			int cnt = qnaService.removeQna(qtNo);
			String msg = "";
			
			if(cnt > 0) {
				msg = "성공";
			}else {
				msg = "실패";
			}
		HttpSession session = req.getSession();
		session.setAttribute("msg",msg);
	}
//		resp.getWriter().write("OK");
		
		String redirectUrl = req.getContextPath() + "/qna/qnaList.do"; 
		resp.sendRedirect(redirectUrl);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
