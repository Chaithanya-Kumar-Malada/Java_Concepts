package Collections;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {
	
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add(null);
		l1.add("Surya");
		l1.add("Chai");
		l1.add(2,"Chaithanya");
		
		
		l1.addFirst("Lav");                // addFirst 
		l1.addLast("Gov");                 // addLast
		
		System.out.println(l1);
		                   
		
		System.out.println(l1.getFirst());   		// getFirst()
		System.out.println(l1.getLast());    		// getLast()
		
		l1.removeFirst();                  // removeFirst()
		l1.removeLast();                   // removeFirst()
		
		System.out.println(l1);
		
		
	}

}
