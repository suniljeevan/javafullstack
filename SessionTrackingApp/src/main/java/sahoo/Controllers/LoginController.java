package sahoo.Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		try {
		HttpSession session=req.getSession(); 
		String un=(String) session.getAttribute("USERNAME");
		String pwd=(String) session.getAttribute("PASSWORD");
		String email="default@gmail.com";
		res.setContentType("text/html");
		
		res.getWriter().print("<h1>Credentials Received<h1>");
		res.getWriter().print("<h2>"+un+"</h2><br>");
		res.getWriter().print("<h2>"+pwd+"</h2><br>");
		res.getWriter().print("<h2>"+email+"</h2><br>");
		res.getWriter().print("<a href="+"access"+">Visit Products"+"</a>");
		}catch(Exception e) {}
	}

}
