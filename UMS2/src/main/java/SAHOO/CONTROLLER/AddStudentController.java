package SAHOO.CONTROLLER;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import SAHOO.ENTITIES.Student;
import SAHOO.REPOSITORIES.StudentDAO;
import SAHOO.REPOSITORIES.StudentDAOImpl;
import SAHOO.SERVICES.StudentService;

/**
 * Servlet implementation class AddStudentController
 */

public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentDAO studentdao;
    private StudentService studentservice;
    private Student ob;
    public AddStudentController() {
       studentdao=StudentDAOImpl.returnInstance();
       studentservice=new StudentService(studentdao);
       ob=new Student(); 
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("n");
		String address = request.getParameter("a");
		ob.setId(id);ob.setName(name);ob.setAddress(address);
		//studentdao.createConnection();
		response.setContentType("text/html");
		response.getWriter().print("Connection Established");
		int r=studentservice.insertStudent(ob);
		
		if(r==1)
		response.getWriter().print("<h2> student inserted </h2>");
		else
			response.getWriter().print("<h2> error... </h2>");	
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
