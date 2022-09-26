<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
List<AcommodationVO> acmList = (List<AcommodationVO>) request.getAttribute("acmList");

String msg = session.getAttribute("msg") == null ? "" : (String) session.getAttribute("msg");
session.removeAttribute("msg"); // 꺼내온 메시지 속성값 삭제하기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숙박업소 검색</title>
<link href="/TravelPackage/assets/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500;700&display=swap" rel="stylesheet">
</head>
<body>
	<div class="container">
			<div class="text-center pt-5 row">
				<input type="search" class="mr-3 col-8 offset-1" autocomplete="false" placeholder="검색어를 입력하세요.">
				<button type="button" class="btn btn-primary col-2" onclick="f_acmSearch()">검색</button>
				<div class="offset-1"></div>
			</div>
			<div class="row mt-3">
				<table class="table table-hover">
					<thead>
						<tr class="text-center">
							<th scope="col" width="8%">구분</th>
							<th scope="col" width="20%">숙박업소명</th>
							<th scope="col">주소</th>
							<th scope="col" width="16%">숙박금액</th>
							<th scope="col" width="12%">선택</th>
						</tr>
					</thead>


					<%
					int acmSize = acmList.size();
					int number = 0;
					if (acmSize > 0) {
						for (int i = 0; i < acmSize; i++) {
					%>

					<tr class="text-center">
						<td><%=acmList.get(i).getAcmSe()%></td>
						<td><a class="text-decoration-none text-dark" href="#" onclick="f_select('<%=acmList.get(i).getAcmId() + "=" + acmList.get(i).getAcmNm()%>')">
							<%=acmList.get(i).getAcmNm()%></a>
						</td>
						<td><%=acmList.get(i).getAddr()%></td>
						<td><%=acmList.get(i).getPrice()%></td>
						<td><button onclick="f_select('<%=acmList.get(i).getAcmId() + "=" + acmList.get(i).getAcmNm()%>')"
								class="btn btn-outline-primary" style="float: right">선택</button></td>

					</tr>

					<%
					}
					} else {
					%>
					<tr>
						<td colspan="5">정보가 없습니다.</td>
					</tr>
					<%
					}
					%>
				</table>
			</div>
		</div>
<script>
	function f_select(p_arg){
		var v_arg = p_arg.split("=");
		opener.document.querySelector("input[name=acmId]").value = v_arg[0];
		opener.document.querySelector("#acmTxt").value = v_arg[1];
		window.close();
	}

	function f_acmSearch(){
		var v_search = document.querySelector("input[type=search]");
		location.href="./AcmSearch.do?search=" + v_search.value;
	}
</script>
<script src="/TravelPackage/assets/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
