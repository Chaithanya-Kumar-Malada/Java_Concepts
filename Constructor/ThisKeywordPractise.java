package Constructor;

public class ThisKeywordPractise {

	int x,y,z;
	
	public ThisKeywordPractise(int x) {
		
		this.x=x;
	};
	
	
	public ThisKeywordPractise(int x, int y, int z) {
		
		this(x);
		this.y = y;
		this.z = z;
	}




	void display(){
		System.out.println("Value of X :"+ x);
		System.out.println("Value of x,y,z :"+ x+ " "+y+" "+z );
		this.another();      // Calling a method in another method using this keyword   
		}
	
	void another() {
		System.out.println("this is another method");
	}
	
	public static void main(String[] args) {
		
		
		ThisKeywordPractise obj = new ThisKeywordPractise(3);
		
		ThisKeywordPractise obj1 = new ThisKeywordPractise(2,3,4);
		
		obj.display();
		obj1.display();
		//obj.another();

	}

}
