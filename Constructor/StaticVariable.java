package Constructor;

public class StaticVariable {


	static int x=10;
	       int y =10;   // Instance variable ...
	void increment() {
		x++;
		y++;
		
	}
	
	
	
	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable();
		
		obj.increment();
		obj.increment();
		System.out.println("X is "+ x );
		System.out.println(obj.y);
		
		StaticVariable obj1 = new StaticVariable();
		obj1.increment();
		System.out.println("X is "+ x);
		System.out.println(obj1.y);
		

	}

}

	
	

