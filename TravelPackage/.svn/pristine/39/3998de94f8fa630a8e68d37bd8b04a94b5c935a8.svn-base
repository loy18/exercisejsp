<%@page import="kr.or.ddit.app.tour.vo.TourVO"%>
<%@page import="kr.or.ddit.app.vehc.vo.VehcVO"%>
<%@page import="kr.or.ddit.app.acm.vo.AcommodationVO"%>
<%@page import="kr.or.ddit.app.sch.vo.SchVO"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="kr.or.ddit.app.compkg.vo.ComPkgVO"%>
<%@page import="java.io.File"%>
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
	AtchFileVO pkgFile = (AtchFileVO) request.getAttribute("pkgFile");
	
	List<AcommodationVO> acmList = (List<AcommodationVO>)request.getAttribute("acmList");
	List<VehcVO> vehcList = (List<VehcVO>)request.getAttribute("vehcList");
	List<List<TourVO>> tourList = (List<List<TourVO>>)request.getAttribute("tourList");
	
	List<SchVO> schList = (List<SchVO>)request.getAttribute("schList");
	List<AtchFileVO> acmFile = (List<AtchFileVO>)request.getAttribute("acmFile");
	List<List<AtchFileVO>> tourFileList = (List<List<AtchFileVO>>)request.getAttribute("tourFileList");

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
	}
	.b{
		border: 2px solid black;	
	}
</style>


