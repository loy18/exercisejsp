<%@page import="kr.or.ddit.app.qna.vo.QnaVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>        
<%
QnaVO qv = (QnaVO) request.getAttribute("qv");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 수정</title>
</head>
<body>
<div class="container">
    <div class="row mt-4">
        <div id="category" class="col-2 b">
        	<script src="/TravelPackage/admin/adminCategory.js"></script>
        </div>
        <div id="content" class="col-9 offset-1 b">
        <form action="qnaUpdate.do" method="post" enctype="multipart/form-data">
       	<input type="hidden" name="qnaNo" value="<%=qv.getQnaNo()%>">
        	<table>
        		<tr>
					<td>작성자 :</td>
					<td><%=qv.getQnaNo()%></td>
				</tr>
        		<tr>
					<td>답변상태</td>
					<td><input type="text" name="qnaState" value="<%=qv.getQnaState()%>"></td>
				</tr>
				<tr>
					<td>제목</td>
					<td><input type="text" name="qnaTitle" value="<%=qv.getQnaTitle()%>"></td>
				</tr>
				<tr>
					<td> 내용</td>
					<td><input type="text" name="qnaCont" value="<%=qv.getQnaCont()%>"></td>
				</tr>
				<tr>
					<td>작성자</td>
					<td><input type="text" name="memMail" value="<%=qv.getMemMail()%>"></td>
				</tr>
        	</table>
				<input type="submit" value="수정">
				<button type="submit" onclick="location='qnaList.jsp'" class="btn btn-outline-primary"  style="float: right">수정</button>
        </form>
		</div>
	</div>
</div>        
</body>
</html>
<%@include file="../Footer.jsp"%>