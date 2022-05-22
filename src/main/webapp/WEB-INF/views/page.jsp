<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Webpage</title>
</head>
<body style="background-color:silver ; margin:auto; width:60%; text-align:center; padding:10%">
	<%
	Date date = new Date();
	%>
	<div style="background-color: pink; text-align:center; width:100%; padding:1%; height: 350px">
		<h1>Welcome to my Page</h1>
		<p>${successMessage}</p>
		<p>
			Hi <b>${name}</b> and Welcome to my page
		</p>
		<p>
			Today's Date and time is
			<%=date%></p>
		<p />
		<a href="https://www.google.com/" >Google</a>
		<ul style=" text-align:center;">
			<li><a href="https://www.amazon.com" target="_blank">Amazon</a></li>
			<li><a href="https://www.youtube.com" target="_blank">Youtube</a></li>
			<li><a href="https://www.cognizant.com" target="_blank">Cognizant</a></li>
			<li><a href="login.do" target="_blank">Login to My Page</a></li>
		</ul>
	</div>
</body>
</html>