</head>
<body>
	<div class="container">
	
		<div class="row mt-4">
			<div class="col-9 offset-2">
				<!-- 여기부터 시작 -->
				<div class="card mb-3">
					<div class="row g-0">
						<div class="col-md-5 p-3">
							<img
								src="<%=request.getContextPath() + File.separator%>pkg/<%=pkgFile.getAtchFileDeSav()%>"
								class="img-fluid rounded-start" alt="..." width="100%">
						</div>
						<div class="col-md-7">
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
								
								<% if(pv.getPkgCont().length() > 200) { %>
								<p class="card-text"><%=pv.getPkgCont().substring(0,200) %></p>
								<% } else{ %>
								<p class="card-text"><%=pv.getPkgCont() %></p>

								<% } %>
								<p class="card-text text-end fs-2">
									<strong><%=pv.getPkgPri()%></strong>
									<!-- 여기는 금액입니다!! -->
									<!-- PKG_PRI -->
									<span class="fs-5">원</span>
								</p>
							</div>
						</div>
					</div>
					
				</div>

				<div class="row mb-4" >
					<div class="col-9">
						<div class="card-body" >
							<h4 class="card-title">
								<strong>상세정보</strong>
							</h4>

							<table class="table table-bordered">
								<tr>
									<th scope="col">일정</th>
									<td style="text-align: center" ><%=Integer.parseInt(pv.getPkgDay())-1 + "박" + pv.getPkgDay()+"일" %></td>
								</tr>
								<tr>
									<th scope="row">여행도시</th>
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
								<tr>
									<th scope="row">식사</th>
									<td style="text-align: center">일정표상 식사</td>
								</tr>
							</table>
						</div>
					</div>
					<div class="col-3">
						<div id="kakao" class="card text-end border-light mb-2">
								<div class="card-body">
								<!-- 이거의 밸류가  세션이든 req.getparameter든 들어가게 하자 -->
									<input class="form-control" placeholder="출발일을 선택하세요" type="text"
										aria-label="readonly input example" readonly id="datepicker">
								</div>
								<div class="text-center">
								<!-- 인원수를? 예약 수량으로 ? 그럼 이것도 저장 -->
									<h5 class="m-0">인원수</h5>
									<div class="btn-group" role="group" aria-label="Basic example"
										>
										<button type="button" onclick="f_minus()"
											class="btn btn-primary">-</button>
										<input style="width: 50px;"
											class="form-control text-center border-0" id="people"
											type="number" value="1" aria-label="readonly input example"
											readonly name="people">
										<button type="button" onclick="f_plus()"
											class="btn btn-primary">+</button>
									</div>
									
									<!-- 날짜선택 -->
	
								</div>
								<div class="m-3 text-center">
										<!-- 금액 -->
										<strong id="price" class="fs-4"><%=pv.getPkgPri() %></strong><span>원</span>
								</div>
								<!-- 11111111111=============================================================================================================================================================-->
								<a href="#" class="btn btn-primary m-4" onclick="requestPay()">예약하기</a>
								<!-- =============================================================================================================================================================-->
						</div>
					</div>
				</div>
				<div class="row">
						<!-- <% 	
							for(int i = 0; i < schList.size(); i++){
						%>
							<!-- 일차로 나누기 테이블에 여행 등록수정일자???? -->
							<!-- 아코디언!!!!!!!! 여행상품넣기 -->
							<div class="accordion" id="accordionExample">
								<div class="accordion-item">
									<h2 class="accordion-header" id="headingOne">
										<button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne"><%=i+1+"일차" %></button>
									</h2>
									<div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
										<div class="accordion-body container-fluid">
											<div class="row mt-2 mb-2">
												<!-- 일차별 일정 정보표시 -->
												<strong>이동수단 :<%=vehcList.get(i).getVehcSe()%>(<%=vehcList.get(i).getVehcComp()%>)</strong><br>
											</div>
											<% for(int j=0; j<tourList.size(); j++) { %>
											<div class="row mt-2 mb-2">
												<img												
														src="<%=request.getContextPath() + File.separator%>tour/<%=tourFileList.get(i).get(j).getAtchFileDeSav()%>"
														class="rounded col-4" alt="..."
														style="height: 220px;"> 
												<div class="col-8">
													<br>
													<h5 ><%=tourList.get(i).get(j).getTourNm()%></h5>
													<h6 style="font-size:0.8em; color:gray">&nbsp;&nbsp;<%=tourList.get(i).get(j).getTourAddr()%></h6>
													<%if(tourList.get(i).get(j).getTourCont().length() >= 150){ %>
														<h6>&nbsp;<%=tourList.get(i).get(j).getTourCont().substring(0, 150) + "..."%></h6>
													<%} else{ %>
														<h6>&nbsp;<%=tourList.get(i).get(j).getTourCont()%></h6>
													<%} %>
												</div> 
											</div>
											<hr>
											<% } %>
											<% if(schList.size()-1 != i) {%>
											<div class="row mt-2">
												<!-- 숙박 이미지 -->
												<img
													src="<%=request.getContextPath() + File.separator%>acm/<%=acmFile.get(i).getAtchFileDeSav()%>"
													class="rounded col-4" alt="..." style="height:220px;">
												<div class="col-8">
													<br>
													<h5 ><%=acmList.get(i).getAcmNm()%>(<%=acmList.get(i).getAcmSe()%>)</h5>
													<h6 style="font-size:0.8em; color:gray">&nbsp;&nbsp;<%=acmList.get(i).getAddr()%></h6>
													<%if(acmList.get(i).getAcmCont().length() >= 150){ %>
														<h6>&nbsp;<%=acmList.get(i).getAcmCont().substring(0, 150)+ "..."%></h6>
													<%} else{ %>
														<h6>&nbsp;<%=acmList.get(i).getAcmCont()%></h6>
													<%} %>
												</div> 
											</div>
											<%} %>
										</div>
									</div>
								</div>
							</div>
						<% } %> 

				</div>
			</div>
			<!-- 여기까지 끝 -->
		</div>
	</div>


	<script type="text/javascript">
	/*22222222222=====================================================================================================================================================*/
	var IMP = window.IMP;
	IMP.init("imp27757035");
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
	    	    beforeShowDay: noWeekendsOrHolidays,
	    	});
	    	 
	    	$('#datepicker').val($.datepicker.formatDate('yy-mm-dd', new Date()));
			$('#datepicker').datepicker('setDate', '');
	      });
	    var disDays = [];

	    for(let i=1; i<= 30; i++){
	    	if( i == 30){
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
	   	
	
		/*=====================================================================================================================================================*/
		/*3333333=====================================================================================================================================================*/		
			//결제 요청하기
			function requestPay() {
				// IMP.request_pay(param, callback) 결제창 호출
				if(f_dateEmpty()){
					alert("날짜를 선택해주세요");
					return;
				}
				IMP.request_pay({ // param
					pg : "kakaopay.TC0ONETIME",
					pay_method : "card",
					merchant_uid : "a"+Math.floor(Math.random()*1000000),
					name : "중프",
					amount : 64900,
					buyer_email : "gildong@gmail.com",
					buyer_name : "홍길동",
					buyer_tel : "010-4242-4242",
					buyer_addr : "서울특별시 강남구 신사동",
				}, function(rsp) { // callback
					if (rsp.success) { // 결제 성공 시: 결제 승인 또는 가상계좌 발급에 성공한 경우
						alert("결제 성공!")
						$("#people").val()
						$("#datepicker").val()
						location.href="<%=request.getContextPath()%>/rsv/rsvInsert.do?rsvQty="+$('#people').val()+"&comPkgDay=" + $("#datepicker").val() + "&pkgId=<%=pv.getPkgId()%>";
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
			  
			function f_dateEmpty(){
				console.log($("#datepicker").val());
				if($("#datepicker").val()){
					return 0;
				}
				return 1;
			}

	</script>
</body>
</html>
<%@include file="./Footer.jsp"%>
