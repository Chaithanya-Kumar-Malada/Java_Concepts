package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class More_Operations {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,50};
		
		// Using boxed() and collect();
		
		List<Integer> l1 = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(l1);
		
		// To find max and min in Integer Stream
		
		
		OptionalInt max = l1.stream().mapToInt(i -> i.intValue()).max();   // without orElse();
		int min = l1.stream().mapToInt(i -> i.intValue()).min().orElse(0);
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		
		
		List<Integer> l2 = l1;
		
	l2.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(+i));
		
		
	 boolean x =	l2.stream().anyMatch(i-> i%2==0);     // anyMatch();
	 boolean y =	l2.stream().allMatch(i-> i>0);        // allMatch();
	 boolean z =	l2.stream().noneMatch(i-> i<0);        // noneMatch();
	
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		long a = l2.stream().count();                        // Count();
		 System.out.println("Count :"+a);
		 
		 int first = l2.stream().findFirst().orElse(0);
		 int last = l2.stream().findAny().orElse(0);
		 
		 System.out.println(first);
		 System.out.println(last);
		 
	}

}
