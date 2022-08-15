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

import com.domain.StudentDetails;
import com.domain.SubjectDetails;
import com.Util.Util;

@WebServlet("/subject")
public class CreateSubject extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("add-subject.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("Name");
		String code = request.getParameter("code");
		String teacher = request.getParameter("teacher");
		String Classno = request.getParameter("class");
		
		try {
			SessionFactory factory = Util.buildConnection();
			
			Session session = factory.openSession();
			
			SubjectDetails subjectdetails = new SubjectDetails(name, code, teacher, Classno);
			
			Transaction tx = session.beginTransaction();
			
			session.save(subjectdetails);
			
			tx.commit();
			
			if(session != null) {
				out.println("<div align='center'>SUBJECT ADDED SUCCESSFULLY</br>"
						+ "<a href='admin-page.html'>RETURN To MainMenu</a>"
						+ "</div>");
			}
			session.close();
		} catch (Exception e) {
			out.println("<div align='center'>TRY AGAIN..."
					+ "<a href='admin-page.html'>RETURN To MainMenu</a>"
					+ "</div>");
		}
	}

}