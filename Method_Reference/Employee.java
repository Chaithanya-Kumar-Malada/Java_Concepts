package Method_Reference;

import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Employee {

	
	int id;
	String name ;
	double salary;
	
	
	
	public Employee(int id, String name, double salary) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
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
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public static void main(String args[]) {
		
		
		
		List<Employee> l1 = Arrays.asList(
				new Employee(1,"surya",1000),
				new Employee(2,"arya",3000),
				new Employee(3,"surya",500),
				new Employee(6,"surya",80),
				new Employee(4,"ayrus",5000),
				new Employee(5,"sumo",90000)  );
	
		
				//  Min salary
		l1.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(1).forEach(System.out::println); 
		// second min salary
		l1.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).limit(1).forEach(i->System.out.println(i)) ; 
		 	
		// Highest salary
		
		
		
	Optional<Employee> LowestSalary = l1.stream().collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))) ;
	Optional<Employee> Highestsalary = l1.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))) ;
		
	Optional<Employee> MinId = l1.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getId) ));
	Optional<Employee> MaxId = l1.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getId) ));
		
	System.out.println("LowestSalary : "+ LowestSalary);
	System.out.println("HighestSalary : "+ Highestsalary);
	
	System.out.println("Min Emp Id :  : "+ MinId);
	System.out.println("Max Emp Id :  : "+ MaxId);
		
	List<Employee> l2 = l1;
	
	System.out.println("List 2 : " + l2);
	
	Optional<Employee> emp = l2.stream().sorted(Comparator.comparing(Employee::getId)).findFirst() ;
	
	
	System.out.println("First employee : "+emp);
	
	
	}
	
	
}
