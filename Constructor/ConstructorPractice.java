package Constructor;

public class ConstructorPractice {

	int balance;
	
	

	public	ConstructorPractice(int amount){
		     balance = amount;         			 //   Constructor
	}
	
	void deposit(int amount) {
		balance = balance + amount;
		System.out.println(amount +" deposited and current balance is :" + balance );
	}
	
	void withdraw(int amount) {
		balance = balance - amount;
		System.out.println(amount +" withdrawn and current balance is :" + balance );
	}
	void displaybalance() {
		System.out.println(" The total balance is : "+balance);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorPractice obj = new ConstructorPractice(500);
		
		obj.displaybalance();
		obj.deposit(500);
		obj.withdraw(250);
		
		obj.displaybalance();
		
		
	}

}
