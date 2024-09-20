package Lamda_Expression;

import java.util.*;


public class Adding_No_From_User_using_Lamda  {

	
	 interface details{                   //   Functional Interface 
		 int add(int x, int y);
	}

	public static details addition() {
		
		return (x,y) -> { System.out.println("Sum of X and Y is : "); 
		return x+y ; };
	}
	
	
	
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number : ");
		int num2 = sc.nextInt();
		
		
		
		System.out.println(addition().add(num1, num2));
		
		
		

		
	}

}
