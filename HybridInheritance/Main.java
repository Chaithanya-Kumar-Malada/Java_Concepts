package HybridInheritance;

public class Main {

	public static void main(String[] args) {
		
	//  Son is a MultiLevel Inheritance.	
		
		Son obj = new Son();
		
		obj.name="Surya";
		
		obj.GF();
		obj.F();
		obj.son();
		
		
//To call Daughter class and method need to create another object  for Daughter.
		
		//Father, Daughter is s Hierarchical Inheritance.
		
		
		Daughter ob = new Daughter();
		
		ob.name = "SIRI";
		ob.dau();

		
		
		
		
		
		
		
		
		
	}

}
