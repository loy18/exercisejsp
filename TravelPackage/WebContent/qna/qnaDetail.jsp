<%@page import="kr.or.ddit.app.qna.vo.QnaVO"%>
<%@page import="kr.or.ddit.app.qnaans.vo.QnaAnsVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<%
QnaAnsVO qnsvo = (QnaAnsVO) request.getAttribute("qnaAnsVO");
	QnaVO qv = (QnaVO) request.getAttribute("qnaVO");
	
%>

<!DOCTYPE html>
<html>
<style>
.title {
	text-align: center;
	padding: 15px;
	background: aliceblue;
	border: 1px solid gray;
}

.inputbox {
	display: flex;
	justify-content: center;
	align-items: center;

}
)
</style>
<head>
<meta charset="UTF-8">
<title>공지사항 상세</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.1.js"
	integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
	crossorigin="anonymous"></script>
<body>

	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2 ">
				<script src="./category.js"></script>
			</div>
			<div id="content" class="col-9 offset-1 ">
				<table class="table table-hover ">
				<h3>문의 글</h3>
				<tr>
						<td>답변상태</td>
						<%if(qv.getQnaState().equals("답변대기")){
							
						%>
						<td style="color:red"><%=qv.getQnaState()%></td>
						<%}else{
						%> 
						<td style="color:blue"><%=qv.getQnaState()%></td>
							<%} %>
					</tr>
					<tr>
						<td >작성자</td>
						<td><%=qv.getMemMail()%></td>
					</tr>
					
					<tr>
						<td>제목</td>
						<td><%=qv.getQnaTitle()%></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><%=qv.getQnaCont()%></td>
					</tr>
					

					
					<!-- 
					 <td colspan="2"><a href="qnaList.do">[목록]</a> 
					<a href="qnaUpdate.do?qnaNo=<%=qv.getQnaNo()%>">[수정]</a> 
					<a href="delete.do?qnaNo=<%=qv.getQnaNo()%>">[삭제]</a></td>
					-->
					</tr>
				</table>
				<!--  -->
				<%
					if (qnsvo != null) {
				%>
				<br>
				<table class= "table table-hover ">
				<h3>관리자 답변</h3>
					<tr>
						<td>작성자</td>
						<td><%=qnsvo.getQnaAnsWrt()%></td>
					</tr>
					<tr>
						<td>제목</td>
						<td><%=qnsvo.getQnaAnsTitle()%></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><%=qnsvo.getQnaAnsCont()%></td>
					</tr>
					<tr>
						<td>답변일자</td>
						<td><%=qnsvo.getQnaAnsRd()%></td>
					</tr>
				</table>
				<%
					} else {
				%>
				<hr>


	<div class="row" style="border: 3px solid gray;">
	<div class="col-12 title">관리자 답변 작성</div>
				<table class="table table-hover">
					<form id="id_wform" action="qnaUpdate.do" method="post">
						<input type="hidden" name="qnaAnsId" value="<%=qv.getQnaNo()%>">
						<input type="hidden" name="qnaState" value="답변완료">
						
						<div class="col-2 title">작성자</div>
						<div class="col-4 inputbox b">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<input style="border:0;font-size: large;"readonly name="qnaAnsWrt" type="text" class="form-control"
								value="<%=session.getAttribute("id")%>"
								id="exampleFormControlInput1">
						</div>
						
							<div class="col-2 title">답변 제목</div>
						<div class="col-4 inputbox b">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<input style="border:0;font-size: x-large;"name="qnaAnsTitle" type="text" class="form-control"
								id="exampleFormControlInput1" placeholder="제목을 입력하세요" required>
						</div>
						
							<div class="mb-3 col-12 md-4 " style="padding: 0px;">
							<label for="exampleFormControlTextarea1" class="form-label"></label>
							<textarea style="padding: 0px;" name="qnaAnsCont"
								class="form-control" id="exampleFormControlTextarea1" rows="7"
								placeholder="내용을 입력하세요" required></textarea>
						</div>
							<!--
							<div>
								<textarea name="qnaAnsWrt" placeholder="작성자" required></textarea>
								<div>
									<textarea name="qnaAnsTitle" placeholder="제목 입력" required></textarea>
								</div>
								<div>
									<textarea name="qnaAnsCont" placeholder="내용 입력" required></textarea>
								</div>
								  -->
								
									<button style="float: reft"
										type="submit" class="col-3 btn btn-outline-primary">답변등록</button>
							</div>
						<%
							}
						%>
					</form>
				</table>
				<button onclick="location.href='../qna/qnaList.do'"
						class="col-1 btn btn-outline-primary" style="float: reft"cursorshover:"true">목록</button>
					<button
						onclick="location.href='../qna/qnaUpdate.do?qnaNo=<%=qv.getQnaNo()%>'"
						class="col-1 btn btn-outline-primary" style="float: reft"cursorshover:"true">수정</button>
					<button
						onclick="location.href='delete.do?qnaNo=<%=qv.getQnaNo()%>'"
						class="col-1 btn btn-outline-primary" style="float: reft"cursorshover:"true">삭제</button>
						</div>
			</div>
		</div>

		<script>
			$("#id_wform").on(
					"submit",
					function() {
						event.preventDefault(); // submit 안되게 막기
						//alert($("#id_wform").serialize()); 디버깅용
						//AJAX로 전송
						$.ajax({
							type : "post",
							url : "/TravelPackage/qna/qnaDetail.do",
							data : $("#id_wform").serialize(),
							dataType : "text",
							success : function(rslt) {
								console.log("성공", rslt); // 디버깅용
								if (rslt == "success") {
									//location.href=location.href; 요걸써도 되지만 캐쉬된 페이지가 올 수 도 있음
									location.replace(location.href);
								} else {
									alert("잘 안된 것 같아요")
								}

							},
							error : function(req, status, error) { // 이건 앞으로 복사해서 붙여넣기 사용
								console.log("code:", req.status, "msg:",
										req.responseText, "error:", error);
							}
						});
					});

			$("p.title").on('click', function() {
				$(this).next(".con").slideToggle(100);
			});
		</script>
</body>
</html>
<%@include file="../Footer.jsp"%>