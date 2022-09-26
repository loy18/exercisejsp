<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	AcommodationVO acmv = (AcommodationVO) request.getAttribute("acmv");

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
				<form action="AcmUpdate.do" method="post"
					enctype="multipart/form-data">
					<input type="hidden" name="acmId" value="<%=acmv.getAcmId()%>">
					<input type="hidden" name="fileId"
						value="<%=acmv.getAtchFileId()%>">
					<table class="table table-hover">
						<tr>
							<td>I D :</td>
							<td><%=acmv.getAcmId()%></td>
						</tr>
						<tr>
							<td>숙박업소명 :</td>
							<td><input type="text" name="acmNm" class="form-control" 
								value="<%=acmv.getAcmNm()%>"></td>
						</tr>
						<tr>
							<td>숙박업소 설명 :</td>
							<td><textarea class="form-control" name="acmCont"><%=acmv.getAcmCont()%></textarea></td>
						</tr>
						<tr>
							<td>구분 :</td>
							<td><input type="text" name="acmSe" class="form-control" 
								value="<%=acmv.getAcmSe()%>"></td>
						</tr>
						<tr>
							<td>주소 :</td>
							<td><textarea class="form-control"  rows="3" cols="20" name="Addr"><%=acmv.getAddr()%></textarea></td>
						</tr>
						<tr>
							<td>가격 :</td>
							<td><input type="text" name="Price" class="form-control" 
								value="<%=acmv.getPrice()%>"></td>
						</tr>
						<tr>
							<td>수량 :</td>
							<td><input type="text" name="Qty" class="form-control" 
								value="<%=acmv.getQty()%>"></td>
						</tr>
						<tr>
							<td>작성자 :</td>
							<td><input type="text" name="Writer" class="form-control" 
								value="<%=acmv.getWriter()%>"></td>
						</tr>
						<tr>
							<td>다른 사진등록 :</td>
							<td><input class="form-control" type="file" name="atchFile" multiple="multiple"></td>
						</tr>
					</table>
					<button class="btn btn-outline-primary"  style="float: right">수정</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>
<%@include file="../Footer.jsp"%>