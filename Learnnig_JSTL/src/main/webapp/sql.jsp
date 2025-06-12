<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<sql:setDataSource driver="com.mysql.cj.jdbc.Driver" 
		url="jdbc:mysql://localhost:3306/19feb_java"
		user="root"
		password="root"
		var="ds"
		  />
		  
		<sql:query var="data" dataSource="${ds}">
		select * from student
		</sql:query>
		
		<c:forEach var="dt" items="${data.rows}">
		<c:out value="${dt.id}"></c:out>
		<c:out value="${dt.name}"></c:out>
		<c:out value="${dt.email}"></c:out>
		<c:out value="${dt.phone}"></c:out>
		<br>
		</c:forEach>
		
		  
		  
		  
		  
	
</body>
</html>