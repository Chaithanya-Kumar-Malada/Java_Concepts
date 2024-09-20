package AbstractionUsing_Interface;


//To access interface class it must be Inherited from another Class by using "implements" keyword.

public class Subtraction implements Addition {

	public void add1(int a,int b) {       // Converting interface method(NoBody) to Normal method(Body)          
		System.out.println(a+b);
	}

	public void add2(int x,int y) {       // Converting abstract method to Normal method
		System.out.println(x+y);
	}
	
	
	public static void main(String args[]) {
		
		Subtraction obj = new Subtraction();
		
		obj.add1(10, 5);
		obj.add2(20, 30);
		
		
		
	}
}
