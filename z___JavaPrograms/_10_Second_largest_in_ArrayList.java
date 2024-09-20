package z___JavaPrograms;

import java.util.*;

import java.util.ArrayList;

public class _10_Second_largest_in_ArrayList {

	public static void main(String[] args) {


		
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,11,2,3,20,5,6,7,8,9,10));
		
		Collections.sort(l1);
		
		//Collections.sort(l1,Collections.reverseOrder());       ReverseOrder
		
		System.out.println(l1);
											//System.out.println(l1.size());
		
		System.out.println("Second Highest Number : "+ l1.get( l1.size()-2 ));
		
		System.out.println("Second minimum Number : "+ l1.get(1));
		
		
		
		
		
	}
}
