package Method_Reference;


interface messages{
		 void say();
}

public class Reference_To_StaticMethod {
	
	public static void saySomething() {
		System.out.println("Hello I am a Satic referance");
	}
	

	public static void main(String[] args) {
		 
		messages obj = () -> saySomething();    // Using Lambda Expression
	
		messages obj1 = Reference_To_StaticMethod::saySomething;    // Using Referring static method  
		
		   // Calling interface method  
		
		obj.say();
		obj1.say();
		
		
	}

}
