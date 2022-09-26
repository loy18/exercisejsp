<%@page import="kr.or.ddit.app.compkg.vo.ComPkgVO"%>
<%@page import="kr.or.ddit.app.sch.vo.SchVO"%>
<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="java.io.File"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	PkgVO pv = (PkgVO) request.getAttribute("pv");
	List<SchVO> svList = (List<SchVO>) request.getAttribute("svList");
	List<ComPkgVO> comPkgList = (List<ComPkgVO>) request.getAttribute("comPkgList");
	List<AtchFileVO> atchFileList = (List<AtchFileVO>) request.getAttribute("atchFileList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세정보</title>
<link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="../css/dropdowns.css" rel="stylesheet">
</head>

<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
                  <script src="../admin/category.js"></script>
            </div>
			<div class="col-9 offset-1">
				<h4 class="mt-3">패키지 정보</h4>
				<table class="table table-hover mb-3">
					<tr>
						<td colspan=2>
							<%
								if (atchFileList != null) {
									for (AtchFileVO fileVO : atchFileList) {
							%>
							<div class="text-center">
								<img
									src="<%=request.getContextPath() + File.separator%>pkg/<%=fileVO.getAtchFileDeSav()%>"
									width="60%"> <br> <br>
							</div> 
							<%
								 	}
								 }
							 %>
						</td>
					</tr>
					<tr>
						<td width="20%">패키지ID :</td>
						<td><%=pv.getPkgId()%></td>
					</tr>
					<tr>
						<td>패키지명 :</td>
						<td><%=pv.getPkgNm()%></td>
					</tr>
					<tr>
						<td>패키지 설명 :</td>
						<td><%=pv.getPkgCont()%></td>
					</tr>
					<tr>
						<td>일수 :</td>
						<td><%=pv.getPkgDay()%></td>
					</tr>
					<tr>
						<td>가격 :</td>
						<td><%=pv.getPkgPri()%></td>
					</tr>
					<tr>
						<td>지역 :</td>
						<td><%=pv.getPkgReg()%></td>
					</tr>
					<tr>
						<td>가이드여부 :</td>
						<td><%=pv.getPkgGui()%></td>
					</tr>
					<tr>
						<td>최소인원 :</td>
						<td><%=pv.getPkgMinTo()%></td>
					</tr>
					<tr>
						<td>최대인원 :</td>
						<td><%=pv.getPkgMaxTo()%></td>
					</tr>
					<tr>
						<td>등록수정일자 :</td>
						<td><%=pv.getPkgRd()%></td>
					</tr>
					<tr>
						<td>작성자 :</td>
						<td><%=pv.getPkgWrt()%></td>
					</tr>
				</table>
				<h1 class="h4 mt-5">등록된 일정</h1>
				<table class="table mt-3">
					<tr>
						<th class="text_center">일차</th>
						<th class="text_center">숙박업소</th>
						<th class="text_center">교통수단</th>
						<th class="text_center">관광상품수</th>
					</tr>


					<%
						if (svList != null && svList.size() != 0) {
						for (SchVO sv : svList) {
					%>
					<tr>
						<td class="text_center"><a
							href="../sch/schDetail.do?pkgId=<%=pv.getPkgId()%>&schDay=<%=sv.getSchDay()%>"><%=sv.getSchDay()%></a></td>
						<td><a
							href="../sch/schDetail.do?pkgId=<%=pv.getPkgId()%>&schDay=<%=sv.getSchDay()%>"><%=sv.getAcmNm()%></a></td>
						<td><a
							href="../sch/schDetail.do?pkgId=<%=pv.getPkgId()%>&schDay=<%=sv.getSchDay()%>"><%=sv.getVehcNm()%></a></td>
						<td><a
							href="../sch/schDetail.do?pkgId=<%=pv.getPkgId()%>&schDay=<%=sv.getSchDay()%>"><%=sv.getTourCount()%></a></td>

					</tr>
					<%
						}
					} else {
					%>
					<tr>
						<td colspan="4" class="text-center">일정이 없습니다.</td>
					</tr>
					<%
						}
					%>
						
				</table>
				<table class="mb-5" width="100%">
					<tr >
						<td colspan="4" class="text-end"><a
								onclick="location='../sch/schInsert.do?pkgId=<%=pv.getPkgId()%>'"
								class="btn btn-outline-primary">일정 추가</a></td>
					</tr>
				</table>
				
				<h4>현재 판매 상품</h4>
				<table class="table">
					<tr>
						<th width="8%" class="text-center">ID</th>
						<th width="12%" class="text-center">출발날짜</th>
						<th width="18%" class="text-center">현재 인원/최대 인원</th>
						<th width="12%" class="text-center">등록수정일</th>
						<th width="12%" class="text-center">작성자</th>
						<th width="12%" class="text-center">예약상태</th>
						<th width="17%" class="text-center">예약 확정/취소</th>
						<th width="9%" class="text-center">삭제</th>
					</tr>
					<%
					if(comPkgList.size() > 0){
						for(int i=0; i<comPkgList.size(); i++){
					%>
						<tr>
							<td width="8%" class="text-center"><%=comPkgList.get(i).getComPkgId() %></td>
							<td width="12%" class="text-center"><%=comPkgList.get(i).getComPkgDay() %></td>
							<td width="18%" class="text-center"><%=comPkgList.get(i).getPkgCount() %></td>
							<td width="12%" class="text-center"><%=comPkgList.get(i).getComPkgRd() %></td>
							<td width="12%" class="text-center"><%=comPkgList.get(i).getComPkgWrt() %></td>
							<td width="12%" class="text-center"><%=comPkgList.get(i).getRsvStat() %></td>
							<td width="17%" class="text-center">
							<form action="<%=request.getContextPath()%>/Update2.do" class="mt-0 mb-0" method="post">
								<input type="hidden" name="compkg" value="<%=comPkgList.get(i).getComPkgId()%>" >
								<input type="hidden" name="pkgId" value="<%=comPkgList.get(i).getPkgId()%>" >
								<input type="submit" class="btn btn-outline-primary" name="yon" value="확정">
								<input type="submit" class="btn btn-outline-primary" name="yon" value="취소" >
							</form>
							</td>
							<td width="9%" class="text-center"><input id="check" class="form-check-input" type="checkbox" name="check" value="<%=comPkgList.get(i).getComPkgId()%>"/></td>
						</tr>
					<%
						}
					} else{
					%>
						<tr>
							<td colspan="8" class="text-center">판매중인 상품이 없습니다.</td>
						</tr>
					<%
					}
					%>
				</table>
				<table class="mb-5" width="100%">
					<tr>
						<td class="text-end">
							<a onclick="location='../compkg/comPkgInsert.do?pkgId=<%=pv.getPkgId()%>'"
								class="btn btn-outline-primary">판매 등록</a>
							<a onclick="f_delete()"
								class="btn btn-outline-primary">판매 삭제</a>
						</td>
					</tr>
				</table>
				
				<table class="mt-5" width="100%">
					<tr>
						<td>
							<a onclick="location='pkgList.do'"
							class="btn btn-outline-primary">목록</a> <a
							onclick="location='pkgUpdate.do?pkgId=<%=pv.getPkgId()%>'"
							class="btn btn-outline-primary">패키지 수정</a> <a
							onclick="location='pkgDelete.do?pkgId=<%=pv.getPkgId()%>'"
							class="btn btn-outline-primary">패키지 삭제</a>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script>
		function f_delete(){
			var v_cehck = document.querySelectorAll("input[name=check]");
			var v_arr = [];
			for(let i=0; i< v_cehck.length; i++){
				if(v_cehck[i].checked == true){
					v_arr.push(v_cehck[i].value);
				}
			}

			let queryString = "";
			for(let i=0; i< v_arr.length; i++){
				queryString += "comPkgId=" + v_arr[i] + "&";
			}

			location.href = "../compkg/comPkgDelete.do?" + queryString + "pkgId=" + <%=pv.getPkgId()%>;
		}
	</script>
</body>

</html>
<%@include file="../Footer.jsp"%>