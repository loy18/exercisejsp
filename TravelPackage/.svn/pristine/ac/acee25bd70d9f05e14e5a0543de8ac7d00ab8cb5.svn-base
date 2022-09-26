<%@page import="kr.or.ddit.app.compkg.vo.ComPkgVO"%>
<%@page import="kr.or.ddit.app.pkg.vo.DetailTourVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="kr.or.ddit.app.pkg.vo.DtPkgVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./Header.jsp"%>

<%
	List<ComPkgVO> comPkgList = (List<ComPkgVO>) request.getAttribute("comPkgList");
	PkgVO pv = (PkgVO) request.getAttribute("pkgVO");
	List<DtPkgVO> dpv = (List<DtPkgVO>) request.getAttribute("dtPkgList");
	List<List<DetailTourVO>> dtv = (List<List<DetailTourVO>>) request.getAttribute("dtTourList");

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세페이지</title>
<!-- 합칠거 ---------------------------------------------------------------->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<!-- iamport.payment.js -->
<script type="text/javascript"
	src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
<!------------------------------------------------------------------------>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js" integrity="sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js" integrity="sha512-uto9mlQzrs59VwILcLiRYeLKPPbS/bT71da/OEBYEwcdNUk8jYIy+D176RYoop1Da+f9mvkYrmj5MCLZWEtQuA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.css" integrity="sha512-aOG0c6nPNzGk+5zjwyJaoRUgCdOrfSDhmMID2u4+OIslr0GjpLKo7Xm0Ao3xmpM4T8AmIouRkqwj1nrdVsLKEQ==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<style>
	#kakao{
	position: absolute;
	left: 1350px;
	bottom: -25px;
	}
</style>

