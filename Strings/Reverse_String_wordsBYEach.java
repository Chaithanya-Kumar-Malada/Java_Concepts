package Strings;

public class Reverse_String_wordsBYEach {

	public static void main(String[] args) {
		
		String name ="this is my java program";
		
		String arr[] = name.split(" ");
		
										//System.out.println(arr.length);  length = 5;
		String revString = "";
		
														// Looping through each word in the array.
     for (int i = 0; i < arr.length; i++) {
         String word = arr[i];
         												// System.out.println(word.length()+word);
         String reverseWord = "";
         
         												// Reverse each word character by character.
         for (int j = word.length() - 1; j >= 0; j--) {
             reverseWord = reverseWord + word.charAt(j);
         }
         
         revString = revString + reverseWord + " ";
     }
     
     											// Display the string with reversed words.
     
         System.out.println("Given   String:  "+ name);
	     System.out.println("Reverse String:  "+ revString);
		
	     
	     						// OR 
	     
		
		
//System.out.println("output : "+ arr[3]+arr[2]+arr[1]+arr[0] +" "+ arr[6]+arr[5]+" "+arr[9]+arr[8]+" "+arr[14]+arr[13]+arr[12]+arr[11]+" "+arr[22]+arr[21]+arr[20]+arr[19]+arr[18]+arr[17]+arr[16]+arr[15]);
		

	}
}
