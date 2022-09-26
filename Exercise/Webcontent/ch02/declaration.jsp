<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 선언문 -->
<%!
String hi = "Hello, Java Server Pages";
String getString(String a){
	return a;
}
%>
<!-- 표현문 -->
<h1><%= getString(hi) %></h1>
</body>
</html>