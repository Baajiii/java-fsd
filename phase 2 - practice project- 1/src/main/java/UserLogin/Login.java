package UserLogin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {

	public String userid, password;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		userid = req.getParameter("id");
		password = req.getParameter("password");

		PrintWriter out = res.getWriter();
		if((userid.equals("baaji")) && (password.equals("pass"))){
			out.println("Login successfully");
			out.println("<h4><a href=\"Welcome.html\">Home</a></h4>");
		} else {
			out.println("Invalid User Check your Userid and Password");
			out.println("<h4><a href=\"Login.html\">Go back</a></h4>");
		}

	}

}
