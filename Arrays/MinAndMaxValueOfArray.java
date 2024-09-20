package Arrays;
import java.util.Arrays;
public class MinAndMaxValueOfArray {

	public static void main(String[] args) {
		
		int arr[]= {-2,0,56,76,3,34,12,78,94,245,73,8,345};
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Min : "+arr[0]);
		System.out.println("Max :"+ arr[arr.length-1]);
		
			
	}
}
