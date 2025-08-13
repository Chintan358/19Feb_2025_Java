<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello</h1>
	
	<br>
	
	<form:form action="adduser" modelAttribute="user">
	<form:label path="name">Username</form:label>
	<form:input path="name"/>
	
	<form:label path="email">Email</form:label>
	<form:input path="email"/>
	
	<input type="submit">
	
	</form:form>
	


</body>
</html>