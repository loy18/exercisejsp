package kr.or.ddit.app.mem.controller;

import java.io.IOException;
import java.security.SecureRandom;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.app.mem.service.IMemService;
import kr.or.ddit.app.mem.service.MemServiceImpl;
import kr.or.ddit.app.mem.vo.MemberVO;

@WebServlet("/ranNumPw.do")
public class RanNumPwController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		StringBuffer temp = new StringBuffer();
		SecureRandom rnd = new SecureRandom();
		for (int i = 0; i < 10; i++) {
			int rIndex = rnd.nextInt(3);
			switch (rIndex) {
			case 0:
				// a-z
				temp.append((char) ((int) (rnd.nextInt(26)) + 97));
				break;
			case 1:
				// A-Z
				temp.append((char) ((int) (rnd.nextInt(26)) + 65));
				break;
			case 2:
				// 0-9
				temp.append((rnd.nextInt(10)));
				break;
			}
		}
		
		String AuthenticationKey = temp.toString();
		System.out.println("임시 비밀번호 : " + AuthenticationKey);
		
		System.out.println("넘어온 아이디 값: " + req.getParameter("memMails"));
		
		
		MemberVO mv = new MemberVO();
		
		mv.setMemMail(req.getParameter("memMails"));
		mv.setMemPw(AuthenticationKey);
		
		IMemService memService = MemServiceImpl.getInstance();
		
		memService.ranNumPw(mv);
		
		String host = "smtp.naver.com";
		String user = "sitead987@naver.com"; // 자신의 네이버 계정
		String password = "minsite1346~!@!";// 자신의 네이버 패스워드

		// 메일 받을 주소
		/* String to_email = m.getEmail(); */
		String to_email = req.getParameter("memMails");

		// SMTP 서버 정보를 설정한다.
		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 465);
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.ssl.enable", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");
		
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
		});

		// email 전송
		try {
			MimeMessage msg = new MimeMessage(session);
			msg.setFrom(new InternetAddress(user, "모두의 여행 관리자"));
			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));

			// 메일 제목
			msg.setSubject("모두의 여행 임시 비밀번호 발송");
			// 메일 내용
			msg.setText("임시 비밀번호는 : " + AuthenticationKey + " 입니다. \n\n고객님의 즐거운 여행을 책임지겠습니다!");

			Transport.send(msg);
			System.out.println("인증메일 전송");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("login/login.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
	
	
}
