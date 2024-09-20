package Exceptions;

public class ArrayIndexOutofBound {

	public static void main(String[] args) {
	
		
		int arr[]= {10,20,30,40,50};
	
		try {
			System.out.println(arr[5]);
		}catch(Exception e) {                // try and catch
			
			System.out.println(e);          //	ArrayIndexOutOfBoundsException
		}
		
		
		try {
			
			for(int i=0;i<=arr.length;i++) {
				
				int a =arr[i]/2;
				 System.out.println(a);
			}
		}catch(Exception e) {                       // ArrayIndexOutOfBoundsException
			
			System.out.println(e);
		}
		
		
	try {
			
			for(int i=0;i<=arr.length;i++) {
				
				int a =arr[i]/2;
				 System.out.println(a);
			}
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
