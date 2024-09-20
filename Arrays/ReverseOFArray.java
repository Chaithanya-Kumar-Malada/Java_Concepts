package Arrays;
import java.util.Arrays;
public class ReverseOFArray {

	public static void main(String[] args) {
		
		int arr[] = {2,3,4,5,6};
		
		for(int i =arr.length-1; i>=0; i--) {
			
		  System.out.println(	arr[i] );
		}
		
		
		int arr2[] = {5,2,6,7,8};
		
		int a[];
		
		Arrays.sort(arr2);                        // sort ascending
		System.out.println("Sort of an array");
		
		for(int i : arr2) {
			
			System.out.println(i);
			                          // ascending array to reverse and descending..
			
		for(int x=arr2.length-1; x>=0; x--) {              
				 System.out.println("reverse :"+arr2[x]);
			}
		}
		
		
		
		
		//////////////////////////////////////////////////////////////////
		
		 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		 
		 for(int i =cars.length-1; i>=0; i--) {
				
			  System.out.println(	cars[i] );
			}
		 
		
		
		
		
	}

}
