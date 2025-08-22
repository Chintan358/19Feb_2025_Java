<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<form:form action="addStudent" modelAttribute="student" method="post">
			
		<form:label path="name">Name</form:label>
		<form:input path="name"/>
		
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		
		<form:label path="phone">Phone</form:label>
		<form:input path="phone"/>
		
		<input type="submit">
		
		</form:form>
	
	
</body>
</html>