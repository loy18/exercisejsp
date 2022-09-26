<%@page import="kr.or.ddit.app.qna.vo.QnaVO"%>
<%@ page import="kr.or.ddit.app.mem.vo.MemberVO"%>
<%@page import="kr.or.ddit.app.qnaans.vo.QnaAnsVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
	List<QnaVO> qnaEachList = (List<QnaVO>) request.getAttribute("qnaEachList");
List<QnaVO> qnaAllList = (List<QnaVO>) request.getAttribute("qnaAllList");
QnaAnsVO qnsvo = (QnaAnsVO) request.getAttribute("qnaAnsVO");

String msg = session.getAttribute("msg") == null ? "" : (String) session.getAttribute("msg");
session.removeAttribute("msg"); // 꺼내온 메시지 속성값 삭제하기
%>
<!DOCTYPE html>
<html>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<head>
<meta charset="UTF-8">
<title>1:1문의 게시판</title>
</head>
<body>

	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2 ">
				<script src="../qna/category.js"></script>
			</div>
			<div id="content" class="col-9 offset-1 ">
				<h1>1:1문의 내역</h1>
				<hr>
				<table class="table table-striped table-hover">
					<thead>
						<tr>
							<th scope="col">글번호</th>
							<th scope="col">글제목</th>
							<th></th>
							<th scope="col">답변유무</th>
							<th scope="col">작성일</th>
						</tr>
					</thead>
					<%
					String id = (String)session.getAttribute("id");
					
						if (id.equals("admin")) {
						int qnaAllSize = qnaAllList.size();
						if (qnaAllSize > 0) {
							for (int i = 0; i < qnaAllSize; i++) {
					%>
					<tr>
						<td><%=qnaAllList.get(i).getQnaNo()%></td>
						<td><a
							href="./qnaDetail.do?qnaNo=<%=qnaAllList.get(i).getQnaNo()%>"><%=qnaAllList.get(i).getQnaTitle()%>
						</a></td>
						<td></td>
						<td style="color:red"><%=qnaAllList.get(i).getQnaState()%></td>
						<td><%=qnaAllList.get(i).getQnaDate()%></td>
						<td><input id="check" type="checkbox" name="check"
							value="<%=qnaAllList.get(i).getQnaNo()%>" /></td>

					</tr>
					<%
						
						}
						}else{
							%>
							<tr>
								<td colspan="5">게시물이 없습니다.</td>
							</tr>
							<%
						}
					} else {
					int qnaEachSize = qnaEachList.size();
					if (qnaEachSize > 0) {
					for (int i = 0; i < qnaEachSize; i++) {
					%>

					<tr>
						<td><%=qnaEachList.get(i).getQnaNo()%></td>
						<td><a
							href="./qnaDetail.do?qnaNo=<%=qnaEachList.get(i).getQnaNo()%>"><%=qnaEachList.get(i).getQnaTitle()%>
						</a></td>
						<td></td>
						<%if(qnaEachList.get(i).getQnaState().equals("답변대기")){
							
						%>
						<td style="color:red"><%=qnaEachList.get(i).getQnaState()%></td>
						<%}else{
						%> 
						<td style="color:blue"><%=qnaEachList.get(i).getQnaState()%></td>
						<%} %>
						<td><%=qnaEachList.get(i).getQnaDate()%></td>
						<td><input id="check" type="checkbox" name="check"
							value="<%=qnaEachList.get(i).getQnaNo()%>" /></td>

					</tr>
					<%
						}
					} else{
						%>
						<tr>
							<td colspan="5">게시물이 없습니다.</td>
						</tr>
						<%
					}
					}
					%>
				</table>
				<div class="btn-group" role="group"
					aria-label="Basic radio toggle button group" style="float: right">
					<button onclick="location='../qna/qnaInsert.jsp'"
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
		queryString += "qnaNo="+p_value+"&";
	});
	//alert(queryString);
	
	$.ajax({
		type:"get",
		url:"<%=request.getContextPath()%>/qna/delete.do",
		data:queryString,
		dataType:"text",
		success:function(rslt){
			if(rslt == "OK"){
				location.href= "<%=request.getContextPath()%>/qna/qnaList.do";
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