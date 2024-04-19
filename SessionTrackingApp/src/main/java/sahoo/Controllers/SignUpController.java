package sahoo.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignUpController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
//code for  receiving and validating
String un=req.getParameter("u");
String pwd=req.getParameter("p");
if(pwd.equalsIgnoreCase("123")) {
HttpSession session = req.getSession();
session.setAttribute("USERNAME",un);
session.setAttribute("PASSWORD",pwd);
res.setContentType("text/html");
res.getWriter().print("<a href="+"login"+">Click for Login"+"</a>");
}else {
	res.getWriter().print("<a href="+"signup.html"+">ReEnter Password "+"</a>");
}
		}catch(Exception e) {}
	}
}

