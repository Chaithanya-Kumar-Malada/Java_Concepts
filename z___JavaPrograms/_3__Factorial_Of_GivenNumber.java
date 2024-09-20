package z___JavaPrograms;

import java.util.*;

public class _3__Factorial_Of_GivenNumber {

	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		
		int num = sc.nextInt();
		int fac = 1;
		
		for(int i =1; i<=num;i++) {
			
			fac = fac * i;               // 5*4*3*2*1   1>2>6>24>120    
		}
		
		System.out.println("Factorial of given number : "+ fac);
		
		
		
		
		
		
		
		
		
		
		
	}
}
