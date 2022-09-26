package kr.or.ddit.app.mem.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;
import kr.or.ddit.app.mem.vo.MemberVO;

@WebServlet("/changeMemInfo.do")
public class ChangeMemInfoController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		doPost(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String memId = req.getParameter("memMail");
		String newPw = req.getParameter("newPw");
		String memNm = req.getParameter("memNm");
		String memTel = req.getParameter("memTel");
		String memAddr = req.getParameter("memAddr");
		String memPreReg = req.getParameter("memPreReg");
		
		System.out.println(memId);
		System.out.println(newPw);
		System.out.println(memAddr);
		String newPwCer = getEncrypt(newPw);
		
		MemberVO mv = new MemberVO();
		
		mv.setMemMail(memId);
		mv.setMemPw(newPwCer);
		mv.setMemNm(memNm);
		mv.setMemTel(memTel);
		mv.setMemAddr(memAddr);
		mv.setMemPreReg(memPreReg);
		
		IMemService memService = MemServiceImpl.getInstance();
		
		int rs = memService.updateMember(mv);
		
		if(rs > 0) {
			resp.getWriter().write("OK");
		}else {
			resp.getWriter().write("NO");
		}
		
//		req.getRequestDispatcher("index.jsp").forward(req, resp);
	
	}
	
	public String getEncrypt(String pwd) {

		String result = "";

		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");

			md.update(pwd.getBytes("UTF-8"));

			byte[] nPwd = md.digest();

			StringBuffer sb = new StringBuffer();
			for (byte b : nPwd) {
				sb.append(String.format("%02x", b));
			}

			result = sb.toString();

//			System.out.println("암호화 적용 후 pw : " + result);

		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		return result;
	}
	
	
	
}
