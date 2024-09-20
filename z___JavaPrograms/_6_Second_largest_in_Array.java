package z___JavaPrograms;

import java.util.Arrays;

public class _6_Second_largest_in_Array {

	public static void main(String[] args) {
		
		
		int arr[] = {1,3,5,7,9,2,4,6,8,10,11,12,55,45};
		
		Arrays.sort(arr);
		
		for(int i: arr) {
		System.out.println(i);
		}
		
		System.out.println("First largest  number :"+  arr[ arr.length-1 ]);
		System.out.println("Second largest number :"+ arr[ arr.length-2 ]);
		
		
		
		
		
		
		
		
	}

}
