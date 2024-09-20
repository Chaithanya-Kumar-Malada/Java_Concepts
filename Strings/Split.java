package Strings;

public class Split {

	public static void main(String[] args) {
	
		String name = "I am chaithanya kumar";
		
		String arr[] = name.split("");
		
		System.out.println("out: "+ arr[3]);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		// Reverse the array
		
		System.out.println("reverse output :");

		for(int i=arr.length-1;i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
		
		

	}

}
