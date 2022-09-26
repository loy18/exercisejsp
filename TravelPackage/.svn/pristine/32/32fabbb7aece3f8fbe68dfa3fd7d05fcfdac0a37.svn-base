<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- jQuery -->
<script type="text/javascript"
	src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<!-- iamport.payment.js -->
<script type="text/javascript"
	src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button onclick="requestPay()">결제하기</button>
	<script>
		var IMP = window.IMP;

		IMP.init("imp27757035");
		//결제 요청하기
		function requestPay() {
			// IMP.request_pay(param, callback) 결제창 호출
			IMP.request_pay({ // param
				pg : "kakaopay.TC0ONETIME",
				pay_method : "card",
				merchant_uid : "a"+Math.floor(Math.random()*1000000),
				name : "노르웨이 회전 의자",
				amount : 64900,
				buyer_email : "gildong@gmail.com",
				buyer_name : "홍길동",
				buyer_tel : "010-4242-4242",
				buyer_addr : "서울특별시 강남구 신사동",
			}, function(rsp) { // callback
				if (rsp.success) { // 결제 성공 시: 결제 승인 또는 가상계좌 발급에 성공한 경우
					location.href="/TravelPackage/rsv/rsvInsert.do";
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