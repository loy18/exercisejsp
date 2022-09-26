package kr.or.ddit.app.rsv.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.app.compkg.service.ComPkgServiceImpl;
import kr.or.ddit.app.compkg.service.IComPkgService;
import kr.or.ddit.app.compkg.vo.ComPkgVO;
import kr.or.ddit.app.mem.vo.MemberVO;
import kr.or.ddit.app.rsv.service.IRsvService;
import kr.or.ddit.app.rsv.service.RsvServiceImpl;
import kr.or.ddit.app.rsv.vo.RsvVO;

@WebServlet("/rsv/rsvInsert.do")
public class InsertController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		IRsvService service = RsvServiceImpl.getInstance();
		HttpSession session = req.getSession();
		String rsvQty = req.getParameter("rsvQty");
		String comPkgDay = req.getParameter("comPkgDay");
		String pkgId = req.getParameter("pkgId");
		String memMail = (String) session.getAttribute("id");
		
		
		
		
		ComPkgVO cpv = new ComPkgVO();
		cpv.setComPkgDay(comPkgDay);
		cpv.setPkgId(pkgId);
		
		String comPkgId = service.getComPkgId(cpv);
		
		
		
		RsvVO rv = new RsvVO();
		rv.setRsvQty(rsvQty);
		rv.setMemMail(memMail);
		rv.setComPkgId(comPkgId);
		
		service.registerRsv(rv);
		
		req.getRequestDispatcher("/customer/rsv.do").forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
