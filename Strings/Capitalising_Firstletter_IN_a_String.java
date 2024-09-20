package Strings;

public class Capitalising_Firstletter_IN_a_String {

	public static void main(String[] args) {
		
		
		 String myinput = "this is my java program";

	     char[] arr = myinput.toCharArray();
	     
	     System.out.println(arr.length);
	     
//	     for(char i:arr) {
//	    	 System.out.print(i);
//	     }
//     
	     
	     for(int i=0;i<arr.length;i++) {
	    	 
	    	 
	    	 										// capitalizing first letter of first word
	    	 arr[0] = Character.toUpperCase(arr[0]);
	    	 
	    	 if(arr[i]== ' ') {
	    		 
	    		 arr[i+1] = Character.toUpperCase(arr[i+1]);
	    	 }
	    	 
	     }
	     								// converting the character array to the string
	     System.out.println(arr);
	     
	     //  myinput = String.valueOf(arr);
	    // System.out.println("After capitalizing the first letter: " +  myinput);
		
	}
}
