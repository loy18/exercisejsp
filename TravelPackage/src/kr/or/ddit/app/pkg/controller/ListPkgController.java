package kr.or.ddit.app.pkg.controller;

import java.io.IOException;   
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.pkg.service.IPkgService;
import kr.or.ddit.app.pkg.service.PkgServiceImpl;
import kr.or.ddit.app.pkg.vo.PkgVO;


@WebServlet(value = "/pkg/pkgList.do")
public class ListPkgController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. 서비스 객체 생성하기
		IPkgService pkgService = PkgServiceImpl.getInstance();
		
		// 2. 회원목록 조회
		List<PkgVO> pkgList = pkgService.getAllPkgList();
		req.setAttribute("pkgList", pkgList);
		
		RequestDispatcher dispatcher = 
				req.getRequestDispatcher("/pkg/pkgList.jsp");
		
		dispatcher.forward(req, resp); // 뷰 페이지로 전달
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
