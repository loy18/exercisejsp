<!-- 지우고 IMPORT 삽입 -->
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
<title>Insert title here</title>
<script
	src="
https://cdnjs.cloudflare.com/ajax/libs/Chart.js/3.9.1/chart.min.js"></script>
</head>
<body>
	<div class="container">

		<div class="row mt-4 b">
			<div id="category" class="col-2 b">
				<script src="./category.js"></script>
			</div>
			<div class="col-9 offset-1 b">
				<h1>매출현황</h1>
				<hr>

				<div class="row">
					<div class="col-sm-6 b">
						<button style="display: block" type="button" onclick="Sales()"
							class="btn btn-outline-dark salesFbtn">기간별 매출 현황</button>

						<div style="display: none" class="col-5 salesBtn"
							style="margin-left: 0px;">
							<select onchange="if(this.value) location.href=(this.value);"
								class="form-select" aria-label="Default select example"
								cursorshover="true">
								<option value="#">선택하세요</option>
								<option value="#">주 매출 현황</option>
								<option value="#">당월 매출 현황</option>
								<option value="#">2022년도 총 현황</option>
							</select>
						</div>
					</div>
					<div class="col-sm-6 b">
						<button style="display: block" type="button" onclick="Sales2()"
							class="btn btn-outline-dark salesFbtn">상품별 판매수량 현황</button>

						<div style="display: none" class="col-5 salesBtn"
							style="margin-left: 0px;">
							<select onchange="if(this.value) location.href=(this.value);"
								class="form-select" aria-label="Default select example"
								cursorshover="true">
								<option value="#">선택하세요</option>
								<option value="#">운송수단별 현황</option>
								<option value="#">관광상품별 현황</option>
								<option value="#">숙박업소별 현황</option>
							</select>
						</div>
					</div>
						<div class="col-6">
							<canvas id="myChartOne"></canvas>
						</div>
						<div class="col-6">
							<canvas id="myChartTwo"></canvas>
						</div>
						<div class="col-6 offset-3">
							<canvas id="myChartThree"></canvas>
						</div>
					<hr>
				</div>

			</div>
		</div>
		<script>

		let myChartOne = document.getElementById('myChartOne').getContext('2d');
		let myChartTwo = document.getElementById('myChartTwo').getContext('2d');
		let myChartThree = document.getElementById('myChartThree').getContext('2d');


		let barChartOne = new Chart(myChartOne, {
			type: 'bar',
			data: {
				labels: ['학원', '연구원', '출판사', '미디어사', '위니브'],
				datasets: [{
					label: '바울랩 매출액',
					data: [
						10, 20, 30, 40, 50
					],
					backgroundColor: [
						'red', 'blue', 'yellow', 'orange', 'green'
					],
					borderWidth: 3,
					borderColor: 'black',
					hoverBorderWidth: 8
				}]
			}
		})
		let barChartTwo = new Chart(myChartTwo, {
			type: 'line',
			data: {
				labels: ['학원', '연구원', '출판사', '미디어사', '위니브'],
				datasets: [{
					label: '바울랩 매출액',
					data: [
						10, 20, 30, 40, 50
					],
					backgroundColor: [
						'red', 'blue', 'yellow', 'orange', 'green'
					],
					borderWidth: 3,
					borderColor: 'black',
					hoverBorderWidth: 8
				}]
			}
		})
		let barChartThree = new Chart(myChartThree, {
			type: 'doughnut',
			data: {
				labels: ['학원', '연구원', '출판사', '미디어사', '위니브'],
				datasets: [{
					label: '바울랩 매출액',
					data: [
						10, 20, 30, 40, 50
					],
					backgroundColor: [
						'red', 'blue', 'yellow', 'orange', 'green'
					],
					borderWidth: 3,
					borderColor: 'black',
					hoverBorderWidth: 8
				}]
			},
			options: {
				maintainAspectRatio: false,
				title: {
					display: true,
					text: '바울랩 매출',
					fontSize: 30,
					fontColor: 'red'
				},
				legend : {
					display : true,
					position : 'right' // 오른쪽
				},
				tooltips : {
					enabled : false
				},
				layout : {
					padding : {
						left : 20,
						right :20,
						top : 40,
						bottom : 0
					}
				}
			}
		})
		</script>
</body>
</html>
<%@include file="../Footer.jsp"%>