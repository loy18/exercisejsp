<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
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
<title>공지사항 등록</title>
</head>
<body>
	<div class="container">
		<div class="row mt-4">
			<div id="category" class="col-2">
				<script src="./category.js"></script>
			</div>
			<div id="content" class="col-9 offset-1">

				<h1>고객센터 게시물 등록</h1>
				<hr>
				<form  action="noticeInsert.do"
					method="post" enctype="multipart/form-data">

					<div class="row" style="border: 3px solid gray;">
					<div class="col-2 title">카테고리</div>
						<div class="col-4 inputbox" style="display: flex">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<input style="border:0;color: red; font-size: x-large;" name="noticeSe"
								type="text" class="ansplase form-control"
								id="exampleFormControlInput1" value="공지사항" readonly>
						</div>
						<!-- 
						<div class="col-md-1 ">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<select class="btn btn-secondary" name="noticeSe">
								<option value="공지사항">공지사항</option>
								<option value="1:1문의">1:1문의</option>
							</select>
						</div>
					</div>
					 -->
					 <div class="col-2 title">작성자</div>
						<div class="col-4 inputbox b">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<input style="border:0;font-size: large;" readonly name="noticeWrt"
								type="text" class="form-control"
								value="<%=session.getAttribute("id")%>"
								id="exampleFormControlInput1">
						</div>
						<!--  
					<div class="col-md-1 b">
						<label for="exampleFormControlInput1" class="form-label"></label>
						<input name="noticeWrt" type="text" class="form-control"
							id="exampleFormControlInput1" placeholder="작성자" required>
					</div>
						-->
						
						<div class="col-2 title">글 제목</div>
						<div class="col-4 inputbox b">
							<label for="exampleFormControlInput1" class="form-label"></label>
							<input style="border:0;font-size: x-large;" name="noticeTitle" type="text"
								class="form-control" id="exampleFormControlInput1"
								placeholder="제목을 입력하세요" required>
						</div>
						<!--
					<div class="col-md-3 b">
						<label for="exampleFormControlInput1" class="form-label"></label>
						<input name="noticeTitle" type="text" class="form-control"
							id="exampleFormControlInput1" placeholder="제목을 입력하세요" required>
					</div>
  -->
					<div class="mb-3 col-12 md-4 " style="padding: 0px;">
							<label for="exampleFormControlTextarea1" class="form-label"></label>
							<textarea style="padding: 0px;" name="noticeCont"
								class="form-control" id="exampleFormControlTextarea1" rows="10"
								placeholder="내용을 입력하세요" required></textarea>
						</div>
						<!--  
					<div class="mb-3 col-7 md-4 b">
						<label for="exampleFormControlTextarea1" class="form-label"></label>
						<textarea name="noticeCont" class="form-control"
							id="exampleFormControlTextarea1" rows="5" placeholder="내용을 입력하세요"
							required></textarea>
					</div>
					-->
	
						<button class="col-1 btn btn-outline-primary " style="float: reft"
							cursorshover="true">등록</button>
						<button type="reset" class="col-2 btn btn-outline-primary"
							style="float: reft" cursorshover="true">다시수정</button>
						<button onclick="location.href='../notice/noticeMain.jsp'"
							class="col-1 btn btn-outline-primary " style="float: reft"
							cursorshover="true">취소</button>
							
							
					<!-- <button class="btn btn-outline-primary" style="float: reft">등록</button>
 -->
 				</div>
 
				</form>
			</div>
		</div>
	</div>
</body>
</html>
<%@include file="../Footer.jsp"%>