</head>
<body>
	<div class="container">
	
		<div class="row mt-4">
			<div id="category" class="col-2">
			</div>
			<div class="col-9 offset-1">
				<!-- 여기부터 시작 -->
				<div class="card mb-3">
					<div class="row g-0">
						<div class="col-md-4">
							<img
								src="https://image.hanatour.com/usr/cms/resize/800_0/2019/10/16/10000/bf86919f-b177-4fa6-ba75-b8b5db83ab53.jpg"
								class="img-fluid rounded-start" alt="...">
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">
									<strong> <!-- 여기는 제목을 넣어주세용 --> <!-- 여기는 제목을 넣어주세용 -->
										<!-- PKG_NM --> <%=pv.getPkgNm() %>
									</strong>
								</h5>
								<!-- ???? PKG_CONT -->
								<!-- 여기는 간단한 설명을 넣어주세용 -->
								<!-- 여기는 간단한 설명을 넣어주세용 -->
								<p class="card-text"></p>
								
								<p class="card-text"><%=pv.getPkgCont() %></p>

								<p class="card-text text-end fs-2">
									<strong><%=pv.getPkgPri() %></strong>
									<!-- 여기는 금액입니다!! -->
									<!-- PKG_PRI -->
									<span class="fs-5">원</span>
								</p>
							</div>
						</div>
					</div>
					
				</div>

				<div class="row" >
				
					<div class="col-9" style="display: inline-block;" >
						
						<div class="card-body" >
							<!-- 간단한 여행 설명? -->
							<h4 class="card-title">
								<strong>상세정보</strong>
							</h4>

							<table class="table table-bordered">
								<tr>
									<th scope="col">가격</th>
									<td style="text-align: center" ><%=pv.getPkgPri() %></td>
								</tr>
								<tr>
									<th scope="row">지역</th>
									<td style="text-align: center"><%=pv.getPkgReg() %></td>
								</tr>
								<tr>
									<th scope="row">가이드 여부</th>
									<td style="text-align: center"><%=pv.getPkgGui() %></td>
								</tr>
								<tr>
									<th scope="row">최소 / 최대인원</th>
									<td style="text-align: center"><%=pv.getPkgMinTo() %> / <%=pv.getPkgMaxTo() %></td>
								</tr>
							</table>
							<div id=kakao class="card text-end border-light mb-3">
							<div class="card-body">
							<!-- 이거의 밸류가  세션이든 req.getparameter든 들어가게 하자 -->
								<input class="form-control" placeholder="출발일을 선택하세요" type="text"
									aria-label="readonly input example" readonly id="datepicker">
							</div>
							<div class="card-body ">
							<!-- 인원수를? 예약 수량으로 ? 그럼 이것도 저장 -->
								<p class="card-text fs-4" id=srvQty>인원수</p>
								<div class="btn-group" role="group" aria-label="Basic example"
									style="display: inline-flex;">
									<button type="button" onclick="f_minus()"
										class="btn btn-primary">-</button>
									<input style="width: 60px;"
										class="form-control text-center border-0" id="people"
										type="number" value="1" aria-label="readonly input example"
										readonly name=people>
									<button type="button" onclick="f_plus()"
										class="btn btn-primary">+</button>
								</div>
								<!-- 날짜선택 -->

							</div>
							<div class="card-body fs-3">
								<p>
									<!-- 금액 -->
									<strong id="price">10000</strong> <span>원</span>
								</p>
							</div>
							<!-- 11111111111=============================================================================================================================================================-->
							<a href="#" class="btn btn-primary" onclick="postQty(); requestPay() ">예약하기</a>
							<!-- =============================================================================================================================================================-->
						</div>
						<% 	
							for(int i = 0; i < dpv.size(); i++){
						%>
							<!-- 일차로 나누기 테이블에 여행 등록수정일자???? -->
							<!-- 아코디언!!!!!!!! 여행상품넣기 -->
							<div class="accordion" id="accordionExample">
								<div class="accordion-item">
									<h2 class="accordion-header" id="headingOne">
										<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne"><%=i+1+"일차" %></button>
									</h2>
									<div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
										<div class="accordion-body">
											<div class="text-left">
												<!-- 관광지 이미지 링크로!!! 넣기-->
												<img
													src="http://image1.lottetour.com/static/trvtour/201910/1715/011ee82200cbf4f301c382e19f44b28e"
													class="rounded" alt="..."
													style="height: 300px; width: 300px;"> <img
													src="http://image1.lottetour.com/static/trvtour/201910/1715/011ee82200cbf4f301c382e19f44b28e"
													class="rounded" alt="..."
													style="height: 300px; width: 300px;">
											</div>

											<!-- 일차별 일정 정보표시 -->
											이동수단 회사명:<strong><%=dpv.get(i).getDtVehcComp()%></strong><br>
											이동수단 구분:<strong><%=dpv.get(i).getDtVehcSe()%></strong><br>
											숙박 구분:<strong><%=dpv.get(i).getDtAcmSe()%></strong><br>
											숙소 이름:<strong><%=dpv.get(i).getDtAcmNm()%></strong><br>
											숙소 주소:<strong><%=dpv.get(i).getDtAcmAddr()%></strong><br>
											숙소 설명:<strong><%=dpv.get(i).getDtAcmCont()%></strong><br>
										<%
											for(int j=0; j < dtv.get(i).size(); j++) { 
										%>
											관광 상품명:<strong><%=dtv.get(i).get(j).getDeTourNm()%></strong><br>
											관광 상품 구분:<strong><%=dtv.get(i).get(j).getDeTourSe()%></strong><br>
											관광 주소:<strong><%=dtv.get(i).get(j).getDeTourAddr()%></strong><br>
											
											<code>이건 바로 강조글씨</code>
										<%	
											}
										%>
										</div>
									</div>
								</div>
						<% } %>

								<div class="accordion-item">
									<h2 class="accordion-header" id="headingTwo">
										<button class="accordion-button collapsed" type="button"
											data-bs-toggle="collapse" data-bs-target="#collapseTwo"
											aria-expanded="false" aria-controls="collapseTwo">#
											숙박</button>
									</h2>
									<div id="collapseTwo" class="accordion-collapse collapse"
										aria-labelledby="headingTwo"
										data-bs-parent="#accordionExample">
										<div class="accordion-body">
											<div class="text-left">
												<!-- 호텔 이미지 넣기-->
												<img
													src="http://image1.lottetour.com/static/trvtour/201910/1715/011ee82200cbf4f301c382e19f44b28e"
													class="rounded" alt="..."
													style="height: 300px; width: 300px;"> <img
													src="http://image1.lottetour.com/static/trvtour/201910/1715/011ee82200cbf4f301c382e19f44b28e"
													class="rounded" alt="..."
													style="height: 300px; width: 300px;">
											</div>
											<!-- 호텔 설명 넣기-->
											<strong>This is the second item's accordion body.</strong> It
											is hidden by default, until the collapse plugin adds the
											appropriate classes that we use to style each element. These
											classes control the overall appearance, as well as the
											showing and hiding via CSS transitions. You can modify any of
											this with custom CSS or overriding our default variables.
											It's also worth noting that just about any HTML can go within
											the
											<code>.accordion-body</code>
											, though the transition does limit overflow.
										</div>
									</div>
								</div>



								<div class="accordion-item">
									<h2 class="accordion-header" id="headingThree">
										<button class="accordion-button collapsed" type="button"
											data-bs-toggle="collapse" data-bs-target="#collapseThree"
											aria-expanded="false" aria-controls="collapseThree">
											# 교통</button>
									</h2>
									<div id="collapseThree" class="accordion-collapse collapse"
										aria-labelledby="headingThree"
										data-bs-parent="#accordionExample">
										<div class="accordion-body">
											<!-- 이동수단 설명 넣기-->
											<strong>This is the third item's accordion body.</strong> It
											is hidden by default, until the collapse plugin adds the
											appropriate classes that we use to style each element. These
											classes control the overall appearance, as well as the
											showing and hiding via CSS transitions. You can modify any of
											this with custom CSS or overriding our default variables.
											It's also worth noting that just about any HTML can go within
											the
											<code>.accordion-body</code>
											, though the transition does limit overflow.
										</div>
									</div>
								</div>
							</div>
						</div>
						
					</div>




				</div>
								
				<!-- 여기까지 끝 -->
			</div>
		</div>
	</div>


	<script type="text/javascript">
	/*22222222222=====================================================================================================================================================*/
	var IMP = window.IMP;
	IMP.init("imp27757035");
	var min = "<%=comPkgList.get(0).getComPkgDay()%>";
