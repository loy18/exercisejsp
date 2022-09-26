<%@page import="kr.or.ddit.app.review.vo.ReviewVO"%>
<%@page import="java.io.File"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	String search = (String)request.getAttribute("search");
	String pkgDay = (String)request.getAttribute("pkgDay");
	String pkgPrice = (String)request.getAttribute("pkgPrice");
	String vehcComp = (String)request.getAttribute("vehcComp");
	String comPkgDay = (String)request.getAttribute("comPkgDay");
	List<PkgVO> pvList = (List<PkgVO>)request.getAttribute("pvList");
	List<String> tagList = (List<String>)request.getAttribute("tagList");
	List<ReviewVO> revList = (List<ReviewVO>)request.getAttribute("revList");
	List<List<AtchFileVO>> atchFileList = (List<List<AtchFileVO>>)request.getAttribute("atchFileList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행 상품</title>
<link rel="stylesheet" href="./css/linkKeyword.css">
<script src="https://kit.fontawesome.com/db7b16b8e2.js" crossorigin="anonymous"></script>
<style>
	.b{
		border:1px solid black
	}
</style>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<div class="accordion accordion-flush FAQ" id="accordionFlushExample">
					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingOne">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseOne"
								aria-expanded="false" aria-controls="flush-collapseOne">
								여행기간</button>
						</h2>
						<%if(pkgDay == null || pkgDay.equals("")) {%>
							<div id="flush-collapseOne" class="accordion-collapse collapse"
							aria-labelledby="flush-headingOne"
							data-bs-parent="#accordionFlushExample">
						<% } else{ %>
							<div id="flush-collapseOne" class="accordion-collapse"
							aria-labelledby="flush-headingOne"
							data-bs-parent="#accordionFlushExample">
						<% } %>
								<div class="accordion-body">
							<% if(pkgDay.equals("1")) {%>
								<button type="button" class="btn btn-outline-primary m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=1&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								1일이내</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=2&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								2일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=3&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=4&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일이상</button>
							<%} else if(pkgDay.equals("2")) {%>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=1&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								1일이내</button>
								<button type="button" class="btn btn-outline-primary m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=2&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								2일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=3&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=4&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일이상</button>
							<%} else if(pkgDay.equals("3")) {%>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=1&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								1일이내</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=2&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								2일</button>
								<button type="button" class="btn btn-outline-primary m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=3&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=4&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일이상</button>
							<%} else if(pkgDay.equals("4")) {%>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=1&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								1일이내</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=2&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								2일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=3&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일</button>
								<button type="button" class="btn btn-outline-primary m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=4&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일이상</button>
							<%} else {%>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=1&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								1일이내</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=2&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								2일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=3&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일</button>
								<button type="button" class="btn btn-light m-1" 
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=4&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>'">
								3일이상</button>
							<%} %>
							</div>
						</div>
					</div>


					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingTwo">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo"
								aria-expanded="false" aria-controls="flush-collapseTwo">
								가격</button>
						</h2>
						<% if(pkgPrice == null || pkgPrice.equals("")) {%>
							<div id="flush-collapseTwo" class="accordion-collapse collapse"
								aria-labelledby="flush-headingTwo"
								data-bs-parent="#accordionFlushExample">
						<% } else{ %>
							<div id="flush-collapseTwo" class="accordion-collapse"
								aria-labelledby="flush-headingTwo"
								data-bs-parent="#accordionFlushExample">
						<% } %>
								<div class="accordion-body">
								<% if(pkgPrice.equals("580000")) {%>
									<button type="button" class="btn btn-outline-primary m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
									
								<% } else if(pkgPrice.equals("1150000")) {%>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-outline-primary m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
								
								<% } else if(pkgPrice.equals("1720000")) {%>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-outline-primary m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
									
								<% } else if(pkgPrice.equals("2300000")) {%>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-outline-primary m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
									
								<% } else if(pkgPrice.equals("9999999")) {%>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-outline-primary m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
								<% } else {%>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=580000&vehcComp=<%=vehcComp%>'">1~58만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1150000&vehcComp=<%=vehcComp%>'">58~115만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=1720000&vehcComp=<%=vehcComp%>'">115~172만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=2300000&vehcComp=<%=vehcComp%>'">172~230만원</button>
									<button type="button" class="btn btn-light m-1"
									onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=9999999&vehcComp=<%=vehcComp%>'">230만원 이상</button>
								<% } %>
								<br>
							</div>
						</div>
					</div>


					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingThree">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseThree"
								aria-expanded="false" aria-controls="flush-collapseThree">
								항공/선박</button>
						</h2>
						<% if(vehcComp == null || vehcComp.equals("")) {%>
							<div id="flush-collapseThree" class="accordion-collapse collapse"
								aria-labelledby="flush-headingThree"
								data-bs-parent="#accordionFlushExample">
						<% } else { %>
							<div id="flush-collapseThree" class="accordion-collapse"
								aria-labelledby="flush-headingThree"
								data-bs-parent="#accordionFlushExample">
						<% } %>
							<div class="accordion-body">
							<% if(vehcComp.equals("대한항공")) {%>
								<button type="button" class="btn btn-outline-primary m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=대한항공'">대한항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=아시아나'">아시아나항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=티웨이'">티웨이항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=진에어'">진에어항공</button>
							<% } else if(vehcComp.equals("아시아나")) {%>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=대한항공'">대한항공</button>
								<button type="button" class="btn btn-outline-primary m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=아시아나'">아시아나항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=티웨이'">티웨이항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=진에어'">진에어항공</button>
							<% } else if(vehcComp.equals("티웨이")) {%>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=대한항공'">대한항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=아시아나'">아시아나항공</button>
								<button type="button" class="btn btn-outline-primary m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=티웨이'">티웨이항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=진에어'">진에어항공</button>
							<% } else if(vehcComp.equals("진에어")) {%>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=대한항공'">대한항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=아시아나'">아시아나항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=티웨이'">티웨이항공</button>
								<button type="button" class="btn btn-outline-primary m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=진에어'">진에어항공</button>
							<% } else{ %>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=대한항공'">대한항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=아시아나'">아시아나항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=티웨이'">티웨이항공</button>
								<button type="button" class="btn btn-light m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=<%=search%>&pkgDay=<%=pkgDay%>&pkgPrice=<%=pkgPrice%>&vehcComp=진에어'">진에어항공</button>
							<% } %>
							</div>
						</div>
					</div>
					
					
					
					
					<div width="100%" class="pt-3">
						&nbsp;&nbsp;&nbsp;&nbsp;결과 내 검색
					</div>
					<div class="mt-4 container-fluid p-0">
						<div class="row">
							<input type="search" class="form-control col" style="display: inline-block;font-size:0.9em" value="<%=search %>" placeholder="상품명 검색">
							<button type="submit" class="btn col-2" onclick="f_search()"><img src="/TravelPackage/image/search.png" width="25px" height="25px"></button>
						</div>
						<button type="button" class="btn m-1"
								onclick="location.href='/TravelPackage/pkg/pkgSearch.do?search=&pkgDay=&pkgPrice=&vehcComp=&comPkgDay='">X 필터초기화</button>
					</div>
				</div>
			</div>
			<div class="col-9 offset-1">
				<div class="mb-3"></div>
			<%
				if(pvList != null && pvList.size() != 0){
					for(int i=0; i<pvList.size(); i++){
						PkgVO pv = pvList.get(i);
			%>
						<!-- 반복시작 -->
						<div class="row g-0 bg-light position-relative" >
							<div class="col-md-5 mb-md-0 p-md-4">
								<%if(atchFileList == null || atchFileList.get(i).isEmpty()) {%>
									<img src="/TravelPackage/image/icon.png" class="w-100" height="400px" alt="...">
								<%} else{ %>
									<img src="<%=request.getContextPath() + File.separator%>pkg/<%= atchFileList.get(i).get(0).getAtchFileDeSav()%>" class="w-100" height="100%" alt="...">
								<%} %>
							</div>
							<div class="col-md-7 p-3">
								<div>
									<h5 class="mt-0"><%=pv.getPkgNm()%><!-- 패키지명 --></h5>
									<% if(pv.getPkgCont().length() >= 150) {%>
										<h6><%=pv.getPkgCont().substring(0, 150) + "..." %><!-- 패키지 설명 --></h6>
									<% } else{ %>
										<h6><%=pv.getPkgCont()%><!-- 패키지 설명 --></h6>
									<% } %>
									<br>
									<h6>
										<span class="icn pos"><%=pv.getPkgReg()%><!-- 지역 --></span>
									</h6>
									<h6 class="item prod">
										<span>여행기간 <%=pv.getPkgDay()%>일<!-- 여행기간 --></span>
									</h6>
								</div>
								<div class="container">
									<div class="row mb-0">
										<div class="item_group col-8 mt-3">
											<span class="icn star" style="color:#58CCFF">
												<i class="fa-sharp fa-solid fa-star " ></i>
											</span><%=revList.get(i).getReviewRat()%><!-- 평점 -->
											&nbsp;&nbsp;&nbsp;
											<span class="icn balloon" style="color:#58CCFF">
												<i class="fa-regular fa-comment"></i>
											</span><%=revList.get(i).getReviewCount()%><!-- 리뷰 -->
											<br> 
											<span class="hash_group" style="color:gray">
												<!-- 입력시 #으로 태그받고 split해서 뿌려주기 -->
												<span><%=tagList.get(i)%></span>
											</span>
										</div>
										<div class="text-end col-4">
											<br>
											<div class="price_group text-end">
												<strong class="price"><%=pv.getPkgPri()%><!-- 가격 --><span>원</span></strong>
											</div>
											<div class="text-end">
												<a type="button" href="./pkgDt.do?pkgId=<%=pv.getPkgId()%>" class="btn btn-info">상품 상세 보기<!-- 링크 --></a>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<hr>
						<!-- 반복끝 -->
			<%
					}
				} else{
			%>
				<div class="mt-5 text-center">
					<h3>검색결과가 없습니다.</h3>
				</div>
			
			<%
				}
			%>
			</div>
		</div>
	</div>
	
<script>
	function f_search() {
		var v_sch = document.querySelector("input[type=search]");
		location.href="/TravelPackage/pkg/pkgSearch.do?search=" + v_sch.value + "&pkgDay=&pkgPrice=<%=pkgPrice%>&vehcComp=<%=vehcComp%>&comPkgDay=<%=comPkgDay%>";
	}
</script>
</body>
</html>
<%@include file="../Footer.jsp"%>
