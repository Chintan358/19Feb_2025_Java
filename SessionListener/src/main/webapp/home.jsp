<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Success</h1>
<a href="logout">Logout</a>

<%
	String cuser = (String) application.getAttribute("cuser");
	String tuser = (String) application.getAttribute("tuser");
	
	out.print("<h1>Currentusers = "+cuser+"</h1>");
	out.print("<h1>Total users = "+tuser+"</h1>");
%>


</body>
</html>