<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@include file="../Header.jsp" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>아이디 찾기</title>
			<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
			<link rel="canonical" href="https://getbootstrap.kr/docs/5.1/examples/modals/">
			<!-- Bootstrap core CSS -->
			<link href="/TravelPackage/assets/dist/css/bootstrap.min.css" rel="stylesheet">
			<style>
				.bd-placeholder-img {
					font-size: 1.125rem;
					text-anchor: middle;
					-webkit-user-select: none;
					-moz-user-select: none;
					user-select: none;
				}

				@media (min-width : 768px) {
					.bd-placeholder-img-lg {
						font-size: 3.5rem;
					}
				}

				#ch1 {
					display: inline-block;
					border: 1px solid gray;
					border-bottom-style: none;
					height: 70px;
					width: 395px;
				}

				#ch2 {
					display: inline-block;
					border: 1px solid gray;
					border-top-style: none;
					border-left-style: none;
					border-right-style: none;
					height: 70px;
					width: 395px;
				}

				#wrapper {
					height: 80vh;
				}

				#table {
					height: 300px;
				}

				#table1 {
					width: 800px;
					height: 200px;
					border: 1px solid gray;
					border-left-style: none;
					border-right-style: none;
					border-bottom-style: none;
				}

				tr {
					border-left-style: none;
				}

				col {
					border: 1px solid rgb(219, 217, 217);
					border-left-style: none;
					text-align: center;
				}

				input:focus {
					outline: 2px solid rgb(88, 204, 255);
				}

				#a {
					border: none;
				}

				#in1 {
					border: 1px solid rgb(219, 217, 217);
					width: 500px;
					height: 50px;
					font-size: 12px;
					width: 500px;
				}

				#in2 {
					border: none;
					border-radius: 6px;
					width: 120px;
					height: 50px;
					color: white;
				}



				#modalSheet {
					display: none;
					position: fixed;
					/* 모달 전체창은 항상 fixed로 만듬*/
					width: 100%;
					height: 100%;
					/* fixed에선 height %도 먹음 */
					background-color: rgba(100, 100, 100, 0.4);
					top:0%;
					left:0%;
				}
				#modalLay{
				position:absolute;
				top: 30%;
				left: 40%;
				}
				
				#target{
				color:rgb(88, 204, 255);
				line-height: 180px;
				text-align: center;
				
				}
			</style>
			<!-- Custom styles for this template -->
			<link href="/TravelPackage/css/modals.css" rel="stylesheet">
		</head>

		<body>

			<div id=wrapper align="center">
				<br> <br> <br>
				<h4>아이디/비밀번호를 잊어버리셨나요?</h4>
				<br> <br> <br>
				<div id="ch1" OnClick="location.href ='IdSearch.jsp'" style="cursor: pointer;">
					<br />아이디 찾기
				</div>
				<div id="ch2" OnClick="location.href ='PwSearch.jsp'" style="cursor: pointer;">
					<br />비밀번호 찾기
				</div>

				<br> <br> <br>

				<div id=table>
					<form action="<%=request.getContextPath()%>/SearchId.do" method="post">
						<table id=table1>
							<colgroup>
								<col
									style="width: 19%; height: 100px; background-color: rgb(247, 247, 247); text-align: center;">
							</colgroup>
							<tbody>
								<tr
									style="border: 1px solid rgb(219, 217, 217); border-left-style: none; border-right-style: none;">
									<th style="text-align: center">이름</th>
									<td>
										<div id=a>
											&nbsp;&nbsp;&nbsp;&nbsp;<input id=in1 type="text" title="이름" name="memNm"
												placeholder="&nbsp;&nbsp;이름을 입력해 주세요.">
										</div>
									</td>
								</tr>
								<tr
									style="border: 1px solid rgb(219, 217, 217); border-left-style: none; border-right-style: none;">
									<th style="text-align: center">휴대폰번호</th>
									<td>
										<div id=a>
											&nbsp;&nbsp;&nbsp;&nbsp;<input id=in1 type="text" title="휴대폰번호"
												name="memTel" placeholder="&nbsp;&nbsp;휴대폰번호를 입력해주세요.(예: 01012345678)">
										</div>
									</td>
								</tr>
							</tbody>
						</table>
						<br> <input id=in2 type="button" value="찾기" style="background-color:rgb(88, 204, 255)"
							onclick="loadId()">
						
					</form>
				</div>
			</div>


			<div style="display: none;" id="modalSheet">
			<div id=modalLay>
				<div class="modal-dialog" role="document">
					<div class="modal-content rounded-6 shadow" style="width: 400px; height: 400px;">
						<div class="modal-header border-bottom-0">
							<h5 class="modal-title">아이디 찾기</h5>
							<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"
								onclick="f_in22()"></button>
						</div>
						<div align="center">회원님의 아이디는 다음과 같습니다.</div>
						<div class="modal-body py-0" id=target></div>
						<div class="modal-footer flex-column border-top-0">
							<button type="button" onclick="location.href='login.jsp'"
								class="btn btn-lg btn-primary w-100 mx-0 mb-2" style="background-color:rgb(88, 204, 255); border: none; ">로그인</button>
							<button type="button" class="btn btn-lg btn-light w-100 mx-0" data-bs-dismiss="modal"
								onclick="f_in22()">닫기</button>
						</div>
					</div>
				</div>
				</div>
			</div>
			<script>
				var v_in2 = document.querySelector("#modalSheet");
				var schId;
				var target = document.getElementById("target");
	//			console.log("check:",target);

				function f_in2() {
					v_in2.style.display = "block";
				}

				function f_in22() {
					v_in2.style.display = "none";
				}

				function loadId() {
					$.ajax({
						type: "get",
						url: "<%=request.getContextPath()%>/SearchId.do",
						data: "memNm="+$("input[name=memNm]").val()+"&memTel="+$("input[name=memTel]").val(),
						dataType: "text",
						success: function (p_arg) {
							console.log(p_arg);
							if (p_arg == "등록하신 아이디가 없습니다.") {
								alert("dd");
								target.innerText = p_arg;
							} else {
								target.innerText = p_arg;
								f_in2();
							}
						}
					})
				}
			</script>
			<script src="/TravelPackage/assets/dist/js/bootstrap.bundle.min.js"></script>
		</body>

		</html>
		<%@include file="../Footer.jsp" %>