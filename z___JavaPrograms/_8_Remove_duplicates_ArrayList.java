package z___JavaPrograms;

import java.util.*;

//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
import java.util.stream.Collectors;
//
//import java.util.LinkedHashSet;

public class _8_Remove_duplicates_ArrayList {

	public static void main(String[] args) {
		
		// Using StreamAPI
		
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(3);
		l1.add(2);
		l1.add(1);
		System.out.println(l1);
		
		List<Integer> l2 =	l1.stream().distinct().collect(Collectors.toList())  ;
		
		System.out.println(l2);
		
		
		// Using LinkedHashSet
		
		ArrayList<Integer> Numbers = new ArrayList<>( Arrays.asList(1,2,3,4,2,3,1,4,5,6,5));
		
		System.out.println("ArrayList values : "+ Numbers);
		
		LinkedHashSet<Integer> removedup = new LinkedHashSet<>();
		
		removedup.addAll(Numbers);

		//System.out.println("LinkedHashSet Values : "+ removedup);
		
		Numbers.clear();
		Numbers.addAll(removedup);
		
		System.out.println("Removed duplicates from ArrayList : "+ Numbers);

	}
}
