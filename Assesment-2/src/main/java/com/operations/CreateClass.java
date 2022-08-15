package com.operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.domain.ClassDetails;
import com.domain.StudentDetails;
import com.Util.Util;

@WebServlet("/class")
public class CreateClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("add-class.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name1 = request.getParameter("Name");
		String section = request.getParameter("section");
		String roomNo = request.getParameter("roomno");
		
		try {
			SessionFactory factory = Util.buildConnection();
			
			Session session = factory.openSession();
			ClassDetails classdetails = new ClassDetails(name1, section, roomNo);
			
			Transaction tx = session.beginTransaction();
			
			session.save(classdetails);
			
			tx.commit();
			
			if(session != null) {
				out.println("<div align='center'>CLASS ADDED SUCCESSFULLY</br>"
						+ "<a href='admin-page.html'>RETURN TO MainMenu</a>"
						+ "</div>");
			}
			session.close();
		} catch (Exception e) {
			out.println("<div align='center'>TRY AGAIN..."
					+ "<a href='admin-page.html'>RETURN TO MainMenu</a>"
					+ "</div>");
		}
	}

}