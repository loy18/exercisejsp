<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>

<%
List<AcommodationVO> acmList = (List<AcommodationVO>) request.getAttribute("acmList");

String msg = session.getAttribute("msg") == null ? "" : (String) session.getAttribute("msg");
session.removeAttribute("msg"); // 꺼내온 메시지 속성값 삭제하기
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2 ">
				<script src="../admin/category.js"></script>
			</div>
			<div class="col-9 offset-1 ">

				<div class="col-3 offset-1" style="margin-left: 0px;">
					<select onchange="if(this.value) location.href=(this.value);"
						class="form-select" aria-label="Default select example">
						<option value="../pkg/pkgList.do">패키지상품</option>
						<option value="../tour/tourList.do">관광상품</option>
						<option value="../vehc/vehcList.do">운송수단</option>
						<option value="../acm/AcmList.do" selected="selected">숙박업소</option>
					</select>
				</div>

				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">숙박업소명</th>
							<th scope="col">구분</th>
							<th scope="col">숙박금액</th>
							<th scope="col">작성자</th>
							<th scope="col">삭제</th>
						</tr>
					</thead>


					<%
					int acmSize = acmList.size();
					int number = 0;
					if (acmSize > 0) {
						for (int i = 0; i < acmSize; i++) {
					%>

					<tr>
						<td><%=acmList.get(i).getAcmId()%></td>
						<td><a
							href="AcmDetail.do?acmId=<%=acmList.get(i).getAcmId()%>"><%=acmList.get(i).getAcmNm()%></a></td>
						<td><%=acmList.get(i).getAcmSe()%></td>
						<td><%=acmList.get(i).getPrice()%></td>
						<td><%=acmList.get(i).getWriter()%></td>
						<td><input id="check" type="checkbox" name="check" value="<%=acmList.get(i).getAcmId()%>"/></td>
						
					</tr>

					<%
					}
					} else {
					%>
					<tr>
						<td colspan="6">정보가 없습니다.</td>
					</tr>
					<%
					}
					%>
				</table>
				<div class="btn-group" role="group" aria-label="Basic radio toggle button group" style="float: right">
					<button onclick="location='AcmInsert.jsp'"
							class="btn btn-outline-primary" style="float: right">등록</button>
					<button id="delete" onclick="f_del()"
						class="btn btn-outline-primary" style="float: right">삭제</button>	
				</div>		
				<%
				if (msg.equals("성공")) {
				%>
				<script>
					alert("정상적으로 처리되었습니다.");
				</script>
				<%
				}
				%>
			</div>
		</div>
	</div>
<script type="text/javascript">
var btn = document.querySelector("#check");
//var delBoxs = document.querySelectorAll("input[name=check]");
function f_del(){
	let checkedVals = []; // 빈 배열
	let queryString="";
	$("input[name=check]:checked").val((p_index,p_value)=>{
		queryString += "acmId="+p_value+"&";
	});
	//alert(queryString);
	
	$.ajax({
		type:"get",
		url:"<%=request.getContextPath()%>/acm/AcmDelete.do",
		data:queryString,
		dataType:"text",
		success:function(rslt){
			if(rslt == "OK"){
				location.href= "<%=request.getContextPath()%>/acm/AcmList.do";
			}
		},
		error:function(request,status,error){        
		   console.log("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);       
		 }
	})

}
</script>
</body>
</html>
<%@include file="../Footer.jsp"%>