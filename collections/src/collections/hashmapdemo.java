package collections;

import java.util.*;
public class hashmapdemo {

	   public static void main(String args[]) {
	      // create hash map
	      HashMap<Double,String> newmap = new HashMap<Double,String>();
	      
	      // populate hash map
	      newmap.put(new Double(1), "tutorials");
	      newmap.put(new Double(2), "point");
	      newmap.put(new Double(3), "is best");
	      
	      // create set view for the map
	      Set set=newmap.entrySet();
	      
	      // check set values
	      System.out.println("Set values: " + set);
	   }    
	}


