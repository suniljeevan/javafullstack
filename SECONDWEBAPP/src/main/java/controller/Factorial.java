package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Factorial() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		int n=Integer.parseInt(request.getParameter("number"));
		long f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		pw.print("<h2>"+"Factorial is "+f+"</h2>");
	}

}