/*=====================================================================================================================================================*/
		var saram = document.querySelector("#people").value;
		var price = document.querySelector("#price").innerHTML;
		var money = parseInt(price);
		// alert(typeof(parseInt(price)));
		function f_plus() {
			saram++;
			document.querySelector("#people").value = saram;
			money += parseInt(price);
			document.querySelector("#price").innerHTML = money;

		}
		function f_minus() {
			if (saram > 0) {
				saram--;
				document.querySelector("#people").value = saram;

				money -= parseInt(price);
				document.querySelector("#price").innerHTML = money
			}
			if (saram < 0 || saram == 0) {
				document.querySelector("#people").value = 1;
				document.querySelector("#price").innerHTML = price;
			}
		}
		
	    $(function(){
	    	$('#datepicker').datepicker({
	    		controlType:'select',
	    		oneLine:true,
	    		dateFormat: 'yy-mm-dd',
	    		prevText: '이전 달',
	    	    nextText: '다음 달',
	    	    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    	    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    	    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
	    	    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
	    	    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
	    	    showMonthAfterYear: true,
	    	    yearSuffix: '년',
	    	    minDate: 0,
	    	    beforeShowDay: noWeekendsOrHolidays
	    	});
	    	 
	    	$('#datepicker').val($.datepicker.formatDate('yy-mm-dd', new Date()));

	      });
	    var disDays = [];

	    for(let i=1; i<= 30; i++){
	    	if( i == min2){
	    		continue;
	    	}
	        disDays.push("9-" + i + "-2022");
	    }
	    for(let i=1; i<= 31; i++){
	        disDays.push("10-" + i + "-2022");
	    }

	    /* utility functions */
	    function nationalDays(date) {
	    	var m = date.getMonth(), d = date.getDate(), y = date.getFullYear();
	    	//console.log('Checking (raw): ' + m + '-' + d + '-' + y);
	    	for (i = 0; i < disDays.length; i++) {
	    		if($.inArray((m+1) + '-' + d + '-' + y,disDays) != -1 || new Date() > date) {
	    			//console.log('bad:  ' + (m+1) + '-' + d + '-' + y + ' / ' + disabledDays[i]);
	    			return [false];
	    		}
	    	}
	    	//console.log('good:  ' + (m+1) + '-' + d + '-' + y);
	    	return [true];
	    }
	    function noWeekendsOrHolidays(date) {
	    	return nationalDays(date);
	    }
	    
	    /*33333333=====================================================================================================================================================*/		
		function postQty() {
			var data = "rsvQty=" + $("#people").val();
			var data2 = "comPkgDay=" + $("#datepicker").val();
			$.ajax({
				type: "get",
				url: "<%=request.getContextPath()%>/rsv/rsvInsert.do",
				data: {rsvQty: $("#people").val(), comPkgDay: $("#datepicker").val(), pkgId: <%=pv.getPkgId()%>},
				dataType: "text",
				success: function (p_arg) {
					console.log(p_arg);
					if (p_arg == "s") {
					} else {
					}
				}
			})
		}
		/*=====================================================================================================================================================*/
		/*4444444444=====================================================================================================================================================*/		
			//결제 요청하기
			function requestPay() {
				// IMP.request_pay(param, callback) 결제창 호출
				IMP.request_pay({ // param
					pg : "kakaopay.TC0ONETIME",
					pay_method : "card",
					merchant_uid : "a"+Math.floor(Math.random()*100000000),
					name : "노르웨이 회전 의자",
					amount : 64900,
					buyer_email : "gildong@gmail.com",
					buyer_name : "홍길동",
					buyer_tel : "010-4242-4242",
					buyer_addr : "서울특별시 강남구 신사동",
				}, function(rsp) { // callback
					if (rsp.success) { // 결제 성공 시: 결제 승인 또는 가상계좌 발급에 성공한 경우
						alert("결제 성공!")
					} else {
						alert("결제에 실패하였습니다. 에러 내용: " + rsp.error_msg);
					}
				});
			}
			//리디렉션 설정하기
			// IMP.request_pay(param, callback) 호출
			/*  IMP.request_pay({
			      m_redirect_url: "{리디렉션 될 URL}" // 예: https://www.myservice.com/payments/complete/mobile
			  }, /* callback ); // callback은 실행 안됨*/

	</script>
</body>
</html>
<%@include file="./Footer.jsp"%>
