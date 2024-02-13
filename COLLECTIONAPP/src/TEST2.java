import java.util.Scanner;

//create a functional interface shape to implement a method
// area() to print area of circle and square.
//use lambda expression
@FunctionalInterface
interface shape {
	void area();
}
public class TEST2 {

	public static void main(String[] args) {
        shape r = ()->{
        	int radious;
        	double a;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter radious");
        	radious=sc.nextInt();
        	a=3.141*radious*radious;
        	System.out.println("area of anonymous circle is "+a);
        };
        r.area();
        r=()-> {
        	int side;
        	double a;
        	Scanner sc = new Scanner(System.in);
        	System.out.println("Enter side");
        	side=sc.nextInt();
        	a=side*side;
        	System.out.println("area of anonymous square is "+a);	
        };
        r.area();
	}

}
