package sahoo.controllers;

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
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	Connection c=DriverManager.getConnection(
	    			"jdbc:mysql://localhost:3306/6cse6","root","sunil");
	    	String rn=request.getParameter("r");
	    	String sql="delete from student where regdno=?";
	    	PreparedStatement p=c.prepareStatement(sql);
	    	p.setString(1, rn);
	    	p.executeUpdate();
	    	response.getWriter().println("<h2> record deleted");
	       }catch(Exception e) {
	    	   System.out.println(e);
	       }
		}

	}


