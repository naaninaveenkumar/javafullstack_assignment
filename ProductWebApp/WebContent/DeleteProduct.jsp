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
<h2>Delete product here</h2>
<form action="ProductController" method="post">
<h2>Product Details</h2>
<label>ProductId</label>
<input type="hidden" name="product" value="delete">
<input type="text" name="pid" required><br></br>
<input type="submit" value="delete product"><br></br>
<input type="button" value="back" onClick="history.back()"><br></br>

</form>
</div>
</body>
</html>