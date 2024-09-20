package Multi_Threading;


// Using Runnable interface within package the Classes name should not be the same!
//  Classes names should be different.


class Thread3 implements Runnable{
	
	public void run() {
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(2000);
				System.out.println(i);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("Thread1 Output ");
	}
}

class Thread4 implements Runnable{
	
	public void run() {
		System.out.println("Thread2 Output ");
	}
}



public class Implementing_Runnable_Interface {

	public static void main(String[] args) {
		
		Thread3 obj1 = new Thread3();
		Thread4 obj2 = new Thread4();
											// There is no Start() method in Runnable interface
		
//	 To Use start() method we have to create Thread Object and 
// 	 we have to pass the class Object name in Thread Constructor() to access start() method.
		
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start();
		
		
		

	}
}
