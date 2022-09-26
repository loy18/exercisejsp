package kr.or.ddit.app.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;

@WebServlet("/mem/delMem.do")
public class DeleteMemController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String memMail = req.getParameter("memMail");
	
		IMemService memService = MemServiceImpl.getInstance();
		
		int cnt = memService.delMem(memMail);
		
		System.out.println("삭제된 아이디 : " + memMail);
		
		if(cnt > 0) {
			resp.getWriter().write("OK");
		}else {
			resp.getWriter().write("NO");
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	
	}
	
}
