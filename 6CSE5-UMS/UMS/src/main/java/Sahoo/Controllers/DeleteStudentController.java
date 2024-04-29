package Sahoo.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DeleteStudentController() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/6CSE5","root","sunil");
			String sql="delete from student where id=?";
			PreparedStatement p=c.prepareStatement(sql);
		int id=Integer.parseInt(request.getParameter("r"));
		p.setInt(1, id);
		int r=p.executeUpdate();
		response.setContentType("text/html");
		response.getWriter().print("<h2>"+r+" record deleted"+"</h2>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
