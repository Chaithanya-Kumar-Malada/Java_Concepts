package LoopsExamples;

public class ChecknumberPrimeOrNot {

	public static void main(String[] args) {
		
		int n = 9;
		
		while(n<=100) {
			
			if(n%2==0) {
					System.out.println("The given number is Prime : " + n);
				break;     }	
			
			if(n%2!=0){
					System.out.println("The given number is Odd : " + n);
				break;        }
			n++;
		}
		
		
	}
}
