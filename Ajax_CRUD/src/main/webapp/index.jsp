<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr" crossorigin="anonymous">
	
	<script type="text/javascript">
	
	$(document).ready(function(){
		load()
	})
	
	
	const load = ()=>{

		$.get("display",{},function(rt){
		
			const allData =  JSON.parse(rt)
			
		 	var rows = "";
			allData.map(ele=>{
				
				rows+="<tr><td>"+ele.id+"</td>"
				rows+="<td>"+ele.name+"</td>"
				rows+="<td>"+ele.email+"</td>"
				rows+="<td>"+ele.phone+"</td>"
				rows+="<td><button class='btn btn-primary'>Update</button></td>"
				rows+="<td><button class='btn btn-danger'>Delete</button></td></tr>"
				
			})
			
			$("#tdata").html(rows)
		
		})	
	}
	
	const addStudent = ()=>{

		var uname = $("#uname").val()
		var email = $("#email").val()
		var phone = $("#phone").val()
		
		$.post("register",{uname,email,phone},function(rt){
        
			alert(rt)
			load()
			
			$("#uname").val("")
			$("#email").val("")
			
			$("#phone").val("")
			
			
		
		})	
	
	}
	
	
	</script>

</head>
<body>

			<div class="container">
			<div class="row mt-5">
			
			<div class="col-4 card p-3">
			<h2 align="center">User Registration</h2>
			<hr>
					
					<input type="text" name="uname" id="uname" placeholder="Enter username" class="form-control">
					<br>
					<input type="text" name="email" id="email" placeholder="Enter username" class="form-control">
					<br>
					<input type="text" name="phone" id="phone" placeholder="Enter username" class="form-control">
						<br>
					<button class="btn btn-success" onclick="addStudent()">Register</button>
			
			</div>
			<div class="col-1">
			
			</div>
			<div class="col-7 card p-3">
			<h2 align="center">User Details</h2>
			<hr>
			
			<table class="table table-striped">
			<thead>
			<tr>
			<th>Id</th>
			<th>Username</th>
			<th>Email</th>
			<th>Phone</th>
			</tr>
			</thead>
			<tbody id="tdata">
			
			</tbody>
			</table>
			
			</div>
			
			</div>
			</div>


</body>
</html>