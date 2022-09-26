package kr.or.ddit.app.mem.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;
import kr.or.ddit.app.mem.vo.MemberVO;

@WebServlet("/mem/memberList.do")
public class MemberListController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IMemService memService = MemServiceImpl.getInstance();
		
		List<MemberVO> memberList = memService.memberList();
		
		req.setAttribute("memberList", memberList);
		
		req.getRequestDispatcher("/admin/adminMemManagement.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doGet(req, resp);
	
	}
	
}
