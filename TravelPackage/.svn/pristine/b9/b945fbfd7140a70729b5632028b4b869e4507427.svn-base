<%@page import="kr.or.ddit.app.tour.vo.TourVO"%>
<%@page import="kr.or.ddit.app.vehc.vo.VehcVO"%>
<%@page import="kr.or.ddit.app.notice.vo.NoticeVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>

<%
	List<VehcVO> vehcList = (List<VehcVO>) request.getAttribute("adminList");
	List<NoticeVO> noticeList = (List<NoticeVO>) request.getAttribute("noticeList");
	List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("memberList");
%>

<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<script src="../admin/category.js"></script>
			</div>

			<div class="col-9 offset-1">




				<div class="col-12">
					<h3>상품관리</h3>
					<hr>
				</div>
				<div class="card-body">
					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">ID</th>
								<th scope="col">교통수단 회사명</th>
								<th scope="col">구분</th>
								<th scope="col">교통수단명</th>
								<th scope="col">가격</th>
							</tr>
						</thead>
						<%
							int vehcSize = vehcList.size() >= 4 ? 4 : vehcList.size();
							for (int i = 0; i < vehcSize; i++) {
						%>
						<tr>
							<td><%=vehcList.get(i).getVehcId()%></td>
							<td><%=vehcList.get(i).getVehcComp()%></td>
							<td><%=vehcList.get(i).getVehcSe()%></td>
							<td><%=vehcList.get(i).getVehcNm()%></td>
							<td><%=vehcList.get(i).getVehcdp()%></td>
						</tr>
						<%
							}
						%>
						
					</table>
					<a href="/TravelPackage/pkg/pkgList.do"
						class="btn btn-outline-info text-dark">목록으로</a> <br>
				</div>
				<br>

				<div class="col-12">
					<h3>고객센터 관리</h3>
					<hr>
				</div>
				<div class="card-body">

					<table class="table table-hover">
						<thead>
							<tr>
								<th scope="col">글번호</th>
								<th scope="col">제목</th>
								<th scope="col"></th>
								<th scope="col">작성일</th>
							</tr>
						</thead>
						<%
							int notice = noticeList.size() >= 4 ? 4 : noticeList.size();
							for (int i = 0; i < notice; i++) {
						%>
						<tr>
							<td><%=noticeList.get(i).getNoticeId()%></td>
							<td><%=noticeList.get(i).getNoticeTitle()%></td>
							<td></td>
							<td><%=noticeList.get(i).getNoticeRd()%></td>
						</tr>
						<%
							}
						%>
					</table>


					<a href="/TravelPackage/admin/adminNotice.do"
						class="btn btn-outline-info text-dark">목록으로</a>
				</div>
				<br>
				<!--  -->
				
				<div class="col-12">
					<h3>회원관리 </h3>
					<hr>
				</div>
				<div class="card-body">

					<table class="table table-hover">
						<thead>
							<tr>
							<th scope="col">ID</th>
							<th scope="col">이름</th>
							<th scope="col">전화번호</th>
							<th scope="col"></th>
							<th scope="col">주소</th>
						</thead>
						<%
							int mem = memberList.size() >= 4 ? 4 : memberList.size();
							for (int i = 0; i < mem; i++) {
						%>
						<tr>
						<td><%=memberList.get(i).getMemMail()%></td>
						<td><%=memberList.get(i).getMemNm() %></td>
						<td><%=memberList.get(i).getMemTel() %></td>
							<td></td>
							<td><%=memberList.get(i).getMemAddr() %></td>
						</tr>
						<%
							}
						%>
					</table>


					<a href="/TravelPackage/mem/memberList.do"
						class="btn btn-outline-info text-dark">목록으로</a>
				</div>
				<br>
				<!--  -->
			</div>
		</div>
	</div>



</body>

</html>
<%@include file="../Footer.jsp"%>