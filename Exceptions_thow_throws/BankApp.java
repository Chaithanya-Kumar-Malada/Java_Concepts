package Exceptions_thow_throws;

public class BankApp {
	
	int balance;
	
	public BankApp(int balance) {          //  Constructor 
		this.balance = balance;
	}

    void withdraw(int Wamount) throws BalanceLow {
    	System.out.println("Withdrawn amout is :"+ Wamount);
    	
    	if(Wamount>balance) {
    		
    		throw new BalanceLow("The withdrawn amount " +Wamount+ " is greater than current balance $"+balance);
    		
    	}else {
    		
    		balance = balance-Wamount;
    	}
    	
    	
    			
    }

    void display() {
    	System.out.println("The balance amount is :"+ balance);
    }




	public static void main(String[] args)  {
		
		
		BankApp obj = new BankApp(1000);
		
		obj.display();
		
		//obj.withdraw(2000);             mentioning " throws BalanceLow" in main() method.
		
											 	//          (OR)
		try {
		obj.withdraw(1001);                    //   Using Try and Catch for Withdraw
		}catch(Exception e) {
			System.out.println(e);
		}
		
		obj.display();
		
		
	}
}
