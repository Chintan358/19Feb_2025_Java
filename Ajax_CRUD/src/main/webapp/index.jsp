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

		$("#upbtn").hide()
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
				rows+="<td><button class='btn btn-primary' onclick='getStudentById("+ele.id+")'>Update</button></td>"
				rows+="<td><button class='btn btn-danger' onclick='deleteStudent("+ele.id+")'>Delete</button></td></tr>"
				
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
	
	
	const deleteStudent=(sid)=>
	{
		$.get("update",{"sid":sid,"action":"delete"},function(rt){	
		
			alert(rt)
			load()
		})
	}
	
	const getStudentById = (sid)=>{
		$.get("update",{"sid":sid,"action":"update"},function(rt){	
			
			const dt = JSON.parse(rt)
			
			$("#id").val(dt.id)
			$("#uname").val(dt.name)
			$("#email").val(dt.email)
			$("#phone").val(dt.phone)
			
			$("#upbtn").show()
			$("#smbtn").hide()
		})
	}
	
	
	const updateStudent = ()=>{

		var id = $("#id").val()
		var uname = $("#uname").val()
		var email = $("#email").val()
		var phone = $("#phone").val()
		
		$.post("saveupdate",{id,uname,email,phone},function(rt){
        
			alert(rt)
			load()
			
			$("#id").val("")
			$("#uname").val("")
			$("#email").val("")
			$("#phone").val("")
			
			
			$("#upbtn").hide()
			$("#smbtn").show()
		})	
	}
	
	const checkusername = (uname)=>{
	
		$.get('validation',{uname},function(rt){
			
			if(rt)
			{
				$("#unameErr").html(rt)
				$("#uname").css("border","1px solid red")
				$("#smbtn").attr('disabled','disabled');
				
			}
			else
			{
				$("#unameErr").html("")
				$("#uname").css("border","")
				$("#smbtn").attr('disabled',false);
			}         
		})	
		
	}
	
	const search = (uname)=>{
		
		$.get("search",{uname},function(rt){
			
			const allData =  JSON.parse(rt)
			
		 	var rows = "";
			allData.map(ele=>{
				
				rows+="<tr><td>"+ele.id+"</td>"
				rows+="<td>"+ele.name+"</td>"
				rows+="<td>"+ele.email+"</td>"
				rows+="<td>"+ele.phone+"</td>"
				rows+="<td><button class='btn btn-primary' onclick='getStudentById("+ele.id+")'>Update</button></td>"
				rows+="<td><button class='btn btn-danger' onclick='deleteStudent("+ele.id+")'>Delete</button></td></tr>"
				
			})
			
			$("#tdata").html(rows)
		
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
			<input type="hidden" id="id">
				<input type="text" name="uname" id="uname" placeholder="Enter username" class="form-control" onblur="checkusername(value)">
					<span id="unameErr" class="text-danger"></span>
					<br>
					<input type="text" name="email" id="email" placeholder="Enter email" class="form-control">
					<br>
					<input type="text" name="phone" id="phone" placeholder="Enter phone" class="form-control">
						<br>
					<button class="btn btn-success" id="smbtn" onclick="addStudent()">Register</button>
					<button class="btn btn-success" id="upbtn" onclick="updateStudent()">Update</button>
			
			</div>
			<div class="col-1">
			
			</div>
			<div class="col-7 card p-3">
			<h2 align="center">User Details</h2>
			<hr>
			
			<input type="text" class="form-control" placeholder="search..." onkeyup="search(value)" >
			<br>
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