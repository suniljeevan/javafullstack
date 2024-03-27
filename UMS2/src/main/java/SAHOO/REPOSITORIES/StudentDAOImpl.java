package SAHOO.REPOSITORIES;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import SAHOO.ENTITIES.Student;
import SAHOO.ENTITIES.Subject;
public class StudentDAOImpl implements StudentDAO {
	private static StudentDAOImpl ob=null;
	private Connection contodb=null;
	private StudentDAOImpl() {}
	public static StudentDAOImpl returnInstance() {
		if(ob==null)
			ob=new StudentDAOImpl();
		return ob;
	}
	public boolean createConnection()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		contodb=DriverManager.getConnection("jdbc:mysql://localhost:3306/8CSE","root","sunil");
		
		if(contodb!=null)
			return true;
		else
			return false; 
	}
	public int insertStudent(Student s) {
		int response=0,response2=0;
		try {
		PreparedStatement ps=contodb.prepareStatement("insert into student values(?,?,?)");
		//before doing this insert subject in subject table
		PreparedStatement ps2=contodb.prepareStatement("insert into enrollment values(?,?)");
		ps.setInt(1, s.getId());
		ps.setString(2, s.getName());
		ps.setString(3, s.getAddress());
		response=ps.executeUpdate();
		//ps2.setInt(1, s.getId());
		/*Set<Subject> subjects=s.getSubjects();
		//System.out.println(subjects);
	    for(Subject sub:subjects) {
	    	ps2.setString(2, sub.getSubjectCode());
	    	response2=ps2.executeUpdate();
	    	if(response2!=1)break;
	    }*/
		}catch(Exception e) {
			System.out.println(e);
		}
		if(response==1 )
		return 1;
		else return 0;
	}
	public int updateStudent(int sid,Student s) {
		int response=0;
		try {
		PreparedStatement ps=contodb.prepareStatement(
				"update student set name=?,address=? where id=? ");
		ps.setString(1, s.getName());
		ps.setString(2, s.getAddress());
		ps.setInt(3, sid);
		response=ps.executeUpdate();
		}catch(Exception e) {}
		return response;
	}
	public int deleteStudent(int sid) {
		int response=0,response2=0;
		try {
		PreparedStatement ps=contodb.prepareStatement(
				"delete from student where where id=? ");
		PreparedStatement ps2=contodb.prepareStatement(
				"delete from enrollment where where id=? ");
		ps.setInt(1, sid);
		ps2.setInt(1, sid);
		response=ps.executeUpdate();
		response2=ps2.executeUpdate();
		}catch(Exception e) {}
		if(response==1 && response2==1)
			return 1;
		else return 0;
	}
	public List<Student> fetchAllStudent(){
		List<Student> studentsFetched=new ArrayList<Student>();
		try {
			PreparedStatement ps=contodb.prepareStatement(
					"select * from student ");
			ResultSet rs=ps.executeQuery();
			Student s=new Student();
			while(rs.next()) {
			s.setId(rs.getInt(1));
			s.setName(rs.getString(2));
			s.setAddress(rs.getString(3));
			studentsFetched.add(s);
			}
			}catch(Exception e) {}
		return studentsFetched;
	}
	public Student fetchAStudent(int sid) {
		Student studentFetched=new Student();
		try {
			PreparedStatement ps=contodb.prepareStatement(
					"select * from student where id=? ");
			ps.setInt(1, sid);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				studentFetched.setId(rs.getInt(1));
				studentFetched.setName(rs.getString(2));
				studentFetched.setAddress(rs.getString(3));
			}
			}catch(Exception e) {}
		return studentFetched;
	}
}

