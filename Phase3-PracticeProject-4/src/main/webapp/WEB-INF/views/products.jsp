<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Product</title>
</head>
<body>
	<h1>Shopping Cart</h1>
	
	<br/><br/>
	<ul>
		<c:forEach items="${products}" var="product">
			<li>${product.id} | ${product.name} | ${product.price} | ${product.description}</li>
		</c:forEach>
	</ul>
</body>
</html>