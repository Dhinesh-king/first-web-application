<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body style="background-color:pink ; margin:auto; width:60%; text-align:center; padding:10%">
	<div style="background-color:silver ; margin:auto; text-align:center;">
	<h1 style="background-color:white; margin:auto; text-align:center;"><b>Registration Page</b></h1>
	<form action="/register.do" method="post" >
	<div><font color="red">${errorMessage}</font></div>
		<p><b>User Name</b></p>
		<input type="text" name="name" placeholder="User Name"/>
		<p><b>Password</b></p>
		<input type="password" name="password" placeholder="Password"/>
		<p>
		<input type="submit" value="Register"/>
	</form>
	<form action="/login.do" >
		<font color="white">Already Have an Account? Login here!!!!</font>
		<p>
		<input type="submit" value="Login">
	</form>
	</div>
</html>