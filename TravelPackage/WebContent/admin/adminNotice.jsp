<%@page import="kr.or.ddit.app.notice.vo.NoticeVO"%>
<%@page import="kr.or.ddit.app.qna.vo.QnaVO"%>
<%@ page import="kr.or.ddit.app.mem.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
List<QnaVO> qnaAllList = (List<QnaVO>) request.getAttribute("qnaAllList");
List<NoticeVO> noticeList = (List<NoticeVO>) request.getAttribute("noticeList");

String msg = session.getAttribute("msg") == null ? "" : (String) session.getAttribute("msg");
session.removeAttribute("msg"); // 꺼내온 메시지 속성값 삭제하기
%>
<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
<head>
<meta charset="UTF-8">
<title>고객센터 관리</title>
</head>

<body>
	<div class="container">
		<div class="row mt-4 ">
			<div id="category" class="col-2 ">
				<script src="../admin/category.js"></script>
			</div>
			<div class="col-9 offset-1 ">
			
			
            <div class=" col-12">
              <h3>공지사항</h3>
              <hr>
            </div>
              <div class="card-body">
              	<table class="table table-hover">
              		<tr>
						<th scope="col">글번호</th>
						<th scope="col">글제목</th>
						<th scope="col"></th>
						<th scope="col">작성일</th>
					</tr>
					<%
					int noticeSize = noticeList.size();
					if (noticeSize > 0) {
						for (int i = 0; i < noticeSize; i++) {
						%>
						<tr>
						<td><%=noticeList.get(i).getNoticeId()%></td>
						<td><a
							href="../notice/noticeDetail.do?noticeId=<%=noticeList.get(i).getNoticeId()%>"><%=noticeList.get(i).getNoticeTitle()%>
						</a></td>
						<td></td>
						<td><%=noticeList.get(i).getNoticeRd()%></td>

					</tr>
					<% 
						}
					} else {
					%>
					<tr>
						<td colspan="6">=정보가 없습니다.</td>
					</tr>
					<%
					}
					
					%>
                </table>
                <a href="/TravelPackage/notice/noticeList.do" class="btn btn-outline-primary">목록으로</a>
              </div>
          <br>
          
          		
            <div class=" col-12">
              <h3>1:1문의 내역</h3>
              <hr>
            </div>
              <div class="card-body">
              	<table class="table table-hover">
              		<tr>
						<th scope="col">글번호</th>
						<th scope="col">글제목</th>
						<th></th>
						<th scope="col">작성자</th>
						<th scope="col"></th>
						<th scope="col">작성일</th>
					</tr>
					<%
					
						int qnaAllSize = qnaAllList.size();
						if (qnaAllSize > 0) {
							for (int i = 0; i < qnaAllSize; i++) {
						%>
					<tr>
						<td><%=qnaAllList.get(i).getQnaNo()%></td>
						<td><a
							href="../qna/qnaDetail.do?qnaNo=<%=qnaAllList.get(i).getQnaNo()%>"><%=qnaAllList.get(i).getQnaTitle()%>
						</a></td>
						<td></td>
						<td><%=qnaAllList.get(i).getMemMail()%></td>
						<td></td>
						<td><%=qnaAllList.get(i).getQnaDate()%></td>

					</tr>
						<%
						}
					} else {
					%>
					<tr>
						<td colspan="6"> 정보가 없습니다.</td>
					</tr>
					<%
					}
						
						
					%>
					
                </table>
                <a href="/TravelPackage/qna/qnaList.do" class="btn btn-outline-primary">목록으로</a>
              </div>
          
          
			</div>
		</div>
	</div>
	
</body>

</html>
<%@include file="../Footer.jsp"%>