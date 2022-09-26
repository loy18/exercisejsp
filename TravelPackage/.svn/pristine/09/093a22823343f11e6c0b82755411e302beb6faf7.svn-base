package kr.or.ddit.app.compkg.controller;

import java.io.IOException; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.compkg.service.IComPkgService;
import kr.or.ddit.app.compkg.service.ComPkgServiceImpl;
import kr.or.ddit.app.compkg.vo.ComPkgVO;


@WebServlet("/compkg/comPkgDelete.do")
public class DeleteComPkgController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String[] comPkgIds = req.getParameterValues("comPkgId");
		String pkgId = req.getParameter("pkgId");
		
		// 1. 서비스 객체 생성하기
		IComPkgService comPkgService = ComPkgServiceImpl.getInstance();
		
		// 2. 삭제 처리
		for(String comPkgId : comPkgIds) {
			ComPkgVO cpv = new ComPkgVO();
			cpv.setComPkgId(comPkgId);
			int cnt = comPkgService.removeComPkg(cpv);	
			
		}
		
		
		// 3. 목록화면으로 이동하기
		String redirectUrl = req.getContextPath() + "/pkg/pkgDetail.do?pkgId=" + pkgId;
		
		resp.sendRedirect(redirectUrl);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
