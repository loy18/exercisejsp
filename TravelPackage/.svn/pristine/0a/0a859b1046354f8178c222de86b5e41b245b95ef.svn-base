package kr.or.ddit.app.qna.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;
import kr.or.ddit.app.qnaans.service.IQnaAnsService;
import kr.or.ddit.app.qnaans.service.QnaAnsServiceImpl;
import kr.or.ddit.app.qnaans.vo.QnaAnsVO;

@WebServlet("/qna/qnaDetail.do")
public class DetailQnaController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Get 처리 시작");
		
		String qnaNo = req.getParameter("qnaNo");
		
		System.out.println("겟 파라미터 글번호 : " + qnaNo);
		
		IQnaService qnaService = QnaServiceImpl.getInstance();
		QnaVO qnaVO = qnaService.getQna(qnaNo);
		
		req.setAttribute("qnaVO", qnaVO);
		
		// 댓글리스트
		IQnaAnsService qnsService = QnaAnsServiceImpl.getInstance();
		QnaAnsVO qnsv = new QnaAnsVO();
		
		qnsv.setQnaAnsId(qnaNo);
		
		System.out.println("댓글을 달 글번호 : " + qnsv.getQnaAnsId());
		
		System.out.println("QnaNo:" + qnaNo);
		QnaAnsVO qnsvo = qnsService.getQnaAns(qnaNo);
		System.out.println("qnaAns객체: " + qnsvo);
		
		req.setAttribute("qnaAnsVO", qnsvo);
		//
		req.getRequestDispatcher("/qna/qnaDetail.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doGet(req, resp);
		
		System.out.println("post 처리 시작!");
		
		String qnaAnsId = req.getParameter("qnaAnsId");
		String qnaAnsTitle = req.getParameter("qnaAnsTitle");
		String qnaAnsCont = req.getParameter("qnaAnsCont");
		String qnaAnsWrt = req.getParameter("qnaAnsWrt");
		
		IQnaAnsService qnsService = QnaAnsServiceImpl.getInstance();
		QnaAnsVO  qnsv = new QnaAnsVO();
		
		//
		String qnaState = req.getParameter("qnaState");
		IQnaService qnaService = QnaServiceImpl.getInstance();
		QnaVO qv = qnaService.getQna(qnaAnsId);
		qv.setQnaState(qnaState);
		qnaService.modifyQna(qv);
		//
		
		qnsv.setQnaAnsId(qnaAnsId);
		qnsv.setQnaAnsTitle(qnaAnsTitle);
		qnsv.setQnaAnsCont(qnaAnsCont);
		qnsv.setQnaAnsWrt(qnaAnsWrt);
		
		System.out.println("부모키로받아온 댓글을 달 글번호 : " + qnsv.getQnaAnsId());
		
		int cnt = qnsService.registerQnaAns(qnsv);
		
		String msg = "";
		
		if(cnt > 0) {
			//성공
			msg = "success";
		}else {
			// 실패
			msg = "fail";
		}
		
		HttpSession session = req.getSession();
		session.setAttribute("msg", msg);
		
		resp.getWriter().write(msg);

		
	}
	
}
