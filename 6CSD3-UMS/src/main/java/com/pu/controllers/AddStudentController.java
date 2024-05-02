package com.pu.controllers;
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
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1");
		Connection con=null;
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6csd3","root","sunil");
		String r=request.getParameter("r");
		String n=request.getParameter("n");
		double c=Double.parseDouble(request.getParameter("c"));
		int i=Integer.parseInt(request.getParameter("s"));
		String sql="insert into student values(?,?,?,?)";
		PreparedStatement p=con.prepareStatement(sql);
		p.setString(1,r);
		p.setString(2, n);
		p.setDouble(3, c);
		p.setInt(4, i);
		p.executeUpdate();
		response.getWriter().println("Record Inserted");
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}






