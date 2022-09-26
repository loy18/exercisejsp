<%@page import="kr.or.ddit.app.tour.vo.TourVO"%>
<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@page import="kr.or.ddit.app.vehc.vo.VehcVO"%>
<%@page import="java.io.File"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.app.sch.vo.SchVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
<%
    SchVO sv = (SchVO) request.getAttribute("sv");
	VehcVO vehcVO = (VehcVO) request.getAttribute("vehcVO");
    AcommodationVO acmVO = (AcommodationVO) request.getAttribute("acmVO");
    List<AtchFileVO> acmFileList = (List<AtchFileVO>)request.getAttribute("acmFileList");
    List<TourVO> tourList =  (List<TourVO>)request.getAttribute("tourList");
	List<List<AtchFileVO>> tourFileList = (List<List<AtchFileVO>>)request.getAttribute("tourFileList");
%>
    
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>상세 정보</title>
          
        </head>

        <body>
            <div class="container">
                <div class="row mt-4">
                    <div id="category" class="col-2">
                        <script src="../admin/category.js"></script>
                    </div>

                    <div class="col-9 offset-1">
                    <h3>교통수단</h3>
                      <table class="table table-hover">
							<tr>
								<th>구분 :</th>
								<td><%=vehcVO.getVehcSe()%></td>
							</tr>
							<tr>
								<th>교통수단명 :</th>
								<td><%=vehcVO.getVehcNm()%></td>
							</tr>
							<tr>
								<th>교통수단회사명 :</th>
								<td><%=vehcVO.getVehcComp()%></td>
							</tr>
							<tr>
								<th>거리당가격 :</th>
								<td><%=vehcVO.getVehcdp()%></td>
							</tr>
						</table>
						
					<h3 class="mt-5 ">숙박업소</h3>
						<table class="table table-hover">
							<tr>
								<td colspan=2>
								<%
								if(acmFileList != null){
									for(AtchFileVO fileVO : acmFileList){
								%>
									<div class="text-center">
										<img src="<%=request.getContextPath() + File.separator%>acm/<%= fileVO.getAtchFileDeSav()%>" width="60%">
										<br>
										<br>
									</div> <% 
									}
								}
								%>
								</td>
							</tr>
							<tr>
								<th>구분 :</th>
								<td><%=acmVO.getAcmSe()%></td>
							</tr>
							<tr>
								<th>숙박업소명 :</th>
								<td><%=acmVO.getAcmNm()%></td>
							</tr>
							<tr>
								<th>주소 :</th>
								<td><%=acmVO.getAddr()%></td>
							</tr>
							<tr>
								<th>가격 :</th>
								<td><%=acmVO.getPrice()%></td>
							</tr>
							<tr>
								<th>객실수 :</th>
								<td><%=acmVO.getQty()%></td>
							</tr>
						</table>
						
						<h3 class="mt-5">관광상품</h3>
						<%
						for(int i=0; i<tourList.size(); i++){
						%>
						<table class="table table-hover mb-5">
							<tr>
								<td colspan=2>
								<%
								if(tourFileList.get(i) != null){
									for(AtchFileVO fileVO : tourFileList.get(i)){
								%>
									<div class="text-center">
										<img src="<%=request.getContextPath() + File.separator%>acm/<%= fileVO.getAtchFileDeSav()%>" width="60%">
										<br>
										<br>
									</div> <% 
									}
								}
								%>
								</td>
							</tr>
							<tr>
								<th>구분 :</th>
								<td><%=tourList.get(i).getTourSe()%></td>
							</tr>
							<tr>
								<th>관광상품명 :</th>
								<td><%=tourList.get(i).getTourNm()%></td>
							</tr>
							<tr>
								<th>주소 :</th>
								<td><%=tourList.get(i).getTourAddr()%></td>
							</tr>
							<tr>
								<th>가격 :</th>
								<td><%=tourList.get(i).getTourPri()%></td>
							</tr>
							<tr>
								<th>최대인원 :</th>
								<td><%=tourList.get(i).getTourMaxTo()%></td>
							</tr>
						</table>
						<%
						}
						%>
						<table>
							<tr>
								<td>
									<a class="btn btn-outline-primary" href="../pkg/pkgDetail.do?pkgId=<%=sv.getPkgId()%>">목록</a> 
									<a class="btn btn-outline-primary" href="../sch/schUpdate.do?pkgId=<%=sv.getPkgId()%>&schDay=<%=sv.getSchDay()%>">일정 수정</a>
									<a class="btn btn-outline-primary" href="../sch/schDelete.do?pkgId=<%=sv.getPkgId()%>&schDay=<%=sv.getSchDay()%>">일정 삭제</a>
								</td>
							</tr>
						</table>
                    </div>
                </div>
            </div>
        </body>
        </html>
        <%@include file="../Footer.jsp" %>