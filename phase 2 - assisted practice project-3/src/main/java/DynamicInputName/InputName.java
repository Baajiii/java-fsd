package DynamicInputName;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class InputName extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Inside InputName servlet service method");
		res.setContentType("text/html");
		String name = req.getParameter("Name");
		PrintWriter out = res.getWriter();
		out.println("<h3>My Name is " + name + "</h2>" );
		
	}



}
