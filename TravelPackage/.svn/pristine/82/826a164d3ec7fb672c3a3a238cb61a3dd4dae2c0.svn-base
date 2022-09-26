<%@page import="java.io.File"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
    <%
	AcommodationVO acmv = (AcommodationVO) request.getAttribute("acmv");

	List<AtchFileVO> atchFileList = 
			(List<AtchFileVO>)request.getAttribute("atchFileList");
%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>상세정보</title>
        
        </head>

        <body>
            <div class="container">
                <div class="row mt-4">
                    <div id="category" class="col-2">
                        <script src="../admin/category.js"></script>
                    </div>

                    <div class="col-9 offset-1">
                      <table class="table table-hover">
                      		<tr>
								<td colspan=2>
								<%
								if(atchFileList != null){
									for(AtchFileVO fileVO : atchFileList){
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
								<td width="15%">숙박업소ID :</td>
								<td><%=acmv.getAcmId()%></td>
							</tr>
							<tr>
								<td>숙박업소명 :</td>
								<td><%=acmv.getAcmNm()%></td>
							</tr>
							<tr>
								<td>숙박업소 설명 :</td>
								<td><%=acmv.getAcmCont()%></td>
							</tr>
							<tr>
								<td>구분 :</td>
								<td><%=acmv.getAcmSe()%></td>
							</tr>
							<tr>
								<td>주소 :</td>
								<td><%=acmv.getAddr()%></td>
							</tr>
							<tr>
								<td>투숙금액 :</td>
								<td><%=acmv.getPrice()%></td>
							</tr>
							<tr>
								<td>객실수 :</td>
								<td><%=acmv.getQty()%></td>
							</tr>
							<tr>
								<td>등록일자 :</td>
								<td><%=acmv.getAcmRd()%></td>
							</tr>
							<tr>
								<td>작성자 :</td>
								<td><%=acmv.getWriter()%></td>
							</tr>
						</table>
						<div class="btn-group" role="group" aria-label="Basic radio toggle button group" style="float: right">
							<button onclick="location.href = 'AcmList.do'" class="btn btn-outline-primary" >목록</button> 
							<button onclick="location.href = 'AcmUpdate.do?acmId=<%=acmv.getAcmId()%>'" class="btn btn-outline-primary" >수정</button> 
							<button onclick="location.href = 'AcmDelete2.do?acmId=<%=acmv.getAcmId()%>'" class="btn btn-outline-primary"  >삭제</button>
						</div>
                    </div>
                </div>
            </div>
        </body>

        </html>
        <%@include file="../Footer.jsp" %>