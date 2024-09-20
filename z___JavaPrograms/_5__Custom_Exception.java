package z___JavaPrograms;

public class _5__Custom_Exception {
	
	 int age ;
	
	public  void ageLimit(int age) {
		this.age =age;
		
	
			if(age >=18) {
				System.out.println("Eligible for Voting .");
			}else {
				throw new ArithmeticException(age+" Age is not Eligible for Voting");
	        }	
	}
	

	public static void main(String[] args) {

		_5__Custom_Exception obj = new _5__Custom_Exception();
		
		obj.ageLimit(17);
		
			

			
		
		
	}
}
