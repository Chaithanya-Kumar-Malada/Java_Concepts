package OOPs;

public class PrivateMainByConstructor {

	public static void main(String[] args) {
		
		PrivateModifier obj = new PrivateModifier(12,"surya",1500); //using constructor
		
		//obj.id=10;   // Cannot initialize private variables like default,public.
		
		System.out.println("Initialize and accesing private variables within the package using Contructor");
		obj.display();
		
	

	}

}
