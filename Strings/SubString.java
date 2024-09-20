package Strings;

public class SubString {

	public static void main(String[] args) {
	
		String name = "Chaithanya Kumar";
		
		System.out.println(name.substring(0,3));  
		
		System.out.println(name.substring(10,14));

		for(int i=0;i<=name.length();i++) {
			System.out.println(name.substring(0,i));
		}
		
	}

}
