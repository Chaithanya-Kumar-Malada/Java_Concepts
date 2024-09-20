package Abstraction;

// Abstraction by using Abstract Class.


 public abstract class Addition {               // Abstract Class

	public abstract void add1(int a, int b);     // Abstract Method (does not have a body)
	
	public abstract void display(String name);      // Abstract Method (does not have a body)
	
	void add2(int x, int y) {                    // Normal method
		System.out.println(x+y);             
	
	
	}
}
