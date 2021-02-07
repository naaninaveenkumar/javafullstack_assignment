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
<h2 align="center">Update Product</h2>
<form action="ProductController" method="post">
<div class="box">
<h2>Product Details</h2>
<label>ProductId</label>
<input type="hidden" name="product" value="update">
<input type="text" name="pid" required><br></br>
<label>ProductPrice</label>
<input type="text" name="pprice" required><br></br>
<label>ProductQuantity</label>
<input type="text" name="quantity" required><br></br>
<input type="submit" name="Update Product"><br></br>
<input type="button" value="back" onClick="history.back()"><br></br>

</div>
</form>
</body>
</html>