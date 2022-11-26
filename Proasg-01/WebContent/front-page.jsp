<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Assignment Project 1</title>
<link rel="stylesheet" href="asset/style/style.css">
<style>
		body {font-family: Arial, Helvetica, sans-serif;}
			* {box-sizing: border-box;}
			
			{
  				font-family: Arial, Helvetica, sans-serif;
  				width: 100%;
  				padding: 15px;
  				margin: 5px 0 22px 0;
  				display: inline-block;
  				border: none;
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
    		text-align: center;
			background: linear-gradient(#FFFFFF, #E6E6FA, #C3B1E1, #E0B0FF, #CF9FFF, #FFFFFF);
		}
	
</style>
</head>
<body>
<%@ include file = "header.html" %>
	
		<div class="section">
		<div class="btn-group">
			<a href="new-user.jsp">Add New Records</a>
		</div>
		<br><br>
		<div class="btn-group">
			<a href="View_Data">View All Records</a>
		</div>
		</div>

<%@ include file = "footer.html" %>
</body>
</html>