package Collections;

import java.util.ArrayList;
import java.util.*;


public class ArrayList_ {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList<String>();
		
//		 				Or
//	    Another way to create ArrayList object to use this we have to import java.util.*; All packages	
//		List<String> names = new ArrayList<>(); 
		
		names.add("surya");
		names.add("chai");
		names.add("lav");
		names.add("gov");
		names.add("surya");
		names.add(null);
		
		System.out.println("String List  : "+ names);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(34);
		numbers.add(22);
		numbers.add(65);
		System.out.println("Integer List : "+ numbers);
		
		ArrayList<Float> Fnumbers = new ArrayList<Float>();
		
		Fnumbers.add(4.5f);
		Fnumbers.add(2.5f);
		Fnumbers.add(3.5f);
		Fnumbers.add((float)1.5);     				    // Another way to add Float Numbers....
		Fnumbers.add(8.5f);
		System.out.println("Float List : "+ Fnumbers);
		
		
		ArrayList<Character> chars = new ArrayList<Character>();
		
		chars.add('A');
		chars.add('D');
		chars.add('B');
		chars.add('C');
		chars.add('Q');
		
		System.out.println("cHARACTER List : "+ chars);
		
		
	}

}
