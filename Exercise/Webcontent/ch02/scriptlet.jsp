<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--스크립틀릿 -->
	<h1><%
Date today = new Date();
out.println("오늘은 : " + today);
%></h1>
</body>
</html>