package com.pu.controllers;

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
			Connection con=null;
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6csd3","root","sunil");
			String r=request.getParameter("r");
			String sql="delete from student where regdno=?";
			PreparedStatement p=con.prepareStatement(sql);
			p.setString(1,r);
			p.executeUpdate();
			response.getWriter().println("Record Deleted");
				
			}catch(Exception e) {
				System.out.println(e);
			}
	}

}
