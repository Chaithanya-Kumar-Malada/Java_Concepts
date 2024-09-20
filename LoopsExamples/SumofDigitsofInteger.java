package LoopsExamples;

public class SumofDigitsofInteger {

	public static void main(String[] args) {
	
		
		int num = 301;
		int sum = 0;
		
		while(num > 0) {
			
			sum = sum + num % 10;
			num = num / 10;
		}
		
		System.out.println("Sum of Digits: "+ sum);
		
		//for(int i=0;i<=2;i++) {
			
		//	char x= n.charAt(i);
		//	System.out.println("val: "+ x );
			
			//int a = Character.getNumericValue(x);
			//System.out.println("resukt"+a);
			//int a = Integer.parseInt(String.valueOf(x));
			
			//res = x+x;
			//System.out.println(res);
		//}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
