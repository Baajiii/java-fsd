<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Products</title>
</head>
<body>

	<h1>Products List</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="product" items="${products}">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.price}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="productstore.html">Home</a>
</body>
</html>