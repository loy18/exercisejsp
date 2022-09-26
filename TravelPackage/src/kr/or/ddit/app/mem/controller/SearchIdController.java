package kr.or.ddit.app.mem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;
import kr.or.ddit.app.mem.vo.MemberVO;

@WebServlet("/SearchId.do")
public class SearchIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchIdController() {
		super();
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("서블릿이 호출되었습니다.");
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String memNm = req.getParameter("memNm");
		String memTel = req.getParameter("memTel");
		System.out.println(memNm);
		System.out.println(memTel);

		
		
		MemberVO mv = new MemberVO();
		mv.setMemNm(memNm);
		mv.setMemTel(memTel);

		IMemService memservice = MemServiceImpl.getInstance();

		MemberVO rs = memservice.searchId(mv);

		if (memNm.equals(rs.getMemNm()) && memTel.equals(rs.getMemTel())) {
			resp.getWriter().write(rs.getMemMail());
		} else {
			resp.getWriter().write("등록하신 아이디가 없습니다.");

		}
		//doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
}
