<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
      <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 숙박업소 등록</title>
           
        </head>

        <body>
            <div class="container">
                <div class="row mt-4">
                    <div id="category" class="col-2">
                        <script src="../admin/category.js"></script>
                    </div>

                    <div class="col-9 offset-1">
                      <form action="AcmInsert.do" method="post" enctype="multipart/form-data">
						<table class="table table-hover">
							
							<tr>
								<td>숙박업소명 :</td>
								<td><input class="form-control" type="text" aria-label="default input example" name="acmNm" value=""></td>
							</tr>
							<tr>
								<td>숙박업소 설명 :</td>
								<td><textarea class="form-control" name="acmCont"></textarea></td>
							</tr>
							<tr>
								<td>구분 :</td>
								<td><input class="form-control" type="text" aria-label="default input example" name="acmSe" value=""></td>
							</tr>
							<tr>
								<td>주소 :</td>
								<td><textarea  class="form-control" id="exampleFormControlTextarea1" rows="3" name="Addr"></textarea></td>
							</tr>
							<tr>
								<td>투숙금액 :</td>
								<td><textarea  class="form-control" id="exampleFormControlTextarea1" rows="1" cols="10" name="Price"></textarea></td>
							</tr>
							<tr>
								<td>객실수 :</td>
								<td><textarea  class="form-control" id="exampleFormControlTextarea1" rows="1" cols="5" name="Qty"></textarea></td>
							</tr>
							<tr>
								<td>게시글작성자 :</td>
								<td><input  class="form-control" type="text" aria-label="default input example" name="Writer" value="<%=session.getAttribute("id") %>" readonly="readonly"></td>
								
							</tr>
							<tr>
								<td>첨부파일 :</td>
								<td><input  class="form-control" type="file" id="formFile" name="atchFile" multiple="multiple"></td>
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