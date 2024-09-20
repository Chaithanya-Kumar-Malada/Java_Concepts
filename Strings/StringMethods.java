package Strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String name = "Surya";
		String Lastname = "Chaithanya";
		
		System.out.println(name);     				 // Output : Surya
		System.out.println(name.length()); 			// Output  : 5
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase()); 
		System.out.println(name+Lastname);           // Concatenation 
		System.out.println(name.concat(Lastname));   // Concatenation 
		System.out.println(name.indexOf('r'));       // IndexOf
		System.out.println(name.charAt(0));         // To find Index value 
		System.out.println(name.equals(Lastname));   // checks Palindrome or not ?
		
	}

}
