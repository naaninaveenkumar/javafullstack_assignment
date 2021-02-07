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
<div class="box">
<% session.invalidate(); %>
<p>You have successfully logged out</p>
<a href="GenericLoginPage.jsp">home</a><br></br>
</div>
</body>
</html>