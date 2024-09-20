package Abstraction;


// To access abstract class it must be Inherited from another Class.

public class Subtraction extends Addition {

	public void add1(int a,int b) {        // Converting abstract method(NoBody) to Normal method (Body)
		System.out.println(a+b);              
	}
	public void display(String name) {        // Converting abstract method to Normal method
		System.out.println(name);
	}
	
	void sub(double A,double B) {        // Normal method in a Subtraction Class
		System.out.println(A-B);    
	}
	
	public static void main(String[] args) {
		
		
//	Subtraction obj = new Subtraction();
//		
//		obj.add1(5, 10);
//		obj.display("suryaaaa");
//		obj.add2(10, 15);
//		obj.sub(10, 5);
//		
		
	}
}
