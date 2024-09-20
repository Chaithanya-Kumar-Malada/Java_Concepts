package Arrays;

public class AverageOFArray {

	public static void main(String[] args) {
		float x[] = {1,2,3,4,5};
		float sum = 0;
		float avg =0;
		
		for(int i=0;i<x.length;i++) {
			
			sum = sum + x[i];
			
			avg = sum/2;
		}
		System.out.println("Avegare of array elements : "+ avg);
	}

}
