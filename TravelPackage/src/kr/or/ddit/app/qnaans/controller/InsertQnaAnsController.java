package kr.or.ddit.app.qnaans.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.qnaans.service.IQnaAnsService;
import kr.or.ddit.app.qnaans.service.QnaAnsServiceImpl;
import kr.or.ddit.app.qnaans.vo.QnaAnsVO;



@MultipartConfig
@WebServlet("/qns/qnsInsert.do")
public class InsertQnaAnsController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/qns/qnsInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String qnaAnsId = req.getParameter("qnaAnsId");
		String qnaAnsTitle = req.getParameter("qnaAnsTitle");
		String qnaAnsCont = req.getParameter("qnaAnsCont");
		String qnaAnsWrt = req.getParameter("qnaAnsWrt");
		
		IQnaAnsService qstService = QnaAnsServiceImpl.getInstance();
		
		
		QnaAnsVO qnsv = new QnaAnsVO(); 
		qnsv.setQnaAnsId(qnaAnsId);
		qnsv.setQnaAnsTitle(qnaAnsTitle);
		qnsv.setQnaAnsCont(qnaAnsCont);
		qnsv.setQnaAnsWrt(qnaAnsWrt);
		
	    int cnt = qstService.registerQnaAns(qnsv);
		
		String msg = "";
		if(cnt > 0) {
			// 성공
			msg = "성공";
		} else {
			// 실패
			msg = "실패";
		}
		
		
		String redirectUrl = req.getContextPath() + "/qna/qnaDetail.do";
		resp.sendRedirect(redirectUrl);
	}
	
}
