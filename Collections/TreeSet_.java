package Collections;

import java.util.TreeSet;


public class TreeSet_ {

	public static void main(String[] args) {
		
		TreeSet<String> l1 = new TreeSet<String>();
		
		//l1.add(null);
		l1.add("Surya");
		l1.add("Chai");
		//l1.add(2,"Chaithanya");
		
		//l1.get(0);
	
		System.out.println(l1);
		
	 System.out.println(l1.size());	
	 
		System.out.println(l1.remove("Chai"));
		System.out.println(l1.contains("Surya"));
		
		System.out.println(l1);

	}

}
