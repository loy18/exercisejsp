<%@page import="kr.or.ddit.app.notice.vo.NoticeVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	NoticeVO nv = (NoticeVO) request.getAttribute("noticeVo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2 ">
				<script src="./category.js"></script>
			</div>
			<div id="content" class="col-9 offset-1 ">
			<h1>공지사항 상세</h1>
				<hr>
				<table class="table table-hover">
					<tr>
						<td>구분</td>
						<td><%=nv.getNoticeSe()%></td>
					</tr>
					<tr>
						<td>제목</td>
						<td><%=nv.getNoticeTitle()%></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><%=nv.getNoticeCont()%></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td><%=nv.getNoticeWrt()%></td>
				</table>
				<div class="btn-group" role="group" aria-label="Basic radio toggle button group" style="float: right">
					<button onclick="location.href = 'noticeList.do'" class="btn btn-outline-primary" >목록</button> 
					<button onclick="location.href = 'noticeUpdate.do?noticeId=<%=nv.getNoticeId()%>'" class="btn btn-outline-primary" >수정</button> 
					<button onclick="location.href = 'delete2.do?noticeId=<%=nv.getNoticeId()%>'" class="btn btn-outline-primary"  >삭제</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
<%@include file="../Footer.jsp"%>