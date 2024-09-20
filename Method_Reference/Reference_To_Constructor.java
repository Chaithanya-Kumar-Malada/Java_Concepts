package Method_Reference;

 interface main{
	 
//	 public static int x = 10;
//	 int b =10;
	 
	Say saySomething(String msg); 
	
	 
 }
 
 class Say{
 
 Say(String msg) {
	 System.out.println(msg);
 }
 
 }
 
public abstract class Reference_To_Constructor implements main{
	
	public static void main(String[] args) {
		
		
		main obj = Say::new;
		
		obj.saySomething("this is Reference_To_Constructor.....");
		
		
	}

}
