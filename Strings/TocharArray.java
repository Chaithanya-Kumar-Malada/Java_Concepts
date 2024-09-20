package Strings;
import java.util.Arrays;
public class TocharArray {

	public static void main(String[] args) {
		
		String name = "Chaithanya Kumar";
		char arr[] = name.toCharArray();
		
		//System.out.println("output: "+arr[0]);
		
	 	Arrays.toString(arr);
		
		System.out.println("Array output : ");
		
		for(char i : arr) {
			System.out.println(i);

		}
		
		
				
		
	}

}
