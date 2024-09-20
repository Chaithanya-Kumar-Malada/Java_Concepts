package CompileTimePolymorphism;

// Compile Time Polymorphism is also known as " Method OverLoading "


public class Adder {

   void add(int a,int b) {           // Methods with same Names 
		System.out.println(a+b);      // Different Parameters
	}
	
	void add(double a, double b) {
		System.out.println(a+b);
	}
	
	void add(int a,int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		Adder obj = new Adder();
		
		obj.add(2,2);
		obj.add(5.2, 5.3);
		obj.add(10,5,10);
		
		

	}
}
