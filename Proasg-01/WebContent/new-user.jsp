<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name = "viewport" content ="width = device-width, initial-scale=1">
<style>
	body {font-family: Arial, Helvetica, sans-serif;}
			* {box-sizing: border-box;}
	
	input[type=text], select, textarea {
		width: 100%;
		padding: 12px;
		border: 1px solid #ccc; /* grey */
		border-radius: 4px;
		box-sizing: border-box;
		margin-top: 6px;
		margin-bottom: 16px;
		resize: vertical;
	}
	
	input[type=submit] {
		background-color : #af8b4c;
		color: white;
		padding: 12px 20px;
		border: none;
		border-radius: 4px;
		cursor: pointer;
	}
	
	input[type=submit] {
		background-color: #45a049;
	}
	
	input[type=submit]:hover {
  	background-color: #FFFFE0;
	}
	
	.container {
		border-radius: 5px;
		background-color: #ADD8E6; /* light blue */
		padding: 20px;
		width: 700px;
		margin-left: 150px;
	}
	
	.btn-group a {
  			background-color: #cb4bf2; 
  			border: 1px solid blue; 
  			color: black; 
  			padding: 20px 48px; 
  			cursor: pointer; 
  			float: left; 
  			width: 50%;
		}

		.btn-group a:not(:last-child) {
  			border-right: none; /* Prevent double borders */
		}

		/* Clear floats (clearfix hack) */
		.btn-group:after {
  			content: "";
  			clear: both;
  			display: table;
		}

		/* Add a background color on hover */
		.btn-group a:hover {
  			background-color: yellow;
		}
		
		.section{
			padding: 250px;
    		text-align: left;
			background: linear-gradient(#FFFFFF, #E6E6FA, #C3B1E1, #E0B0FF, #CF9FFF, #FFFFFF);
		}
	
</style>
<body>
	<%@ include file = "header.html" %>
	<br><br>
	<div class="section">
	<h3 align="center">Add New User</h3>

	
	<form action="./savedata" method="post" enctype="multipart/form-data">
		<div class="container">	
			<label for="name">Name</label>
			<input type="text" id="name" name="name" placeholder="Your Name ....">
			<br>
			<label for="email">Email</label>
			<input type="text" id="email" name="email" placeholder="Your Email ....">
			<br>
			<label for="address">Address</label>
			<input type="text" id="address" name="address" placeholder="Your Address ....">
			<br>
			<label for="phone">Phone</label>
			<input type="text" id="phone" name="phone" placeholder="Your Phone ....">
			<br>
			<label for="city">City</label>
			<input type="text" id="city" name="city" placeholder="Your City ....">
			<br>
			<label for="country">Country</label>
			<input type="text" id="country" name="country" placeholder="Your Country ....">
			<br>
			<label for="education">Education</label>
			<input type="text" id="education" name="education" placeholder="Your Last Education ....">
			<br>
			<br>
			<label for="photo">Photo</label>
			<input type="file" id="photo" name="photo" accept="image/jpeg, image/png, image/jpg">
			
			<br><br><br>
			<input type="submit" value="Submit">
			
		</div>
	</form>
	
	<br/>
		
		<div class="btn-group">
			<a href="front-page.jsp">Back to frontpage</a>
		</div>
		</div>
	
	<%@ include file = "footer.html" %>
</body>
</html>