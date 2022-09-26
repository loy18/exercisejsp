<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
  <%
  		String pkgId = (String)request.getAttribute("pkgId");
  %>
        <!DOCTYPE html>
        <html>
        <head>
        
            <meta charset="UTF-8">
            <title>리뷰 작성</title>
          
        <style type="text/css">
            #myform fieldset{
			    display: inline-block;
			    direction: rtl;
			    border:0;
			}
			#myform fieldset legend{
			    text-align: right;
			}
	        #myform input[type=radio]{
			    display: none;
			}
			#myform label{
			    font-size: 2em;
			    color: transparent;
			    text-shadow: 0 0 0 #f0f0f0;
			}
			#myform label:hover{
			    text-shadow: 0 0 0 #58CCFF;
			}
			#myform label:hover ~ label{
			    text-shadow: 0 0 0 #58CCFF;
			}
			#myform input[type=radio]:checked ~ label{
			    text-shadow: 0 0 0 #58CCFF;
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
            <form action="/TravelPackage/review/reviewInsert.do" method="post" id="myform" enctype="multipart/form-data">
					<div width="100%"  class="text-center mt-5 mb-5" >
						<fieldset>
							<input type="radio"	name="reviewRat" value="5" id="rate1"><label for="rate1">★</label>
							<input type="radio" name="reviewRat" value="4" id="rate2"><label for="rate2">★</label> 
							<input type="radio" name="reviewRat" value="3" id="rate3"><label for="rate3">★</label> 
							<input type="radio" name="reviewRat" value="2" id="rate4"><label for="rate4">★</label> 
							<input type="radio" name="reviewRat" value="1" id="rate5"><label for="rate5">★</label>
							<br>
							<span class="text-bold">별점을 선택해주세요</span> 
						</fieldset>
					</div>
					<input type="hidden" name="pkgId" value="<%=pkgId %>" >

					<table class="table table-hover">
				<tr>
					<td>제  목</td>
					<td><input class="form-control" type="text" aria-label="default input example" name="reviewTitle" value=""></td>
				</tr>
				<tr>
					<td>내  용</td>
					<td><input class="form-control" type="text" aria-label="default input example"  name="reviewCont" value=""></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input  class="form-control" type="text" aria-label="default input example" name="memMail" value="<%=session.getAttribute("id") %>" readonly="readonly"></td>
				</tr>
					
				<tr>
					<td>여행사진 첨부하기</td>
					<td><input type="file" name="atchFile" class="form-control" multiple="multiple"></td>
				</tr>
				</table>
				<button class="btn btn-outline-primary"  style="float: right">등록</button>
			</form>
                    </div>
                </div>
            </div>
        </body>

        </html>
        <%@include file="../Footer.jsp" %>