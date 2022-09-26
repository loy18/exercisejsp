package kr.or.ddit.app.qna.controller;

import java.io.IOException;  
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;
import kr.or.ddit.app.mem.vo.MemberVO;
import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;


@MultipartConfig
@WebServlet("/qna/qnaInsert.do")
public class InsertQnaController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/qna/qnaInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String qnaNo = req.getParameter("qnaNo");
		String qnaTitle = req.getParameter("qnaTitle");
		String qnaCont = req.getParameter("qnaCont");
		String qnaState = req.getParameter("qnaState");
//		String memMail = (String)req.getSession().getAttribute("id");
		String memMail = req.getParameter("memMail");
		
		IQnaService qtService = QnaServiceImpl.getInstance();
		
		
		QnaVO qv = new QnaVO();
		qv.setQnaNo(qnaNo);
		qv.setQnaTitle(qnaTitle);
		qv.setQnaCont(qnaCont);
		qv.setQnaState(qnaState);
		qv.setMemMail(memMail);
		
		
	    int cnt = qtService.registerQna(qv);
		
		String msg = "";
		if(cnt > 0) {
			// 성공
			msg = "성공";
		} else {
			// 실패
			msg = "실패";
		}
		
		
		String redirectUrl = req.getContextPath() + "/qna/qnaList.do";
		resp.sendRedirect(redirectUrl);
	}
	
}
