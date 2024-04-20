package Sahoo.Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public AddStudentController() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/6CSE5","root","sunil");
			String sql="insert into student values(?,?,?)";
			PreparedStatement p=c.prepareStatement(sql);
		int id=Integer.parseInt(request.getParameter("i"));
		String name=request.getParameter("n");
		double cgpa=Double.parseDouble(request.getParameter("c"));
		p.setInt(1, id);
		p.setString(2, name);
		p.setDouble(3, cgpa);
		int r=p.executeUpdate();
		response.setContentType("text/html");
		response.getWriter().print("<h2>"+r+" record inserted"+"</h2>");
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}





