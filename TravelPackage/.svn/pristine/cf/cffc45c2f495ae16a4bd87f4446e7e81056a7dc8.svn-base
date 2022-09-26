<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@include file="../Header.jsp" %>
      <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>신규 패키지 등록</title>
           
        </head>

        <body>
            <div class="container">
                <div class="row mt-4">
                    <div id="category" class="col-2">
                        <script src="../admin/category.js"></script>
                    </div>

                    <div class="col-9 offset-1">
                      <form action="pkgInsert.do" method="post" enctype="multipart/form-data">
						<table class="table table-hover">
							
							<tr>
								<td>패키지명</td>
								<td><textarea class="form-control" name="pkgNm"></textarea></td>
							</tr>
							<tr>
								<td>패키지 설명</td>
								<td><textarea class="form-control" name="pkgCont"></textarea></td>
							</tr>
							<tr>
								<td>일수</td>
								<td><input class="form-control" type="text" name="pkgDay" value=""></td>
							</tr>
							<tr>
								<td>가격</td>
								<td><input class="form-control"  type="text" name="pkgPri" value=""></td>
							</tr>
							<tr>
								<td>지역</td>
								<td><input  class="form-control" type="text" name="pkgReg" value=""></td>
							</tr>
							<tr>
								<td>가이드</td>
								<td><input class="form-control"  type="text" name="pkgGui" value=""></td>
							</tr>
							<tr>
								<td>최소인원</td>
								<td><input class="form-control"  type="text" name="pkgMinTo" value=""></td>
							</tr>
							<tr>
								<td>최대인원</td>
								<td><input class="form-control"  type="text" name="pkgMaxTo" value=""></td>
							</tr>
							<tr>
								<td>작성자</td>
								<td><input class="form-control" type="text" name="pkgWrt" value="<%=session.getAttribute("id") %>" readonly="readonly"></td>
							</tr>
							<tr>
								<td>대표이미지</td>
								<td><input class="form-control" type="file" name="atchFile" class="form-control" multiple="multiple"></td>
							</tr>
							
						  </table>
						  <button class="btn btn-outline-primary" style="float: right">등록</button>
						  
						</form>
                    </div>
                </div>
            </div>
        </body>

        </html>
        <%@include file="../Footer.jsp" %>