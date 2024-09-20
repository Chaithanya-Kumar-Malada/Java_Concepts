package Collections;

//import java.util.*;

import java.util.ArrayList;

//import java.util.Collections;

public class ArrayList_Methods {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("surya");       					// add(element);
		names.add("chai");
		names.add("lav");
		names.add("gov");
		names.add("surya");
		names.add(null);
		names.add(4,null);       					 // add(index, element);
		names.set(0, null);                          // set(index, element);
		
		System.out.println( names);
		
		System.out.println(names.size());   		// size();
		System.out.println(names.isEmpty());        // isEmpty();
		System.out.println(names.contains("lav"));  // contains();
		names.remove(0);                            // remove(index);
		
	    System.out.println(names.get(1));            // get(index);
		
		System.out.println("String List1  : "+ names);
		
		
		
		ArrayList<String> names2 =new ArrayList<>();
		
		names2.add("sumo");       					// add(element);
		names2.add("kodi");
		names2.add("salman");
		names2.add("sathish");
		names2.add("Ram");
		names2.add(4,null); 
		
		ArrayList<String> names3 =new ArrayList<>();
		
		names3.add("Java");       					// add(element);
		names3.add("OOPs");
		names3.add("SQL");
		
		System.out.println("String List2  : "+ names2);
		
		names.addAll(names2);											// addAll(ListName);
		
		System.out.println("Combine List1 + List2 : "+ names);    
		 
		names.addAll(3,names3);                                         // addAll(index , ListName);
		
		System.out.println("Adding List3 based on Index : "+ names);
		
		
		//Collections.sort(names);
		
		//Collections.reverse(names);
	
		//System.out.println("Sorting names List1 : "+ names);
		

	}

}
