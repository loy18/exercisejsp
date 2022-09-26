<%@page import="kr.or.ddit.app.rsv.vo.RsvVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
List<RsvVO> rsvList = (List<RsvVO>) request.getAttribute("rsvList");
String msg = session.getAttribute("msg") == null ? "" : (String) session.getAttribute("msg");
session.removeAttribute("msg"); // 꺼내온 메시지 속성값 삭제하기
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예약 내역</title>

<style>
div {
	border: none;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row mt-4" >
			<div id="category" class="col-2">
				<script src="../customer/category.js"></script>
			</div>

			<div class="col-9 offset-1">

				<div id="table" class="mt-4">
					<table id="table1" class="table">
						<tbody>
							<tr>
								<th style="text-align: center">예약날짜/예약ID</th>
								<th style="text-align: center">패키지명</th>
								<th style="text-align: center">예약수량</th>
								<th style="text-align: center">출발날짜</th>
								<th style="text-align: center">승인날짜</th>
								<th style="text-align: center">예약상태</th>
								<th style="text-align: center">예약취소</th>
							</tr>

							<%
							if(rsvList != null && rsvList.size() != 0){	
								int rsvSize = rsvList.size();
								int number = 0;
								if (rsvSize > 0) {
									for (int i = 0; i < rsvSize; i++) {
								%>
								<tr style="text-align: center;">
									<td><%=rsvList.get(i).getRsvDate().substring(2, 10)%> / <%=rsvList.get(i).getRsvId()%></td>
									<% if(rsvList.get(i).getPkgNm().length() > 25) {%>
									<td><%=rsvList.get(i).getPkgNm().substring(0,25) + "..."%></td>
									<% } else{ %>
									<td><%=rsvList.get(i).getPkgNm()%></td>
									<% } %>
									
									<td><%=rsvList.get(i).getRsvQty()%></td>
									<td><%=rsvList.get(i).getComPkgDay().substring(2, 10)%></td>
									<td><%=rsvList.get(i).getRsvApp().substring(2, 10)%></td>
									<td><%=rsvList.get(i).getRsvStat()%> </td>
	
									<td>
										<form action="<%=request.getContextPath()%>/Delete.do"
											method="post">
											<input type="hidden" name="RsvId"
												value="<%=rsvList.get(i).getRsvId()%>">
											 <input type="submit" class="btn btn-outline-primary" value="취소">
										</form>
									</td>
								</tr>
								<%
									}
								}
							} else {
							%>
								<tr style="text-align: center;">
									<td colspan="7">
										예약된 내역이 없습니다.
									</td>
								</tr>
							<%} %>
						</tbody>
					</table>
					<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
					<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
					<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
				</div>
			</div>
		</div>
	</div>



</body>

</html>
<%@include file="../Footer.jsp"%>
