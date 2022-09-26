<%@page import="java.util.List"%>
<%@page import="kr.or.ddit.app.tour.vo.TourVO"%>
<%@page import="kr.or.ddit.app.sch.vo.SchVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
    <%
    	SchVO sv = (SchVO) request.getAttribute("sv");
    	List<TourVO> tourList = (List<TourVO>) request.getAttribute("tourList");
    %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>일정 수정</title>
          <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/dropdowns/">
          <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">
          <link href="../css/dropdowns.css" rel="stylesheet">
          <style>
			.b{
				border: 1px solid black;
			}

		  </style>
        </head>

        <body>
            <div class="container">
                <div class="row mt-4">
                    <div id="category" class="col-2">
                        <script src="../admin/category.js"></script>
                    </div>

                    <div class="col-9 offset-1">
						<form action="schInsert.do" method="post" enctype="multipart/form-data">
							<input type="hidden" name="pkgId" value="<%=sv.getPkgId() %>">
							
							<table class="table table-hover">
								<tbody id="id_tby">
									<tr>
										<td>일차</td>
										<td><input type="number" name="schDay" value="<%=sv.getSchDay()%>"></td>
									</tr>
									<tr>
										<td>숙박업소</td>
										<td id="acm">
											 <input id="acmTxt" value="<%=sv.getAcmNm() %>" type="search" autocomplete="false" placeholder="숙박업소찾기" readonly="readonly">
											 <input type="hidden" name="acmId" value="<%=sv.getAcmId()%>">
											 <button type="button" class="btn btn-primary" onclick="f_acmSearch()">검색</button>
										</td>
									</tr>
									<tr>
										<td>교통수단</td>
										<td id="vehc">
										 	<input id="vehcTxt" value="<%=sv.getVehcNm() %>" type="search" autocomplete="false" placeholder="고통수단찾기" readonly="readonly">
										 	<input type="hidden" name="vehcId" value="<%=sv.getVehcId() %>">
											<button type="button" class="btn btn-primary" onclick="f_vehcSearch()">검색</button>
										</td>
									</tr>
									<%
									for(int i=0; i< tourList.size(); i++){
										
										
										if(tourList.size()-1 == i){
											%>
											<tr>
												<td>관광상품</td>
												<td>
													<input value="<%=tourList.get(i).getTourNm()%>" type="search" class="tourTxt" autocomplete="false" placeholder="관광상품찾기" readonly="readonly">
													<input type="hidden" name="tourId" value="<%=tourList.get(i).getTourId()%>">
													<button type="button" class="btn btn-primary" onclick="f_tourSearch()">검색</button>
													<button id="id_add" type="button" class="btn btn-primary" onclick="f_addTour()">추가</button>
												</td>
											</tr>
											<%
											continue;
										}
										%>
										<tr>
											<td>관광상품</td>
											<td>
												<input value="<%=tourList.get(i).getTourNm()%>" type="search" class="tourTxt" autocomplete="false" placeholder="관광상품찾기" readonly="readonly">
												<input type="hidden" name="tourId">
												<button type="button" class="btn btn-primary" onclick="f_tourSearch()">검색</button>
											</td>
										</tr>
									<%
									}
									%>
								</tbody>
							</table>
							<a href="../pkg/pkgDetail.do?pkgId=<%=sv.getPkgId()%>">[일정등록]</a>
							<!-- <input type="submit" value="일정등록"> -->
						</form>
                    </div>
                </div>
            </div>
             <script src="../assets/dist/js/bootstrap.bundle.min.js"></script>
             <script>
				function f_acmSearch(){
					window.open("../acm/AcmSearch.do","숙박업소선택","width=800, height=700, left=100, top=50");
				}
				function f_vehcSearch(){
					window.open("../vehc/vehcSearch.do","교통수단선택","width=800, height=700, left=100, top=50");
				}
				function f_tourSearch(){
					window.open("../tour/tourSearch.do","관광상품선택","width=800, height=700, left=100, top=50");
				}
				
				function f_addTour() {
					document.querySelector("#id_add").remove();
					var v_tby = document.querySelector("#id_tby");
					var v_tr = document.createElement("tr");
					v_tr.innerHTML= `<td>관광상품</td>
									<td>
										<input class="tourTxt" type="search" autocomplete="false" placeholder="관광상품찾기" readonly="readonly">
										<button type="button" class="btn btn-primary" onclick="f_tourSearch()">검색</button>
										<button id="id_add" type="button" class="btn btn-primary" onclick="f_addTour()">추가</button>
									</td>`;
					v_tby.appendChild(v_tr);
				}
             </script>
        </body>

        </html>
        <%@include file="../Footer.jsp" %>