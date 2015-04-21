package collections;
import java.util.*;
public class arraylist {

	   public static void main(String args[]) {
	      // Create an array list
	     // ArrayList al = new ArrayList();
	      // add elements to the array list
		   List<Integer> al=new ArrayList<Integer>();
	      al.add(6);
	      al.add(5);
	      al.add(4);
	      al.add(3);
	      al.add(2);
	      al.add(6);

	      // Use iterator to display contents of al
	      System.out.print("Original contents of al: ");
	      Iterator itr = al.iterator();
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      
}
}
