package ArrayList_Employee;

public class Employee {

	
	int empid;
	String name;
	double salary;
	
	public Employee(int empid, String name, double salary) {    // Constructor......
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void setEmpid(int empid) {          // Setter Method
		this.empid =empid;
	}
	public int getEmpid() {                    // Getter method
		
		return empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	
	@Override
	public String toString() {
		return "Data : [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	
	
}
