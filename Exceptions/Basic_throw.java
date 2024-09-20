package Exceptions;

public class Basic_throw {

	public static void main(String[] args) {

		int age =10;

		if(age<18) {
			
			//System.out.println("not eligible...");  
			
			throw new ArithmeticException("Age is not eligible for marriage ");
			
			   
			
		}else {
			
			System.out.println("Eligible for marriage.......");
		}
		
		
		

	}

}
