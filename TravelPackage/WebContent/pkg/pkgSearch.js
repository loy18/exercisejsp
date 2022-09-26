var v_category = document.querySelector('#category')
v_category.innerHTML = `

	<div class="accordion accordion-flush FAQ" id="accordionFlushExample">
				<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingOne">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseOne"
								aria-expanded="false" aria-controls="flush-collapseOne">
								여행기간</button>
						</h2>
						<div id="flush-collapseOne" class="accordion-collapse collapse"
							aria-labelledby="flush-headingOne"
							data-bs-parent="#accordionFlushExample">
								<div class="accordion-body">
								<button type="button" class="btn btn-light">1일이내</button>
								<button type="button" class="btn btn-light">2일</button>
								<button type="button" class="btn btn-light">3일</button>
								<button type="button" class="btn btn-light">4일</button>

							</div>
						</div>
					</div>


					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingTwo">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseTwo"
								aria-expanded="false" aria-controls="flush-collapseTwo">
								가격</button>
						</h2>
						<div id="flush-collapseTwo" class="accordion-collapse collapse"
							aria-labelledby="flush-headingTwo"
							data-bs-parent="#accordionFlushExample">
								<div class="accordion-body">
								<button type="button" class="btn btn-light">1~58만원</button>
								<button type="button" class="btn btn-light">58~115만원</button>
								<button type="button" class="btn btn-light">115~172만원</button>
								<button type="button" class="btn btn-light">172~230만원</button>
								<br>
							</div>
						</div>
					</div>


					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingThree">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseThree"
								aria-expanded="false" aria-controls="flush-collapseThree">
								항공/선박</button>
						</h2>
						<div id="flush-collapseThree" class="accordion-collapse collapse"
							aria-labelledby="flush-headingThree"
							data-bs-parent="#accordionFlushExample">
							<div class="accordion-body">
								<button type="button" class="btn btn-light">대한항공</button>
								<button type="button" class="btn btn-light">아시아나항공</button>
								<button type="button" class="btn btn-light">티웨이항공</button>
								<button type="button" class="btn btn-light">진에어항공</button>
							</div>
						</div>
					</div>
					
					
					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingFour">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseFour"
								aria-expanded="false" aria-controls="flush-collapseFour">
								출발요일</button>
						</h2>
						<div id="flush-collapseFour" class="accordion-collapse collapse"
							aria-labelledby="flush-headingFour"
							data-bs-parent="#accordionFlushExample">
							<div class="accordion-body">
								<button style="display:block" type="button" class="btn btn-light">월요일</button>
								<button type="button" class="btn btn-light">화요일</button>
								<button type="button" class="btn btn-light">수요일</button>
								<button type="button" class="btn btn-light">목요일</button>
								<button style="display:none" type="button" class="btn btn-light">금요일</button>
								<button style="display:none" type="button" class="btn btn-light">토요일</button>
								<button style="display:none" type="button" class="btn btn-light">일요일</button>
							</div>
						</div>
					</div>
					
					
					<div class="accordion-item">
						<h2 class="accordion-header" id="flush-headingSix">
							<button class="accordion-button collapsed" type="button"
								data-bs-toggle="collapse" data-bs-target="#flush-collapseSix"
								aria-expanded="false" aria-controls="flush-collapseSix">
								호텔등급</button>
						</h2>
						<div id="flush-collapseSix" class="accordion-collapse collapse"
							aria-labelledby="flush-headingSix"
							data-bs-parent="#accordionFlushExample">
							<div class="accordion-body">
								<button type="button" class="btn btn-light">3성급</button>
								<button type="button" class="btn btn-light">3.5성급</button>
								<button type="button" class="btn btn-light">4성급</button>
								<button type="button" class="btn btn-light">4.5성급</button>
								<button type="button" class="btn btn-light">5성급</button>
								<button type="button" class="btn btn-light">6성급</button>
							</div>
						</div>
					</div>
					<div width="100%" class="pt-3">
						&nbsp;&nbsp;&nbsp;&nbsp;결과 내 검색
					</div>
					<div width="120%" class="mt-3 container p-2">
						<div class="row">
							<input type="search" class="form-control col" style="display: inline-block;font-size:0.9em" placeholder="검색어를 입력하세요.">
							<button type="submit" class="btn col-2"><img src="/TravelPackage/image/search.png" width="30px" height="30px"></button>
						</div>
					</div>
				</div>
`;

function f_pr() {
	var pr = document.querySelector('#priceRange');
	pr.style.display = 'block';
}

