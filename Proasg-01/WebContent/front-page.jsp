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
		
		.styled {
    		border: 1;
    		line-height: 4.5;
    		padding: 0 20px;
    		font-size: 1rem;
    		text-align: center;
    		color: #00008B;
    		border-radius: 10px;
    		background-color: #E5E4E2;
    
		}
		
		button {
  			width: 100%;
  			margin: 5px;
  			background-color: #7DF9FF;
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
		<a href="new-user.jsp" class="container-login100-form-btn m-t-17">
            <button type="submit" class="favorite styled">
            Add New Records
            </button></a><br><br>
           
        <a href="View_Data" class="container-login100-form-btn m-t-17">
            <button type="submit" class="favorite styled">
            View All Records
            </button></a><br><br>
		</div>

<%@ include file = "footer.html" %>
</body>
</html>