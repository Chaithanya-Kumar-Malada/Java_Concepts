package Strings;

public class PrintingWord_using_lengthof_It {

	public static void main(String[] args) {
		
		
		
		String name= "super keyword  is used to access the members";
		
		String arr[] = name.split(" ");
											// printing only the words whose length is greater than 3.
		
		System.out.println(" ********* Words length greater than '3' ");
		
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i].length() > 3) {
					System.out.println("-"+arr[i]);
				}
				
			}
		
			
			System.out.println("  ********* Words length greater than '4' ");
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i].length() > 4) {
					System.out.println("-"+arr[i]);
				}
			}
			
		
		System.out.println("  ********* Words length greater than '5' ");
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i].length() > 5) {
					System.out.println("-"+arr[i]);
				}
			}
		
		
		
		
		
	}
}
