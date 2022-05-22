<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color: pink; margin: auto; width:50%;  padding:10%">
	<div
		style="background-color: silver; padding:20; margin: 100; text-align: center;">
		<h1 style="background-color: white; margin: auto; text-align: center;">
			<b>Login Page</b>
		</h1>
		<form action="/login.do" method="post" style="height: 200px; ">
			<div>
				<font color="red">${errorMessage}</font>
			</div>
			<p><b>User Name</b></p>
			<input type="text" name="name" placeholder="User Name" style="width: 184px; "/>
			<p><b>Password</b></p>
			<input type="password" name="password" placeholder="Password" style="width: 182px; "/>
			<p>
			<input type="submit" value="Submit"> 
		</form>
	</div>
	<div style="background-color: silver; padding:20; margin: 100; text-align: center; height: 152px">
	<font color="black" style="margin:100; text-align:center"><b>Do not Have an Account?? Register here.</b></font>
	<p/>
	<form action="/register.do" style="height: 47px; margin:20;">
			<input type="submit" value="Register" style="width: 153px; height: 34px">
		</form>
	</div>
	
	
</body>
</html>