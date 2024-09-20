package C_RunTimePolymorphism;

//Run Time Polymorphism is also known as " Method Overriding "

// The Sub Class has the Same method as Declared in Parent Class it is known as " Method Overriding "

public class Main {

	
	public static void main(String[] args) {
	
	
		Square obj = new Square();
		
		obj.draw();
	
		
		
		// Only call its own method due to " Method Overriding "
		
// Here Circle class draw() method is override by Square class draw() method.
		
		
	}
}
