import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

//creating a List of custom-objects
//pojo  - plain old java object
class Student implements Comparable<Student>{
private int id;
private String name;
private double cgpa;
//ctlr alt s
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
public Student(int id, String name, double cgpa) {
	super();
	this.id = id;
	this.name = name;
	this.cgpa = cgpa;
}
public Student() {
	super();
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
}
public int compareTo(Student second) {
	return Double.compare(this.cgpa, second.cgpa);
}
}

/*class NameComparator implements Comparator<Student> {
	public int compare(Student ob1,Student ob2) {
		return ob2.getName().compareTo(ob1.getName());
	}
}*/

public class TEST4 {
	public static void main(String[] args) {
     //create a list of Students
	List<Student> studentlist=new ArrayList<Student>();
	studentlist.add(new Student(643,"sanjay",7.3));
	studentlist.add(new Student(835,"krishna",7.9));
	studentlist.add(new Student(889,"absent",8.2));
	studentlist.add(new Student(824,"harshitha",8.3));
	studentlist.add(new Student(822,"kusuma",7.8));
	studentlist.add(new Student(729,"chandana",8.9));
	studentlist.add(new Student(846,"vaishnavi",9.25));
	studentlist.add(new Student(827,"meghana",7.5));
	studentlist.add(new Student(699,"aishwarya",7.5));
	studentlist.add(new Student(585,"nisha",7.2));
	System.out.println(studentlist);
	
	// individual object for each
	for(Student i:studentlist) {
		//System.out.println(i);
	}
	ListIterator itr=studentlist.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	// filter list for cgpa >8
	List<Student>  cgpagt8list=new ArrayList<Student>();
	cgpagt8list=studentlist
			    .stream()
			    .filter(x->x.getCgpa()>8)
			    .collect(Collectors.toList());
	System.out.println("students whose cgpa>8 are");
	System.out.println(cgpagt8list);
	//filter list whose name starts with letter k
	List<Student> nameswlklist = new ArrayList<Student>();
	nameswlklist=studentlist
			     .stream()
			     .filter(x->x.getName().startsWith("k"))
			     .collect(Collectors.toList());
	System.out.println(nameswlklist);
	//find the student having highest cgpa
	Student h=studentlist
			.stream()
			.max((x,y)->Double.compare(x.getCgpa(), y.getCgpa()))
			.get();
	System.out.println("Student with highest cgpa is "+h);
	//find the student having lowest cgpa
		Student l=studentlist
				.stream()
				.min((x,y)->Double.compare(x.getCgpa(), y.getCgpa()))
				.get();
		System.out.println("Student with lowest cgpa is "+l);
	//apply anymatch allmatch, nonematch, count	
	System.out.println(
		studentlist.stream().allMatch(x->x.getCgpa()<6)
			);
	System.out.println(
			studentlist.stream().anyMatch(x->x.getCgpa()<6)
				);
	System.out.println(
			studentlist.stream().noneMatch(x->x.getCgpa()<6)
				);
	System.out.println(
			studentlist.stream().count()
				);	
	System.out.println("Before sorting");
	System.out.println(studentlist);
		Collections.sort
		(studentlist,(x,y)->x.getName().compareTo(y.getName()));
		System.out.println("After sorting in ascending order on name");
		System.out.println(studentlist);
		
	

}
}







