<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
PkgVO pv = (PkgVO) request.getAttribute("pv");

List<AtchFileVO> atchFileList = (List<AtchFileVO>) request.getAttribute("atchFileList");
%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>상품 수정</title>

</head>

<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<script src="../admin/category.js"></script>
			</div>

			<div class="col-9 offset-1">
				<form action="pkgUpdate.do" method="post"
					enctype="multipart/form-data">
					<input type="hidden" name="pkgId" value="<%=pv.getPkgId()%>">
					<input type="hidden" name="fileId"
						value="<%=pv.getAtchFileId()%>">
					<table class="table table-hover">
						<tr>
							<td>패키지명</td>
							<td><textarea class="form-control" name="pkgNm"><%=pv.getPkgNm()%></textarea></td>
						</tr>
						<tr>
							<td>패키지설명</td>
							<td><textarea class="form-control" name="pkgCont"><%=pv.getPkgCont()%></textarea></td>
						</tr>
						<tr>
							<td>일수</td>
							<td><input type="text" name="pkgDay" class="form-control"
								value="<%=pv.getPkgDay()%>"></td>
						</tr>
						<tr>
							<td>가격</td>
							<td><input type="text" name="pkgPri" class="form-control"
								value="<%=pv.getPkgPri()%>"></td>
						</tr>
						<tr>
							<td>지역</td>
							<td><input type="text" name="pkgReg" class="form-control"
								value="<%=pv.getPkgReg()%>"></td>
						</tr>
						<tr>
							<td>가이드여부</td>
							<td><input type="text" name="pkgGui" class="form-control"
								value="<%=pv.getPkgGui()%>"></td>
						</tr>
						<tr>
							<td>최소인원</td>
							<td><input type="text" name="pkgMinTo" class="form-control"
								value="<%=pv.getPkgMinTo()%>"></td>
						</tr>
						<tr>
							<td>최대인원</td>
							<td><input type="text" name="pkgMaxTo" class="form-control"
								value="<%=pv.getPkgMaxTo()%>"></td>
						</tr>
						<tr>
							<td>작성자 :</td>
							<td><input type="text" name="pkgWrt" class="form-control"
								value="<%=pv.getPkgWrt()%>"></td>
						</tr>
						<tr>
							<td>대표이미지 변경 :</td>
							<td><input class="form-control" type="file" name="atchFile" multiple="multiple"></td>
						</tr>
					</table>
					<button class="btn btn-outline-primary" style="float: right">수정</button>
					
				</form>
			</div>
		</div>
	</div>
</body>

</html>
<%@include file="../Footer.jsp"%>