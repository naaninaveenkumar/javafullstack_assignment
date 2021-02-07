<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<h2 align="center">Welcome to Product Website</h2>
<form action="UserController" method="post">
<div class="box">
<h2 align="center">Login Page</h2>
<label >UserName</label>
<input type="hidden" name="user1" value="login">
<input type="text" name="user" class="user" required><br></br>
<label class="a">Password</label>
<input type="password" name="pass" class="user" required><br></br>
<input type="submit" value="Sign In" style="background-color:black;color:white;">
<input type="reset" value="Reset" style="background-color:black;color:white">
<br></br>


<a href="CustomerSignUp.jsp">Sign Up</a> 
</div>
</form>
</body>
</html>