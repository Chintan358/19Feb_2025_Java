<%@page import="java.util.ArrayList"%>
<%@page import="model.Category"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
</head>
<body>

		<div class="container">
		<div class="row">
			<div class="col-5 mx-auto card p-5 mt-3" >
			<h2>Product Registration</h2>
			<hr>
			

			<form action="reg" method="post">
			
			<div class="form-group">
			<label>Category</label>
			<select name="category" class="form-control">
			<option>---Select category---</option>
			<%
				ArrayList<Category> cats = (ArrayList)request.getAttribute("categories");
				for(Category c  :cats)
				{ %>
					<option value="<%=c.getId()%>"><%=c.getName() %></option>
				<%}
			%>
			</select>
			</div>
			
			<div class="form-group">
			<label>Name</label>
			<input type="text" name="name" class="form-control">
			</div>
			
			
			<div class="form-group">
			<label>Price</label>
			<input type="text" name="price" class="form-control">
			</div>
			
			
			<div class="form-group">
			<label>Qty</label>
			<input type="text" name="qty" class="form-control">
			</div>
			
			<div class="form-group">
			<label>Gender</label>
			<input type="radio" name="gender" value="male" checked="checked" >Male
			<input type="radio" name="gender" value="female" checked="checked" >Female
			</div>
			
			<div class="form-group">
			<label>Size</label>
			<input type="checkbox" name="size" value="S">S
			<input type="checkbox" name="size" value="M">M
			<input type="checkbox" name="size" value="L">L
			<input type="checkbox" name="size" value="XL">XL
			<input type="checkbox" name="size" value="XXL">XXL
			</div>
			
			<br>
			<input type="submit" class="btn btn-success">
			
			
			</form>
			
			</div>
		</div>
		</div>
</body>
</html>