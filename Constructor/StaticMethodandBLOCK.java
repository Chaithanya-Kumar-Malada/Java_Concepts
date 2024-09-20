package Constructor;

public class StaticMethodandBLOCK {

	static void display(int x , int y) {
		System.out.println(x+y);          // Static method
	}
	
	static {
		System.out.println("This is Static Block......");
	}
	
	public static void main(String[] args) {
		display(2,3);
		StaticMethodandBLOCK.display(2, 5);

	}

}
