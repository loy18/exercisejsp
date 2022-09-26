<!-- 지우고 IMPORT 삽입 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<!-- 지우고 본문상단 삽입 -->
<!-- 지우고 본문상단 삽입 -->
<!-- 지우고 본문상단 삽입 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%
	if (session.getAttribute("id") == null) {
	%>

	<div style="display: block; background-color: rgba(0, 0, 0, 0.7);"
		class="modal col-6" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title">비회원 접근 입니다.</h5>
				</div>
				<div class="modal-body">
					<p>로그인 되지 않았습니다.</p>
					<p>마이페이지를 이용하시려면 로그인 해주세요.</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary"
						onclick="location='../login/login.jsp'">로그인으로이동</button>
					<button type="button" class="btn btn-secondary"
						onclick="location.href='../' ">메인으로</button>
				</div>
			</div>
		</div>
	</div>

	<%
	} else {
	%>
	<%
	}
	%>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<script src="../customer/category.js"></script>
			</div>

			<div class="col-9 offset-1">

				<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
				<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
				<!-- 지우고 본문 ex) <table>, <form> 삽입 -->
			</div>
		</div>
	</div>
</body>

</html>
<%@include file="../Footer.jsp"%>