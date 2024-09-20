package Method_Reference;

interface msg{
	void say();
}

public class Reference_To_An_InstanceMethod {

	void saySomething() {
		System.out.println("Hello this is a Instance Method");
	}
	
	public static void main(String[] args) {
		
		
		
		Reference_To_An_InstanceMethod obj = new Reference_To_An_InstanceMethod();
		
		msg obj1 = obj::saySomething;   // containingObject::instanceMethodName  
		
		   								// Calling interface method  
		obj1.say();
		
		
		
		
	}

}
