package Synchronized;

 class App {

	static int balance = 1000;
	
	//  Without Synchronized 
	
	//  OUTPUT :
	//			After withdraw amount 500 balance is: 200
	//			After withdraw amount 300 balance is: 200
	//			Current Balance :  200
	// 			Current Balance :  200  
	
	
	//  ** To get actual Result remove " synchronized " keyword for withdraw() method.
	
	
  static synchronized void withdraw(int wamount) {
		balance = balance - wamount;
		System.out.println("After withdraw amount " + wamount+ " balance is: "+ balance);
		System.out.println("Current Balance :  "+ balance);
	}
}

 class Thread1 extends Thread {
		public void run() {
			App.withdraw(500);	
		}		
}
class Thread2 implements Runnable {
		public void run() {
			App.withdraw(300);	
		}		
}


public class BankApp{
	

	public static void main(String[] args) {
		
		Thread1 obj1 = new Thread1();
		Thread2 obj2 = new Thread2();
		
		Thread t2 = new Thread(obj2);   // Thread By Implementing Runnable Interface to use Start() method
		
		obj1.start();
		t2.start();
		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
	}

}
