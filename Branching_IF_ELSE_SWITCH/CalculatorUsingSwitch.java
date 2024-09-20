package Branching_IF_ELSE_SWITCH;

import java.util.*;
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		
		int a = 10;
		int b =5;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Operator to perform : + , - , *, / ");
		char cal = sc.next().charAt(0);
		
		switch(cal){
		     
			case '+':
				System.out.println("Addition of A + B :" + (a+b) );
				break;
			case '-':
				System.out.println("Subtraction of A - B :" + (a-b) );
				break;
			case '*':
				System.out.println("Multiplication of A * B :" + (a*b) );
				break;
			case '/':
				System.out.println("Division of A / B :" + (a/b) );
				break;
			default:
				System.out.println("Entered Invalid operator!" );
				break;
		}
		
		
		
	}
}
