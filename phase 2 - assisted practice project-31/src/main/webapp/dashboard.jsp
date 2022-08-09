<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<jsp:useBean id="obj" class="com.login.UserID"/>

		<%
		if(session.getAttribute("name")==null){
			response.sendRedirect("Index.jsp");
		}
		%>
		<b>Hello! this is you are dashboard</b><br/>
		<a href="logout.jsp">Logout</a>
</body>
</html>