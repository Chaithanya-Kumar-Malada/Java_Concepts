package Arrays;

public class EvenandOddNumINArray {

	public static void main(String[] args) {
		
		int x[] = {2,3,4,5,6,7,8,9};
		int sum =0;
		int sum1 =0;
		
		for(int i: x) {
			if( i%2==0) {
				System.out.println("Even  : "+ i);
			    sum =sum+i;
			}
		}
		System.out.println("Sum of Even numbers : "+ sum );
		
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i]%2!=0) {
				System.out.println("Odd num : "+ x[i]);
				 sum1 =sum1+x[i];
			}
		}
		System.out.println("Sum of Odd numbers : "+ sum1 );
		
		
	}
}
