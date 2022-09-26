package kr.or.ddit.app.vehc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.vehc.service.VehcServiceImpl;
import kr.or.ddit.app.vehc.service.IVehcService;
import kr.or.ddit.app.vehc.vo.VehcVO;

@WebServlet("/vehc/vehcSearch.do")
public class SearchVehcController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sch = req.getParameter("search");
		// 1. 서비스 객체 생성하기
		IVehcService vehcService = VehcServiceImpl.getInstance();
		
		// 2. 회원목록 조회
		List<VehcVO> vehcList = vehcService.search(sch);
		req.setAttribute("vehcList", vehcList);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/vehc/vehcSearch.jsp");
		
		dispatcher.forward(req, resp); // 뷰 페이지로 전달
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
