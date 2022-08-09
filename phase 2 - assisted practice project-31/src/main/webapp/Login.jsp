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
		
		String name = request.getParameter("email");
		String password = request.getParameter("pwd");
		String NAME = obj.mail();
		String PASS = obj.pass();
		if(name.equals(NAME) && password.equals(PASS)){
			session.setAttribute("name", name);
			response.sendRedirect("dashboard.jsp");
		}else
		{
			response.sendRedirect("Error.jsp");
		}
		%>
</body>
</html>