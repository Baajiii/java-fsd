package com.sample.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletProduct")
public class ServletProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       Connection connection;
       
   	@Override
   	public void init(ServletConfig config) throws ServletException {

   		try {
   			ServletContext context = config.getServletContext();
   			Class.forName("com.mysql.jdbc.Driver");
   			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
   					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
   		} catch (ClassNotFoundException e) {
   			e.printStackTrace();
   		} catch (SQLException e) {
   			e.printStackTrace();
   		}

   	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		String id = request.getParameter("id");
		try(PreparedStatement statement = connection.prepareStatement("select * from product where productID=?");){
			statement.setString(1, id);
			ResultSet results = statement.executeQuery();
			statement.getResultSet();
			PrintWriter out = response.getWriter();
			if(results.next())
			{
				String productid = results.getString(1);
				String productname=  results.getString(2);
				String cost = results.getString(3);
				request.setAttribute("productid", productid);
				request.setAttribute("productname", productname);
				request.setAttribute("cost", cost);
				RequestDispatcher rd = request.getRequestDispatcher("/list-product.jsp");
				rd.forward(request, response);
			}else {
				response.setContentType("text/html");

				out.println("<h4>Check your productID</h4>");
				out.println("<p><a href=\"ProductFind.html\">GO BACK</a></p>");
			}
				
			

			
		}catch (SQLException e) {		
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}