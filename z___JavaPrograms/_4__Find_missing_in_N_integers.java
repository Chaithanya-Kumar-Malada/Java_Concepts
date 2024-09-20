package z___JavaPrograms;

public class _4__Find_missing_in_N_integers {

	public static void main(String[] args) {
	
		
		int arr[] = {1,2,3,4,6,7,8,9,10};
		int n =10;
		
		
		// sum of given numbers
		
		int sum = 0;
					for(int i=0;i<arr.length;i++) {
						
						sum = sum + arr[i];           
					}
		
		//System.out.println(sum);
		
		// Expected sum of numbers
		
		int ExpectedSum = n*(n+1)/2;
		
		//System.out.println(ExpectedSum);

		int missingNo = ExpectedSum - sum;
		
		System.out.println("Missing number in given array : "+ missingNo);
		
	}

	

}
