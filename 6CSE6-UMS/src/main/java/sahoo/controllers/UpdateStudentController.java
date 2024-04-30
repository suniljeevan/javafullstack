package sahoo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
     	Class.forName("com.mysql.jdbc.Driver");
     	Connection c=DriverManager.getConnection(
     			"jdbc:mysql://localhost:3306/6cse6","root","sunil");
     	String rn=request.getParameter("r");
     	String nm=request.getParameter("n");
     	double cgpa=Double.parseDouble(request.getParameter("c"));
     	int sem=Integer.parseInt(request.getParameter("s"));
     	String sql="update student set name=?, cgpa=?,semester=? where regdno=?";
     	PreparedStatement p=c.prepareStatement(sql);
     	p.setString(1, nm);
     	p.setDouble(2, cgpa);
     	p.setInt(3, sem);
     	p.setString(4,rn);
     	p.executeUpdate();
     	response.getWriter().println("<h2> record updated");
        }catch(Exception e) {}
 	}

 }
