<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  
</head>
<body>

	<div class="container">
	<div class="row">
	<div class="col-8 mx-auto card p-5 mt-3">
	<h2 align="center">Student Details</h2>
	<hr>

	<table class="table">
	<tr>
	<th>Id</th>
	<th>Username</th>
	<th>Email</th>
	<th colspan="2">Action</th>
	</tr>
	
			<%
			
				List<User> users = (ArrayList)request.getAttribute("users");
				for(User u  : users)
				{ %>
					
					<tr>
					<td><%=u.getId()%></td>
					<td><%=u.getUsername()%></td>
					<td><%=u.getEmail()%></td>
					<td><a href="update?id=<%=u.getId()%>&action=delete" class="btn btn-danger">Delete</a></td>
					<td><a href="update?id=<%=u.getId()%>&action=update" class="btn btn-primary">Update</a></td>
					</tr>
					
				<%}
			%>	
			</table>
			
			</div>
	</div>
	</div>
</body>
</html>