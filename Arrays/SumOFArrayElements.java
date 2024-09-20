package Arrays;

public class SumOFArrayElements {

	public static void main(String[] args) {
		
		int x[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			sum = sum + x[i];
		}
		System.out.println("Sum of array elements : "+ sum);
		
	}

}
