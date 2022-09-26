package kr.or.ddit.app.vehc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.vehc.service.IVehcService;
import kr.or.ddit.app.vehc.service.VehcServiceImpl;
import kr.or.ddit.app.vehc.vo.VehcVO;

@WebServlet("/vehc/delete2.do")
public class DeleteVehcController2 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String vehcId = req.getParameter("vehcId");
		
		IVehcService vehcService = VehcServiceImpl.getInstance();
		
			int cnt = vehcService.removeVehc(vehcId);
		
			String msg = "";
			
			if(cnt > 0) {
				msg = "성공";
			} else {
				msg = "실패";
			}
			
			HttpSession session = req.getSession();
			session.setAttribute("msg", msg);		
			
		
		String redirectUrl = req.getContextPath() + "/vehc/vehcList.do"; 
		resp.sendRedirect(redirectUrl);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
