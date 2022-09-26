package kr.or.ddit.app.mem.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;

@WebServlet("/mem/memDelete.do")
public class MemberDeleteController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String[] memMails = req.getParameterValues("memMail");
		
		IMemService memService = MemServiceImpl.getInstance();
		
		for(String memMail : memMails) {
			int cnt = memService.deleteMem(memMail);
			
			if(cnt > 0) {
				System.out.println("회원이 삭제되었습니다.");
				resp.getWriter().write("OK");
			}else {
				resp.getWriter().write("NO");
			}
			
		}
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	
	}
}
