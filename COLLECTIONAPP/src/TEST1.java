//JAVA 8 NEW FEATURES
//1. FUNCTIONAL INTERFACE
/* functional interface is an interface that consists exactly one 
 * abstract method. Unlike interface we can keep n number of abstract
 * methods in an interface before java 8. 
 * Lambda expression is not applicable before java 8 other than
 *  functional interface
 *  @FunctionalInterface is used to declare an intterface as functional
 *  There will be many (apis to be used) open source libraries 
 *  which consists of functional interface instead of interface.
   Example Runnable , Clonable, Serializable, ActionListener
   These are functional and marker interface 
 */
 
//2. LAMDA EXPRESSION
//3. STREAM METHODS FOR COLLECTION
// create an interface with three methods , refactor it using functional
//interface
@FunctionalInterface
interface myinterface1 {
	void method1();
	
}
@FunctionalInterface
interface myinterface2 {
	void method2();
	
}
@FunctionalInterface
interface myinterface3 {
	void method3();
	
}
//partial implementation of interface is not allowed before java8

public class TEST1 {

	public static void main(String[] args) {
// object creation
		//polymorphism   or loose-coupling approach
		   myinterface1 R1=()->{
			  System.out.println(" method1 implemented in anonymous class1");
		   };
		   myinterface2 R2=()->{
			  System.out.println(" method2 implemented in anonymous class1");   
		   };
		   myinterface3 R3=()->{
			   System.out.println(" method3 implemented in anonymous class1");
		   };
		   R1.method1();
		   R2.method2();
		   R3.method3();
		   R1=()->{
			 System.out.println("Method1 implemented in anonymous class2");  
		   };
		   R2=()->{
			 System.out.println("Method2 implemented in anonymous class2");  
			   };
			   
		   R3=()->{
			System.out.println("Method3 implemented in anonymous class2");  
				   };
				   R1.method1();
				   R2.method2();
				   R3.method3();	   
		   
	}

}








