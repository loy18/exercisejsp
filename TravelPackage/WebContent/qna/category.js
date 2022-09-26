var v_body = document.querySelector('#category');
v_body.innerHTML += `<nav class="nav flex-column">
<h3>
  <a class="nav-link text-dark" href="../notice/noticeMain.jsp">고객센터</a>
</h3>
<hr>
  <a class="nav-link active text-dark" aria-current="page" href="../notice/noticeList.do">공지사항</a>
  <a class="nav-link text-dark" href="../notice/FAQList.jsp">자주묻는질문</a>
  <a class="nav-link text-dark" href="../qna/qnaInsert.jsp">1:1문의하기</a>
</nav>`;


function swalDelete() {
	Swal.fire({
		title: '삭제하시겠습니까?',
		text: "게시글이 삭제 됩니다",
		icon: 'warning',
		showCancelButton: true,
		confirmButtonColor: '#3085d6',
		cancelButtonColor: '#d33',
		confirmButtonText: '네, 삭제하겠습니다'
	}).then((result) => {
		if (result.isConfirmed) {
			Swal.fire(
				'삭제완료!',
				'게시글이 삭제 되었습니다',
				'success'
			)
		}
	})
}

function swalModify() {
	Swal.fire({
		title: 'Do you want to save the changes?',
		showDenyButton: true,
		showCancelButton: true,
		confirmButtonText: 'Save',
		denyButtonText: `Don't save`,
	}).then((result) => {
		/* Read more about isConfirmed, isDenied below */
		if (result.isConfirmed) {
			Swal.fire('Saved!', '', 'success')
		} else if (result.isDenied) {
			Swal.fire('Changes are not saved', '', 'info')
		}
	})
}

function swalRegister() {
	Swal.fire({
		position: 'top-middle',
		icon: '완료',
		title: '게시글이 등록되었습니다',
		showConfirmButton: false,
		timer: 1500
	})
}