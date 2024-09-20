package OOPs;

public class DefaultModifier {
	int id ;
	String name;            // default modifier 
	double salary;
	
 	void display() {
		
		System.out.println(id+" "+ name+ " "+ salary);
		
	}

	public static void main(String[] args) {
		
		DefaultModifier ob = new DefaultModifier();
		
		System.out.println("Default Modifier Within Class :" +ob.id+ob.name+ob.salary );
		
		
	}

}
