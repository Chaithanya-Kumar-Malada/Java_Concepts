package OOPs;

public class PrivateModifierBySetter {
	private	int id ;
	private	String name;            // Private modifier 
	private	double salary;
	
	   // Using Setter and getter method to access private variables within the package.
	
	
	public void setId(int id) {       // setter 
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

	public int getId() {             // Getter
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}

	void display() {  System.out.println(id+" "+ name+ " "+ salary); }
	
	
	
	public static void main(String[] args) {
		
		PrivateModifierBySetter ob = new PrivateModifierBySetter();
		
		ob.display();

		
		
		
	}
}
