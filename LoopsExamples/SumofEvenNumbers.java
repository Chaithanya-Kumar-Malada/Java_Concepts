package LoopsExamples;

public class SumofEvenNumbers {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0;i<=20;i=i+2){
			
			sum = sum+i;
		}
		System.out.println("Sum of Even Numbers between 1 to 20 : "+ sum);	

	}
}
