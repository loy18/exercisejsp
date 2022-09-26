<%@page import="java.io.File"%>
<%@page import="kr.or.ddit.app.common.vo.AtchFileVO"%>
<%@page import="kr.or.ddit.app.pkg.vo.PkgVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="./Header.jsp"%>
<%
	List<PkgVO> pkgList = (List<PkgVO>)request.getAttribute("pkgList");
	List<PkgVO> pkgList2 = (List<PkgVO>)request.getAttribute("pkgList2");
	List<List<AtchFileVO>> atchFileList = (List<List<AtchFileVO>>)request.getAttribute("atchFileList");
	List<List<AtchFileVO>> atchFileList2 = (List<List<AtchFileVO>>)request.getAttribute("atchFileList2");
%>

<!DOCTYPE html>
<html>
<style>
.rec {
	background-image: url('/TravelPackage/image/photo.png');
	background-repeat: no-repeat;
	background-size: auto;
}

#carouselExampleFade {
	width: 700px;
	height: 350px;
	margin: auto;
}
</style>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/linkKeyword.css">

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
	<!-- 추천다음에 넣으면 좋을듯? -->

	<div id="carouselExampleFade" class="carousel slide carousel-fade mt-5"
		data-bs-ride="carousel">
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img
					src="https://www.50plus.or.kr/upload/im/2019/01/57a058c2-087d-4443-a8be-bb94253ebfa5.jpg"
					class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img
					src="https://assets.blog.engoo.com/wp-content/uploads/sites/2/2022/01/14205148/%ED%98%BC%EC%9E%90%EC%97%AC%ED%96%89-back-image-%EB%B3%B5%EC%82%AC.jpg"
					class="d-block w-100" alt="...">
			</div>
			<div class="carousel-item">
				<img
					src="https://www.kagoshima-kankou.com/storage/tourism_themes/12/responsive_images/ElwnvZ2u5uZda7Pjcwlk4mMtr08kLNydT8zXA6Ie__1673_1115.jpeg"
					class="d-block w-100" alt="...">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleFade" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>
	<!-- 추천다음에 넣으면 좋을듯? -->

<!-- 여기부터 -->
<br>
<br>
<br>
<br>
<br>
	<div class="container px-4 py-5">
		<h2 class="mb-3 pb-3 display-7">인기 상품🎁</h2>
		<div class="row mt-2">
	<%for (int i=0; i<4; i++) { %>		
			<div class="col-3">
				<a href="<%=request.getContextPath()%>/pkg/pkgDt.do?pkgId=<%=pkgList.get(i).getPkgId() %>" class="text-decoration-none text-dark">
					 <img
						class="img-fluid" src="<%=request.getContextPath() + File.separator%>pkg/<%=atchFileList.get(i).get(0).getAtchFileDeSav()%>" width="100%">
					<div class="container-fluid">
						<div class="row" style="height:150px;;">
							<h6 class="mt-4">패키지</h6>
							<h5 class="mt-1"><%=pkgList.get(i).getPkgNm() %></h5>
						</div>
						<div class="row">
							<h4 class="mt-3 col-8 offset-4 text-end"><%=pkgList.get(i).getPkgPri() %>원</h4>
						</div>
					</div>
				</a>
			</div>
	<%
	}
	%>
		</div>
	</div>

	<div class="container px-4 py-5">
		<h2 class="mb-3 pb-3 display-7">넉넉한 자유시간, 여행 만족도 UP!</h2>
		<div class="row mt-2">
	<%for (int i=0; i<4; i++) { %>				
			<div class="col-3">
				<a href="<%=request.getContextPath()%>/pkg/pkgDt.do?pkgId=<%=pkgList2.get(i).getPkgId() %>" class="text-decoration-none text-dark"> 
					<img
						class="img-fluid" src="<%=request.getContextPath() + File.separator%>pkg/<%=atchFileList2.get(i).get(0).getAtchFileDeSav()%>" width="100%">
					<div class="container-fluid">
						<div class="row" style="height:150px">
							<h6 class="mt-4">패키지</h6>
							<h5 class="mt-1"><%=pkgList2.get(i).getPkgNm() %></h5>
						</div>
						<div class="row">
							<h4 class="mt-3 col-8 offset-4 text-end"><%=pkgList2.get(i).getPkgPri() %>원</h4>
						</div>
					</div>
				</a>
			</div>
	<%
	}
	%>
		</div>
	</div>



	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
		crossorigin="anonymous"></script>
</body>
</html>
<%@include file="./Footer.jsp"%>
