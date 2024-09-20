package Arrays;
import java.util.*;
import java.util.Arrays;
public class ArrayElementsFromUser {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the sixe :");
		
		int size = sc.nextInt();
		
		int input[] = new int[size];
		
		System.out.println("Enter the Elements :");
		
		for(int i=0;i<size;i++) {
			
			input[i] = sc.nextInt();
		}
		
		Arrays.sort(input);   // sorts array ascending order....
		
		for(int i : input) {
			System.out.println("The elements are :"+ i);
		}
		
		
		
		
	}

}
