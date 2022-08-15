package com.operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class AdminPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("admin-login.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String Email = request.getParameter("adminemail");
		String Password = request.getParameter("adminpassword");
		
		if(Email.equals("") && Password.equals("")) {
			out.println("<div align='center'>Enter the user Id correctly"
					+ "<a href='login'>Retry </a>"
					+ "</div>");
		}else {
			if(Email.equals("academy@gmail.com") && Password.equals("123456")) {
				out.println("<div align='center'>WELCOME TO ACADEMY PORTAL!</div>");
				request.getRequestDispatcher("admin-page.html").include(request, response);
			}else {
				out.println("<div align='center'>Invalid User"
						+ "<a href='login'>Retry with Valid User</a>"
						+ "</div>");
			}
		}
}
}