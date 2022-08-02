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
		if((userid.equals("admin")) && (password.equals("admin"))){
			out.println("Login successfully");
		} else {
			out.println("Invalid User Check your Userid and Password");
		}

	}

}
