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


<form action="UserController" method="post">
<div class="box">
<h2 align="center">Create Your Account</h2>
<label>FirstName</label>
<input type="hidden" name="user1" value="signup">
<input type="text" name="firstname" required><br></br>
<label>LastName</label>
<input type="text" name="lastname" required><br></br> 
<label >Gender</label>
<input type="radio" name="gender" value="male" required>MALE
<input type="radio" name="gender" value="female" required>FEMALE<br></br>
<label>Age</label>
<input type="text" name="age" required><br></br>
<label >PhoneNumber</label>
<input type="text" name="phnnumber" required><br></br>
<label >UserName</label>
<input type="text" name="username" required ><br></br> 
<label >Password</label>
<input type="password" name="password" required><br></br>
<button type="submit">Submit customer info</button><br></br>
<input type="button" value="back" onClick="history.back()">
</div>
</form>
</body>
</html>