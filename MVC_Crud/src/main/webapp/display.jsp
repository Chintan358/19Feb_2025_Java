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
</head>
<body>

	<table>
	<tr>
	<th>Id</th>
	<th>Username</th>
	<th>Email</th>
	</tr>
	
			<%
			
				List<User> users = (ArrayList)request.getAttribute("users");
				for(User u  : users)
				{ %>
					
					<tr>
					<td><%=u.getId()%></td>
					<td><%=u.getUsername()%></td>
					<td><%=u.getEmail()%></td>
					</tr>
					
				<%}
			%>	
			</table>
</body>
</html>