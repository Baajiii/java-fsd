package com.operations;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.domain.ClassDetails;
import com.domain.SubjectDetails;
import com.Util.Util;

@WebServlet("/listsubjects")
public class ShowSubjects extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			SessionFactory factory = Util.buildConnection();
			
			Session session = factory.openSession();
			
			List<SubjectDetails> list = session.createQuery("from SubjectDetails").list();

			
			out.println("<h2>LIST OF SUBJECTS");
			out.println("</br>");
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>S.No  </th>");
			out.println("<th>Subject Name  </th>");
			out.println("<th>Subject Code  </th>");
			out.println("<th>Subject Teacher  </th>");
			out.println("<th>Class No </th>");
			out.println("<tr>");
			
			for(SubjectDetails subdet : list) {
				out.println("<tr>");
				out.println("<td>"+ subdet.getId() +"</td>");
				out.println("<td>"+ subdet.getSubjectName() +"</td>");
				out.println("<td>"+ subdet.getSubjectCode()+"</td>");
				out.println("<td>"+ subdet.getSubjectTeacher() +"</td>");
				out.println("<td>"+ subdet.getClassNo() +"</td>");
				out.println("</tr>");

			}

			out.println("</table>");
			out.println("</br></br></br>");
			out.println("<a href='admin-page.html'>RETURN To MainMenu</a>");
			session.close();
		} catch (Exception e) {
			out.println("<h2 style='color:red'>TRY AGAIN...<h2>");
			out.println("<a href='admin-page.html'>RETURN To MainMenu</a>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}