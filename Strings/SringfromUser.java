package Strings;
import java.util.*;
public class SringfromUser {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Name : ");
		
		String name = sc.next();
		
		String last="" ;
		
		for(int i=0;i<name.length();i++) {
			
			System.out.println(name.charAt(i));
			
		}
		
		for (int i=name.length()-1; i>=0; i--) {
			
			last =last+name.charAt(i);
			
			
		}
		
		System.out.println(last + name);
		
		
		
		
	}

}
