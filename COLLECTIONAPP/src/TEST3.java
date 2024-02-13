import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
//LIST INTERFACE METHODS WITH ArrayList (IMPLEMENTED CLASS)
//there are 2 kinds of list to keep objects
//1. generic list to hold objects of primitive types-heterogeneous
//2. specific list to hold objects for both type(primitive and custom)-homogeneous
public class TEST3 {
	public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(7);
        list.add(15); 
        list.add(42);
        //how to check List created above
        //List allows duplicates , preserves the insertion order
        System.out.println(list);//possible bcz of toString()
        //how to print objects inside the list object
        System.out.println("using for-each");
        for(Integer i:list) {
        	System.out.println(i);
        }
        System.out.println("using iterator");
        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        //insert at begin , end and any position
        System.out.println(list);
        list.add(0,100);
        System.out.println(list);
        list.add(5,200);
        System.out.println(list);
        list.add(3,300);
        System.out.println(list);
        //delete object from list
        list.remove(0);
        System.out.println(list);
        Integer ob = new Integer(200);
        list.remove(ob);
        System.out.println(list);
        //searching an object
        ob=new Integer(7);
       if( list.contains(ob)) 
       System.out.println("Present");
       else 
    	   System.out.println("Not Present");
	//find index of an object
	System.out.println(list.indexOf(ob));
	System.out.println("printing few elements......");
	//printing few objects from the list 
	   for (int i=0;i<=2;i++) {
		   System.out.println(list.get(i));
	   }
	   
	   //soring in default/natural order
	   //sorting specific-primitive list
	   Collections.sort(list);
	   System.out.println("After sorting");
	   System.out.println(list);
	   list.add(19);
	   list.add(24);
	   list.add(53);
	   list.add(76);
	   System.out.println(list);
	   //filter only the odd integer objects from the above list
	   System.out.println("printing odd elements");
	   for(Integer i:list) {
		   if(i%2!=0)
			   System.out.println(i);
	   }
	   //create a separate list to hold all odd objects
	   List<Integer> oddlist=new ArrayList<Integer>();
	   for(Integer i:list) {
		   if(i%2!=0)
			   oddlist.add(i);
	   }
	   
	   //LambdaExpression
	  oddlist= list.stream().filter(e->e%2!=0).collect(Collectors.toList());
	  System.out.println("Printing odd list...");
	   System.out.println(oddlist);
	   System.out.println(list);
	   boolean res=list.stream().allMatch(e->e%5==0);
	   System.out.println(res);
	    res=list.stream().anyMatch(e->e%5==0);
	   System.out.println(res);
	    res=list.stream().noneMatch(e->e%5==0);
	   System.out.println(res);
	  
	   int greatest=list.stream().max((x,y)->Integer.compare(x, y)).get(); 
	   System.out.println("Greatest element in the list "+greatest);
	   int smallest=list.stream().min((x,y)->Integer.compare(x, y)).get(); 
	   System.out.println("Smallest element in the list "+smallest);
	   //try with method reference
	  long count=list.stream().count(); 
	   System.out.println("No. of objects "+count);
	}
}







