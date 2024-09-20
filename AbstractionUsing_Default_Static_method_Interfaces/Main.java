package AbstractionUsing_Default_Static_method_Interfaces;

public class Main {

	public static void main(String[] args) {


		
		Phone p1 = new Iphone();
		
		p1.cell();
		p1.msg();
		//p1.bluetooth();    // Error
		
	    Phone.bluetooth();       // Static method cannot call by Object ;
		
	    
		
	    Phone p2 = new Android();
	    
	    p2.cell();
		p2.msg();
		
		
		
		
		
		
		
		
		

	}

}
