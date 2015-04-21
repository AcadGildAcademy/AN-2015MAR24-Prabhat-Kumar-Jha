package collections;
import java.util.*;
public class hashset {

	   public static void main(String args[]) {
	      // create a hash set
	      Set<String> hs = new HashSet<String>();
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      Iterator iterator=hs.iterator();
	      while(iterator.hasNext())
	      {
	      System.out.println(iterator.next());
	   }
	}
}

