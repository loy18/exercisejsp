<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	PkgVO pv = (PkgVO)request.getAttribute("pv");
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>판매 등록</title>

</head>

<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<script src="../admin/category.js"></script>
			</div>

			<div class="col-9 offset-1">
				<form action="comPkgInsert.do" method="post"
					enctype="multipart/form-data">
					<input type="hidden" name="pkgId" value="<%=pv.getPkgId()%>">
					<table class="table table-hover">
						<tr>
							<th>패키지명</th>
							<td><input  type="text" value="<%=pv.getPkgNm()%>" disabled="disabled"></td>
						</tr>
						<tr>
							<th>출발날짜</th>
							<td><input type="date" name="comPkgDay" value=""></td>
						</tr>
						<tr>
							<th>작성자</th>
							<td><input type="text" name="comPkgWrt" value=""></td>
						</tr>
					</table>
					<div width="100%" class="text-end">
						<input type="submit" class="btn btn-outline-primary" value="판매등록">
					</div>
				</form>
			</div>
		</div>
	</div>
</body>

</html>
<%@include file="../Footer.jsp"%>