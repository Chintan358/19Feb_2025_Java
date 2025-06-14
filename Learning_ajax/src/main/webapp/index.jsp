<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>

<script type="text/javascript">
	
		$(document).ready(function(){
	
			//alert("Hello")
		
		})
		
		const hello = ()=>{
			
			var uname = $("#uname").val()
			$.get("hello",{uname},function(rt){
			
				alert(rt)	
			})	
		}
		
		const search = (value)=>{
			
			$.get("search",{value},function(rt){

				$("#data").html(rt)
			})			
		}
	

</script>


</head>
<body>

		<input type="text" id="uname" >
		<button onclick="hello()">submit</button>
		
		<hr>
		
		<input type="text" placeholder="Search here..." onkeyup="search(value)">
		
		<div id="data"></div>

</body>
</html>