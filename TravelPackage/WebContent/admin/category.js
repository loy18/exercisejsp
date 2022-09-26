var v_body = document.querySelector('#category');
v_body.innerHTML += 

`<nav class="nav flex-column">
<h3>
  <a class="nav-link text-dark" href="../admin/adminMain.do">관리자 메뉴</a>
</h3>
<hr>
  <a class="nav-link active text-dark" aria-current="page" href="../mem/memberList.do">회원관리</a>
  <a class="nav-link text-dark" href="../pkg/pkgList.do">상품관리</a>
  <a class="nav-link text-dark" href="../review/reviewList.do">리뷰관리</a>
  <a class="nav-link text-dark" href="/TravelPackage/admin/adminRsv.do">예약관리</a>
  <a class="nav-link text-dark" href="../admin/adminNotice.do">고객센터 관리</a>
</nav>`;

function Sales(){
	document.getElementsByClassName('salesFbtn')[0].style.display = "none";
	document.getElementsByClassName('salesBtn')[0].style.display = "block";
	
}
function Sales2(){
		document.getElementsByClassName('salesFbtn')[1].style.display = "none";
	document.getElementsByClassName('salesBtn')[1].style.display = "block";
}