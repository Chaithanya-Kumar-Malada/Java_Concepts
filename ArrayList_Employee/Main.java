package ArrayList_Employee;

import java.util.*;

public class Main {

	public static void main(String[] args) {


		ArrayList<Employee> List1 = new ArrayList<Employee>();
		
		
		Employee e1 = new Employee(1,"Surya",10000);
		Employee e2 = new Employee(2,"Chai",20000);
		Employee e3 = new Employee(3,"Kumar",30000);
		Employee e4 = new Employee(4,"Lav",60000);
		
		List1.add(e1);
		List1.add(e2);
		List1.add(e3);
		List1.add(e4);
		
		
		System.out.println(List1);  
		
//		for(int i=0; i<List1.size();i++) {             // Normal for Loop
//			System.out.println(List1.get(i)); }
		
		for(int i=List1.size()-1;i>=0;i--) {        // Reverse the OutPut
			System.out.println(List1.get(i));
		}
		
//		for(Employee i:List1) {
//			System.out.println(i);       // Getting output in order Using Enhanced For Loop Or For Each Loop
//		}
		
		
		for(Employee i : List1) {
			
			if(i.getSalary()>=30000) {            // Using get method getSalary();  
				System.out.println(i.name);        //Salary >= 30k  ... getName();
			}
			
			if(i.salary>=40000) {
				System.out.println(i.empid + " ___ "+ i.getEmpid());                    
			}
			
		}
		
		
		
		System.out.println("___________________________________________________________________");
		
		
		// Another way of Adding elements to List using " Arrays.asList();  "
		
		
		
		List<Employee> List2 = new ArrayList<>( 
											Arrays.asList(new Employee (1, "Neveen", 15000),
											 new Employee (2, "Manju", 25000) ,
											 new Employee (3,"Ranjit", 35000) ) ) ;
		
		List2.add(new Employee (4, "Surya", 55000));  		//    error(Abstract list) 
		
		// To get Output we have to add " new ArrayList<> (Arrays.asList());"
		
		
	   System.out.println(List2);
		
	   
	   for(Employee i : List2) {
		   
		   System.out.println(i);
		   
		   if(i.getSalary()>=36000) {
			   
			   System.out.println( i.getEmpid()+ i.name);
		   }
		   
	   }
	   
	   
	   
	   
	   
	   ///////////////////////////////////////////////////////////////////
		
	}
}
