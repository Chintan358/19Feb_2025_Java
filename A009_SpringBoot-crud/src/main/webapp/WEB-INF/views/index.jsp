<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<form:form action="addStudent" modelAttribute="student" method="post">
			
			<form:hidden path="id"/>
		<form:label path="name">Name</form:label>
		<form:input path="name"/>
		
		<form:label path="email">Email</form:label>
		<form:input path="email"/>
		
		<form:label path="phone">Phone</form:label>
		<form:input path="phone"/>
		
		<input type="submit">
		
		</form:form>
		
		<br>
		<br>
		
		<table>
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Phone</th>
		<th colspan="2">Action</th>
		</tr>
		
		<c:forEach var="dt" items="${students}">
		<tr>
		<td>${dt.getId()}</td>
		<td>${dt.getName() }</td>
		<td>${dt.getEmail() }</td>
		<td>${dt.getPhone() }</td>
		<td><a href="delete?did=${dt.getId()}">Delete</a></td>
		<td><a href="update?uid=${dt.getId()}">Update</a></td>
		</tr>
		</c:forEach>
		</table>
	
	
</body>
</html>