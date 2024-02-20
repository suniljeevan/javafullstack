import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

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
class IdComparator implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return Integer.compare(f.getId(), s.getId());
	}
}
class CgpaComparator implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return Double.compare(f.getCgpa(), s.getCgpa());
	}
}
class NameComparator implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return f.getName().compareTo(s.getName());
	}
}
class IdComparatorDesc implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return Integer.compare(s.getId(), f.getId());
	}
}
class CgpaComparatorDesc implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return Double.compare(s.getCgpa(), f.getCgpa());
	}
}
class NameComparatorDesc implements Comparator<Student> {
	public int compare(Student f,Student s) {
		return s.getName().compareTo(f.getName());
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
		studentlist.add(new Student(1,"asmita",8.6));
		studentlist.add(new Student(75,"madiha",8.8));
		studentlist.add(new Student(94,"rajkumar",7.8));
		studentlist.add(new Student(742,"thasmay",5.8));
		studentlist.add(new Student(729,"pavani",7.9));
		studentlist.add(new Student(736,"vamshika",9.4));
		studentlist.add(new Student(716,"srihitha",7.8));
		studentlist.add(new Student(789,"harshitha",8.3));
		//Displaying the list at a time
		System.out.println("list as one object");
		System.out.println(studentlist);
		//Displaying objects present in the list
		System.out.println("through forEach loop");
		for(Student s:studentlist) {
			System.out.println(s);
		}
		//Displaying through forEach
		System.out.println("through forEach method");
		studentlist.stream() 
		           .forEach(x->System.out.println(x));
		//Displaying through iterator
		System.out.println("through list iterator");
		ListIterator<Student> itr=studentlist.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	//insert delete search
		studentlist.add(0,new Student(765,"anjaneya",7));
		studentlist.add(16,new Student(105,"pavan",7.2));
		studentlist.add(10,new Student(749,"priya",8.8));
		System.out.println(studentlist);
		studentlist.remove(0);
		System.out.println(studentlist);
		studentlist.remove(new Student(749,"priya",8.8));
		System.out.println(studentlist);
		if(studentlist.contains(new Student(749,"priya",8.8))) 
			System.out.println("is present in the list");
		else
			System.out.println("is not present in the list");
		
		//binary search
	int p=Collections.binarySearch
			(studentlist,new Student(342,"upendra",8.3),new IdComparator());
		System.out.println("is present in the list at "+p+" index");
		//binary search returns index of the object from a sorted collection
		Student ob1=new Student(101,"amith",7.5);
		Student ob2=new Student(100,"nithin",7.8);
		Student ob3=new Student(102,"sreekanth",7.4);
		Student ob4=new Student(109,"supriya",7.3);

		List<Student> secondlist=new ArrayList<Student>();
		secondlist.add(ob1);secondlist.add(ob2);secondlist.add(ob3);
		System.out.println("second list "+secondlist);
		Collections.sort(secondlist,new IdComparator());
		int index=Collections.binarySearch(secondlist, ob4,new IdComparator());//-1-p
		System.out.println(index);
		
		
		//sort by id
		Collections.sort(studentlist,new IdComparator());
		System.out.println("Ascending by id"+studentlist);
		//sort by name
		Collections.sort(studentlist,new NameComparator());
		System.out.println("Ascending by name"+studentlist);
		//sort by cgpa
		Collections.sort(studentlist,new CgpaComparator());
		System.out.println("Ascending by cgpa"+studentlist);
		
		//sort by id
		Collections.sort(studentlist,new IdComparatorDesc());
		System.out.println("Descending by id"+studentlist);
		//sort by name
		Collections.sort(studentlist,new NameComparatorDesc());
		System.out.println("Descending by name"+studentlist);
		//sort by cgpa
		Collections.sort(studentlist,new CgpaComparatorDesc());
		System.out.println("Descending by cgpa"+studentlist);
		
		
		// sort using method reference
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}








