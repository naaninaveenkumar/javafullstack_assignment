<%@page import="com.bean.Product"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
<h2 align="center">Product details are</h2>
<form action="ProductController" method="post">


<table border="2" cellpadding=10 align="center">
<tr bgcolor="yellow">
	<th>Id</th>
	<th>Name</th>
	<th>Price</th>
	<th>Quantity</th>
	<th>Ordered</th>
</tr>
<%
Object obj = session.getAttribute("productdetails");
List<Product> list=(List<Product>) obj;
Iterator<Product> li = list.iterator();
while(li.hasNext()){
	Product p=li.next();
%>
<tr>
	<td><%=p.getPid() %></td>
	<td><%=p.getPname() %></td>
	<td><%=p.getPprice() %></td>
	<td><%=p.getQuantity() %></td>
	<td><%=p.getOrdered() %></td>
	
</tr>
<%
}
%>
</table><br></br>
<input type="button" value="back" onClick="history.back()"><br></br>

</form>
</body>
</html>