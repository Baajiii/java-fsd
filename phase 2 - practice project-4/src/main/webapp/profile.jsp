<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.ProductClass"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Details</title>

</head>
<body>

	<%
		ArrayList<ProductClass> pc = (ArrayList) request.getAttribute("product");
	%>

		<table>

			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Price</td>
			</tr>
			<%
				if (request.getAttribute("product") != null) {
					Iterator<ProductClass> iterator = pc.iterator();
					while (iterator.hasNext()) {
						ProductClass ps = iterator.next();
			%>
			<tr>
				<td><%=ps.getId()%></td>
				<td><%=ps.getName()%></td>
				<td><%=ps.getPrice()%></td>
			</tr>
			<%
				}
				}
			%>
		</table>
		</br>
		<a href="index.jsp"> GO BACK</a>
</body>
</html>