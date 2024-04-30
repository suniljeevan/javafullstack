package sahoo.controllers;
import java.sql.*;
import java.io.IOException;
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
    			"jdbc:mysql://localhost:3306/6cse6","root","sunil");
    	String rn=request.getParameter("r");
    	String nm=request.getParameter("n");
    	double cgpa=Double.parseDouble(request.getParameter("c"));
    	int sem=Integer.parseInt(request.getParameter("s"));
    	String sql="insert into student values(?,?,?,?)";
    	PreparedStatement p=c.prepareStatement(sql);
    	p.setString(1, rn);
    	p.setString(2, nm);
    	p.setDouble(3, cgpa);
    	p.setInt(4,sem);
    	p.executeUpdate();
    	response.getWriter().println("<h2> record inserted");
       }catch(Exception e) {}
	}

}







