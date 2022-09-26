package kr.or.ddit.app.qna.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.qna.service.IQnaService;
import kr.or.ddit.app.qna.service.QnaServiceImpl;
import kr.or.ddit.app.qna.vo.QnaVO;
import kr.or.ddit.app.mem.vo.MemberVO;
import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;

@WebServlet("/qna/qnaList.do")
public class ListQnaController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IQnaService qnaService = QnaServiceImpl.getInstance();
		
		String id = (String)req.getSession().getAttribute("id");
		//관리자면 올리스트
		if( id.equals("admin")) {
			List<QnaVO> qnaAllList = qnaService.getAllQnaList();
			req.setAttribute("qnaAllList", qnaAllList);
			
		//회원이면 본인리스트
		} else {
//			String memMail = (String) req.getSession().getAttribute("id");
			String memMail = id;
			List<QnaVO> qnaEachList = qnaService.getEachQnaList(memMail);
			req.setAttribute("qnaEachList", qnaEachList);
			
		}
//		System.out.println("현재 로그인 된 아이디 :" +  req.getSession().getAttribute("id"));
//		String memMail = (String) req.getSession().getAttribute("id");
//		System.out.println(memMail);
		
//		List<QnaVO> qnaList = qnaService.getEachQnaList(memMail);
//		List<QnaVO> qnaAllList = qnaService.getAllQnaList();
//		req.setAttribute("qnaEachList", qnaList);
//		req.setAttribute("qnaAllList", qnaAllList);
		
		RequestDispatcher dispatcher=
				req.getRequestDispatcher("/qna/qnaList.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
