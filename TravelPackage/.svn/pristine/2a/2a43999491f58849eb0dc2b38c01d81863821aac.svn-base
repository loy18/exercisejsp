<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>

<%
	List<MemberVO> memberList = (List<MemberVO>) request.getAttribute("memberList");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 회원관리</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2 ">
				<script src="../admin/category.js"></script>
			</div>
			<div class="col-9 offset-1 " style="margin-left: 10px;">
			<br>
			<h2>회원관리</h2>
			<br>
				<table class="table table-hover" style="width: 1100px">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">이름</th>
							<th scope="col">전화번호</th>
							<th scope="col">주소</th>
							<th scope="col">선호지역</th>
							<th scope="col">생년월일</th>
							<th scope="col">마일리지</th>
							<th scope="col">삭제</th>
						</tr>
					</thead>
					<!-- 밑에 행 데이터 불러와서 넣기 -->
					
					<%
						int memSize = memberList.size();
						if(memSize > 0) {
							for(int i = 0; i < memSize; i++){	
					%>
					
					<tr>
						<td><%=memberList.get(i).getMemMail()%></td>
						<td><%=memberList.get(i).getMemNm() %></td>
						<td><%=memberList.get(i).getMemTel() %></td>
						<% if(memberList.get(i).getMemAddr().length() > 20) {%>
						<td><%=memberList.get(i).getMemAddr().substring(0,20) + "..." %></td>
						<% } else{ %>
						<td><%=memberList.get(i).getMemAddr() %></td>						
						<% } %>
						<td><%=memberList.get(i).getMemPreReg() == null ? "" : memberList.get(i).getMemPreReg() %></td>
						<td><%=memberList.get(i).getMemBir() %></td>
						<td><%=memberList.get(i).getMemMileage() %></td>
						<td><input id="check" type="checkbox" name="check" value="<%=memberList.get(i).getMemMail()%>"/></td>
					</tr>	
					<%		}
						}else {
					%>
					<!-- 데이터가 없다면 이 행을 불러오기 -->
	
					<tr>
						<td colspan="7">정보가 없습니다.</td>
					</tr>
					<tr>
					<%
						}
					%>
						<td colspan="8">
							<button onclick="deletMem()" class="btn btn-outline-primary" style="float: right">회원삭제</button>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
<script>
	function deletMem() {
		let checkedVals = [];
		let queryString = "";
		$("input[name=check]:checked").val(function qString (p_index, p_value) {
			queryString += "memMail=" + p_value + "&";
		});
		// alert(queryString);
		
		$.ajax({
			type:"get",
			url:"<%=request.getContextPath()%>/mem/memDelete.do",
			data:queryString,
			dataType:"text",
			success: function(result) {
				if(result == "OK"){
					alert("회원이 삭제되었습니다.");
					location.href="<%=request.getContextPath()%>/mem/memberList.do";
				}
			},
			error: function (request, status, error) {
		        console.log("code: " + request.status)
		        console.log("message: " + request.responseText)
		        console.log("error: " + error);
			}
			
		})
	}
</script>
</body>
</html>
<%@include file="../Footer.jsp"%>