<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../Header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>비밀번호 찾기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<style>
#ch2 {
	display: inline-block;
	border: 1px solid gray;
	border-bottom-style: none;
	height: 70px;
	width: 395px;
}

#ch1 {
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
	height: 300px;
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
	outline: 2px solid rgb(88,204,255);
}

#a {
	border: none;
}

#in1 {
	border: 1px solid rgb(219, 217, 217);
	height: 50px;
	font-size: 12px;
	width: 500px;
}

#in3 {
	border: 1px solid rgb(219, 217, 217);
	height: 50px;
	font-size: 12px;
	width: 100px;
}

#in2 {
	border: none;
	border-radius: 6px;
	width: 120px;
	height: 50px;
	color: white;
}
</style>
</head>
<body>
	<div id=wrapper align="center">
		<br> <br> <br>
		<h4>아이디/비밀번호를 잊어버리셨나요?</h4>
		<br> <br> <br>
		<div id="ch1" OnClick="location.href ='IdSearch.jsp'" style="cursor: pointer;"> <br/>아이디 찾기</div>
		<div id="ch2" OnClick="location.href ='PwSearch.jsp'" style="cursor: pointer;"> <br/>비밀번호 찾기</div>
		<br> <br> <br>
		<div id=table>
			<!--  <form action="<%=request.getContextPath()%>/SearchPw.do"
				method="post">-->
				<form action="<%=request.getContextPath()%>/ranNumPw.do">
				<table id=table1>
					<colgroup>
						<col style="width: 19%; height: 100px; background-color: rgb(247, 247, 247); text-align: center;">
					</colgroup>
					<tbody>
						<tr style="border: 1px solid rgb(219, 217, 217); border-left-style: none; border-right-style: none;">
							<th style="text-align: center">이름</th>
							<td>
								<div id=a>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<input id=in1 type="text" title="휴대폰번호" name="memTel" placeholder="&nbsp;&nbsp;이름을 입력해주세요.">
								</div>
							</td>
						</tr>
						<tr style="border: 1px solid rgb(219, 217, 217); border-left-style: none; border-right-style: none;">
							<th style="text-align: center">이메일</th>
							<td>
								<div id=a>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<input id=in1 class="memMail" type="text" title="이메일" name="memMails" placeholder="&nbsp;&nbsp;이메일을 입력해 주세요.">
									<input id=in3 type="button" value="인증번호 요청" onclick="checkId()">
								</div>
							</td>
						</tr>
						<tr style="border: 1px solid rgb(219, 217, 217); border-left-style: none; border-right-style: none;">
							<th style="text-align: center">인증번호</th>
							<td>
								<div id=a>
									&nbsp;&nbsp;&nbsp;&nbsp;
									<input id=in1 class="cerNum" type="text" title="인증번호" name="인증번호" placeholder="&nbsp;&nbsp;인증번호를 입력해주세요."> 
									<input id=in3 class="cerBtn" type="button" value="인증하기">
								</div>
							</td>
						</tr>
					</tbody>
				</table>
				<br> 
				<a href="login.jsp">
					<input id=in2 type="button" value="이전" style="background-color: rgb(91, 96, 110)"> 
				</a> 
				
					<!-- form? 써야되나? -->
					<input id=in2 class="ranPw" type="button" value="다음" onClick="rsRanNum()" style="background-color: rgb(88, 204, 255)">
				</form>
			</form>
		</div>
	</div>
	
<script>
	let arr = new Uint32Array(1);
	let crypto = window.crypto || window.webkitCrypto || window.mozCrypto || window.oCrypto || window.msCrypto;
	window.crypto.getRandomValues(arr);
	let sRanNum = arr[0];

	function checkId() {
		//let idResult = $("#idResult");
		let id = $(".memMail").val();
		let idCheck = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
		//let certificationNum = $("#certificationNum");
		if(!idCheck.test(id)){
			alert("이메일 형식으로 입력하십시오.");
			return false;
		}
		
		$.ajax({
			type:"get",
			url:"<%=request.getContextPath()%>/idCheck.do",
			data:"check=" +  $(".memMail").val(),
			dataType:"text",
			success:function(p_rslt){
				console.log(p_rslt);
			if(p_rslt == "NO"){
				eMailCheck(sRanNum)
				alert("인증번호가 전송되었습니다.");
			}else {
				alert("이메일이 존재하지 않습니다.");
			}
		},
			error: function (request, status, error) {
		        console.log("code: " + request.status)
		        console.log("message: " + request.responseText)
		        console.log("error: " + error);
		    }
		})	
	}
	
	function eMailCheck(sRanNum) {
		$.ajax({
			type:"post",
			url:"<%=request.getContextPath()%>/eMailCheck.do",
			data:{	"cerNum": sRanNum,
					"mail":	$(".memMail").val()
			},
			dataType:"text",
			success:function(eqNum){
				if(eqNum == "OK"){
					let cerCfm = $(".cerBtn");
					cerCfm.click(function cerLast() {
						if(sRanNum == $(".cerNum").val()){
							alert("인증번호가 일치합니다.");
							$(".cerNum").attr("disabled",true);
							cerCfm.remove();
							$(".ranPw").removeAttr("onclick");
							$(".ranPw").attr("type","submit");
							//$(".ranPw").attr("type","submit");
						}else {
							console.log($(".cerNum").val());
							alert("인증번호를 다시 확인해주세요.");
						}
					})
				}else{
					alert("인증과정에서 오류가 생겼습니다. 관리자에게 문의해주세요.");
				}
				//cerConfirm(eqNum);
			},
			error: function (request, status, error) {
		        console.log("code: " + request.status)
		        console.log("message: " + request.responseText)
		        console.log("error: " + error);
			}
		})
	}	
	
	
	function rsRanNum() {
		alert("이메일 인증을 완료해주세요.");
	}
	
</script>	
</body>
</html>
<%@include file="../Footer.jsp"%>