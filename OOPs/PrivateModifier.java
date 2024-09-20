package OOPs;

public class PrivateModifier {
	private	int id ;
	private	String name;            // Private modifier 
	private	double salary;
	
	// To initialize and access Private variables in another Class/within package we use Constructor here 
	
	public PrivateModifier(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	

	
	void display() {  System.out.println(id+" "+ name+ " "+ salary); }

	
	public static void main(String[] args) {
		
		PrivateModifier ob =new PrivateModifier(5,"chai",100);
		ob.display();
		//System.out.println("Private Modifier Within Class :" +ob.id+ob.name+ob.salary );

	}

}
