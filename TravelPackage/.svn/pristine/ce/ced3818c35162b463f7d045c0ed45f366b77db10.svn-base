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

@WebServlet("/infoIdPwCheck.do")
public class InfoIdPwCheckController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String memMail = req.getParameter("memId");
		String memPw = req.getParameter("memPw");
		
//		System.out.println(memMail);
//		System.out.println(memPw);
		
		String newPw = getEncrypt(memPw);
		
//		System.out.println(newPw);
		
		MemberVO mv = new MemberVO();
		
		mv.setMemMail(memMail);
		
		IMemService memService = MemServiceImpl.getInstance();
		
		String rs = memService.changeInfoCheck(memMail);
		
		if(rs.equals(newPw)) {
			resp.getWriter().write("OK");
		}
		
//		System.out.println(rs);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
		
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
