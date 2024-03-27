package SAHOO.SERVICES;

import java.util.List;

import SAHOO.ENTITIES.Student;
import SAHOO.REPOSITORIES.StudentDAO;

public class StudentService {
	//@Autowired  later
	//Explicit wiring StudentRepository with StudentService
	private StudentDAO studentdao;
   public StudentService(StudentDAO studentdao) {
		this.studentdao = studentdao;
	}
public int insertStudent(Student s) {
	int res=0;
	try {
	  studentdao.createConnection();
	
	  res = studentdao.insertStudent(s);
	  System.out.println(res);
	}catch(Exception e) {
		System.out.println(e);
	}
	   return res;
   }
   public int updateStudent(int id, Student s) {
	 int res = studentdao.updateStudent(id, s);
	   return res;
   }
   public int deleteStudent(int id) {
	   int res = studentdao.deleteStudent(id);
	   return res;
   }
   public List<Student> fetchAllStudents() {
	  List<Student> list=studentdao.fetchAllStudent();
	   return list;
   }
}
