package LoopsExamples;
import java.util.Arrays;

public class FindMaxandMinValue {

	
	 public static void main(String[] args) {
	        
	        int [] arr = {2,6,4,1,7,10};
	        Arrays.sort(arr);
	        
	        for(int i : arr){
	             System.out.println(i);
	        }
	        
	         System.out.println("min :" + arr[0] + "and max"+ arr[arr.length-1] );
	        
	        
	       
	    }
}
