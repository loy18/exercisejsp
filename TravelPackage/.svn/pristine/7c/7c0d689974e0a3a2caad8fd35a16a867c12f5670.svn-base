package kr.or.ddit.app.pkg.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.compkg.service.ComPkgServiceImpl;
import kr.or.ddit.app.compkg.service.IComPkgService;
import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.rsv.service.IRsvService;
import kr.or.ddit.app.rsv.service.RsvServiceImpl;
import kr.or.ddit.app.rsv.vo.RsvVO;

/**
 * Servlet implementation class UpdatePkg222
 */
@WebServlet("/Update2.do")
public class UpdatePkg222 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String compkg = req.getParameter("compkg");
		String yon = req.getParameter("yon");
		String pkgId = req.getParameter("pkgId");
		System.out.println(compkg);
		System.out.println(yon);
		System.out.println(pkgId);
		IRsvService service = RsvServiceImpl.getInstance();
		IComPkgService comser = ComPkgServiceImpl.getInstance();

		RsvVO rv = new RsvVO();
		rv.setComPkgId(compkg);

		if (yon.equals("확정")) {
			service.modifyRsv(rv);
		} else {
			service.modifyRsv2(rv);
		}
		List<ComPkgVO> cpv = comser.getComPkgList(pkgId);

		req.setAttribute("comPkgList", cpv);

		System.out.println(cpv.toString());

		String redirectUrl = req.getContextPath() + "/pkg/pkgDetail.do?pkgId=" + pkgId;
		resp.sendRedirect(redirectUrl);

//		req.getRequestDispatcher("/pkg/pkgDetail.do?pkgId="+ pkgId).forward(req, resp);
	}

}
