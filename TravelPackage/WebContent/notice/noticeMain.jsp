<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<!-- 지우고 본문상단 삽입 -->
<!-- 지우고 본문상단 삽입 -->
<!-- 지우고 본문상단 삽입 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항메인</title>
</head>

<body>
	<div class="container">
		<div class="row mt-4 ">
			<div id="category" class="col-2 ">
				<script src="../notice/category.js"></script>
			</div>

			<div class="col-9 offset-1 ">
				<div class="row ">
					<div class="col-12" style="background-color: aliceblue">
						<h4 style="padding: 40px;">
							모두의여행 <span style="color: blue">고객센터</span> 입니다 무엇을 도와드릴까요?
						</h4>
					</div>
					<div class="col-md-7 b">

						<form class="row">
							<input type="search" class="col-sm-8" placeholder="검색어를 입력하세요."
								offset-1="">
							<button type="submit" class="btn btn-outline-success col-sm-2"
								cursorshover="true">검색</button>
						</form>
						<div style="padding-top: 20px; font-size: 15px;">
							키워드 <i class="fa-solid fa-tag"></i> <span class="keyword ">#결제취소</span>
							<span class="keyword ">#예약변경</span> <span class="keyword ">#코로나19</span>
						</div>
						<div class="row" style="margin-top: 30px;">
							<strong class="tit col-sm-10">자주 찾는 질문</strong> <a
								href="./FAQList.jsp" class="keyword col-sm-2"
								cursorshover="true">더보기<i class="fa-solid fa-arrow-right"
								cursorshover="true"></i></a>
						</div>
						<hr>
						<div class="accordion accordion-flush FAQ"
							id="accordionFlushExample">
							<div class="accordion-item">
								<h2 class="accordion-header" id="flush-headingOne">
									<button class="accordion-button collapsed" type="button"
										data-bs-toggle="collapse" data-bs-target="#flush-collapseOne"
										aria-expanded="false" aria-controls="flush-collapseOne"
										cursorshover="true">Q. 결제는 언제까지 해야 하나요?</button>
								</h2>
								<div id="flush-collapseOne" class="accordion-collapse collapse"
									aria-labelledby="flush-headingOne"
									data-bs-parent="#accordionFlushExample">
									<div class="accordion-body">
										A. 항공권 결제는 예약 완료 후 예약 정보 내 결제시한 전까지 해주셔야 합니다. <br>
										<code>경로 [마이페이지]&gt;[예약 및 결제내역]</code>

									</div>
								</div>
							</div>

							<div class="accordion-item">
								<h2 class="accordion-header" id="flush-headingTwo">
									<button class="accordion-button collapsed" type="button"
										data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo"
										aria-expanded="false" aria-controls="flush-collapseTwo"
										cursorshover="true">Q. 방금 예약했는데 이미 결제시한이 지났다고 나옵니다.</button>
								</h2>
								<div id="flush-collapseTwo" class="accordion-collapse collapse"
									aria-labelledby="flush-headingTwo"
									data-bs-parent="#accordionFlushExample">
									<div class="accordion-body">
										A. 항공사 결제시한이 임박한 경우, 이미 지난 시간으로 결제시한이 주어질 수 있습니다. 해당 경우
										[1:1문의게시판]를 통해 결제시한 연장이 가능한지 확인 후 결제 부탁드립니다. 결제시한 연장이 불가하거나 혹은
										업무시간 외에 생성된 예약은 사전 안내 없이 자동 취소될 수 있습니다.

										<code> (업무시간 : 평일 09:00-17:00 / 주말 및 공휴일 제외)</code>

									</div>
								</div>
							</div>

							<div class="accordion-item">
								<h2 class="accordion-header" id="flush-headingThree">
									<button class="accordion-button collapsed" type="button"
										data-bs-toggle="collapse"
										data-bs-target="#flush-collapseThree" aria-expanded="false"
										aria-controls="flush-collapseThree" cursorshover="true">Q.
										여러 명이 한 번에 예약한 경우 탑승자 중 1명의 카드로 전체 승객 결제가 가능한가요?</button>
								</h2>
								<div id="flush-collapseThree"
									class="accordion-collapse collapse"
									aria-labelledby="flush-headingThree"
									data-bs-parent="#accordionFlushExample">
									<div class="accordion-body">
										A. 탑승자 1명의 카드로 전체 승객 결제 가능합니다.
										<code> </code>

									</div>
								</div>
							</div>
							<div class="accordion-item">
								<h2 class="accordion-header" id="flush-headingFour">
									<button class="accordion-button collapsed" type="button"
										data-bs-toggle="collapse" data-bs-target="#flush-collapseFour"
										aria-expanded="false" aria-controls="flush-collapseFour"
										cursorshover="true">Q. 결제취소 후 마일리지 복원은 언제 되나요?</button>
								</h2>
								<div id="flush-collapseFour" class="accordion-collapse collapse"
									aria-labelledby="flush-headingFour"
									data-bs-parent="#accordionFlushExample">
									<div class="accordion-body">
										A. 호텔 마일리지 결제 후, 예약 취소 시, 영업일 기준 1~3일 이내로 원복 처리되오니 참고 바랍니다.
										(주말 토/일/공휴일 제외) 관련문의는 [1:1문의게시판]를 통해 문의 부탁드립니다.
										<code>(업무시간 : 평일 09:00-17:00 / 주말 및 공휴일 제외) </code>

									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="col-md-5 b">
						<strong style="padding: 10px" class="row">1:1문의 하기</strong>
						<h7>문의 및 궁금하신 사항을 남겨주세요</h7>
						<br>
