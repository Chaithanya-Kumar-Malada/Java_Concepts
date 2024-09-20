package LoopsExamples;

public class FactorialValueofNumber {

	public static void main(String[] args) {
		
		int n=5;
		int fac =1;

		for(int i=1; i<=n; i++) {
			
			fac =fac*i;
		}
		
		System.out.println("Factorial value of 5 : "+ fac);	
		
		
	}
}
