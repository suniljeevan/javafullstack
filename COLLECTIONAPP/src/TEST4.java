import java.util.ArrayList;
import java.util.List;

//List for custom objects
//pojo-plain old java object (legacy)
//constructor, setter and getter toString() 
//equals() and hashCode()
class Student {
	private int id;
	private String name;
	private double cgpa;
	//shift alt s
	public Student(int id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	public Student() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}
	
}
public class TEST4 {
	public static void main(String[] args) {
    //creating a list of custom student object
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(new Student(389,"rohan",7.8));
		studentlist.add(new Student(401,"dileep",8.6));
		studentlist.add(new Student(388,"thousif",9.4));
		studentlist.add(new Student(342,"upendra",8.3));
		studentlist.add(new Student(609,"laxmi",7.9));
		studentlist.add(new Student(712,"chandana",7.4));
		studentlist.add(new Student(245,"shruthi",8.2));
		studentlist.add(new Student(1,"asmitha",8.6));
		studentlist.add(new Student(75,"madiha",8.8));
		studentlist.add(new Student(94,"rajkumar",7.8));
		studentlist.add(new Student(742,"thasmay",5.8));
		studentlist.add(new Student(729,"pavani",7.9));
		studentlist.add(new Student(736,"vamshika",9.4));
		studentlist.add(new Student(716,"srihitha",7.8));
		studentlist.add(new Student(789,"harshitha",8.3));
		
	
	}

}