<<<<<<< .mine
						
						
						 <button style="display:block" onclick="location.href='../qna/qnaList.do';" type="button"
||||||| .r276045
=======

						<div style="display: none; background-color: rgba(0, 0, 0, 0.7);"
							class="modal col-6" tabindex="-1">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header">
										<h5 class="modal-title">비회원 접근 입니다.</h5>
									</div>
									<div class="modal-body">
										<p>로그인 되지 않았습니다.</p>
										<p>1:1문의를 이용하시려면 로그인 해주세요.</p>
									</div>
									<div class="modal-footer">
										<button type="button" class="btn btn-primary"
											onclick="location='../login/login.jsp'">로그인으로이동</button>
										<button type="button" class="btn btn-secondary"
											onclick="location.href='../notice/noticeMain.jsp' ">돌아가기</button>
									</div>
								</div>
							</div>
						</div>
						<%
							if (session.getAttribute("id") == null) {
						%>
								<button onclick="loginPlease()" type="button"
>>>>>>> .r276493
							class="col-6 btn btn-outline-secondary btn-sm ">문의내역 확인</button>
<<<<<<< .mine
							
							
							
						  <button onclick="location.href='../qna/qnaInsert.jsp';"
							type="button" class="col-6 btn btn-outline-secondary btn-sm  ">1:1문의하기  </button>
						<hr>
||||||| .r276045
=======
								<button onclick="loginPlease()"
							type="button" class="col-6 btn btn-outline-secondary btn-sm  ">1:1문의하기
						</button>
>>>>>>> .r276493
						

						<%
							} else {
						%>

							<button onclick="location.href='../qna/qnaList.do';" type="button"
							class="col-6 btn btn-outline-secondary btn-sm ">문의내역 확인</button>
									<button onclick="location.href='../qna/qnaInsert.jsp';"
							type="button" class="col-6 btn btn-outline-secondary btn-sm  ">1:1문의하기
								</button>

						<%
							}
						%>
					



			
						<hr>

						<div class="row">
							<strong class="tit col-sm-9">공지사항</strong> <a
								href="../notice/noticeList.do" class="keyword col-sm-3"
								cursorshover="true">더보기<i class="fa-solid fa-arrow-right"
								cursorshover="true"></i></a>
						</div>
						<hr>
						<div class="col-sm-5">
							<h6>모두의여행 대표전화</h6>
							<i class="fa-solid fa-phone-volume fa-beat-fade col-sm-2"
								style="margin: auto; height: 20px"></i>
							<h7 class="col-sm-9">1588-1588</h7>
						</div>
						<hr>
						<div class="col-sm-5">
							<h6>해외 항공권 문의</h6>
							<i class="fa-solid fa-phone-volume fa-beat-fade col-sm-2"
								style="margin: auto; height: 20px"></i>
							<h7 class="col-sm-9">1588-1588</h7>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
	
	function loginPlease(){
		var modal = document.querySelector(".modal");
		modal.style.display = "block";
		
	}
	</script>
</body>

</html>
<%@include file="../Footer.jsp"%>