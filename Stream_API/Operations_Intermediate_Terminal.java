package Stream_API;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Operations_Intermediate_Terminal {

	public static void main(String[] args) {
		
		
		
		int arr[] = {2,4,6,1,3,5,7,9,8};
		
		String name[] = {"Surya","chaithanya","Chai","Sumo", "Lav"};
		
		
		Arrays.stream(arr).forEach(i -> System.out.println(i));   // Printing numbers using StreamAPI
		
		Arrays.stream(arr).sorted().forEach(i -> System.out.println("Sorted :"+i));   // Sorting numbers 
		
		
		
		Arrays.stream(arr).filter(i -> i%2==0).forEach(i -> System.out.println(i));  // Filtering Even numbers
		
		Arrays.stream(arr).filter(i -> i%2 !=0).forEach(i -> System.out.println(i)); // Odd numbers
		
		Arrays.stream(name).filter(i -> i.startsWith("S")).forEach(i->System.out.println(i));
		Arrays.stream(name).filter(i -> i.endsWith("v")).forEach(i->System.out.println(i));
		Arrays.stream(name).filter(i -> i.length()>4).forEach(i->System.out.println("length 5: "+i));
		
		
		Arrays.stream(arr).map(i -> i*i).forEach(i->System.out.println("Values multiply: "+i));
		
		Arrays.stream(arr).map(i -> i*5).filter(i -> i%10 ==0).forEach(i->System.out.println("10 multiply: "+i));
		
		int arr1[] = {1,1,2,1,2,3,4,5};
		
		Arrays.stream(arr1).distinct().forEach(i->System.out.println(i)); //   Removes Duplicates
		
		int maxNo = Arrays.stream(arr1).max().orElse(0);        // Max value
			System.out.println("Max : "+ maxNo);
			
		int minNo = Arrays.stream(arr1).min().orElse(0);        // Min Value
			System.out.println("Max : "+ minNo);
		
		long Count = Arrays.stream(arr1).count();               // Count() or length
			System.out.println("count : "+Count);
	
			
			int arr2[] = {-10,-9,1,2,3,4,5,6,7,8,9,10};
			
			
			Arrays.stream(arr2).filter(i -> i%2 !=0 && i>0).forEach(i -> System.out.println(i));  // ODD
			
			           //          OR
			
			int[] evenarr = Arrays.stream(arr2).filter(i -> i%2==0 && i>0).toArray();  // Even 
			
			Arrays.stream(evenarr).forEach(i -> System.out.println(i));
			
			
	}

}
