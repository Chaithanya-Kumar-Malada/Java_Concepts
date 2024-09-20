package AbstractionUsing_Default_Static_method_Interfaces;

public interface Phone {

	void cell();
	
	default void msg() {
		
		System.out.println("Phone msg....");
	}
	
	
	static void bluetooth() {
		
		System.out.println("Phone bluethoot.....");
	}
	
	
	
	
	
}
