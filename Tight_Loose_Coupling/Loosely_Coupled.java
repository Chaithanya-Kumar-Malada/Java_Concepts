package Tight_Loose_Coupling;


// Loosely Coupled Example 


 class Customer{
	
	int id;
	String name;
	Address address;
	
	public Customer(int id,String name,Address address) {
	
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
}

class Address{
	
	
	
	int DoorNo;
	String streeName;
	String city;

	
	public Address(int doorNo, String streeName, String city) {
		
		DoorNo = doorNo;
		this.streeName = streeName;
		this.city = city;
	}




	@Override
	public String toString() {
		return "["+DoorNo + streeName  + city+ "]" ;
	}
	
	
}





public class Loosely_Coupled {

	

	public static void main(String[] args) {
		
		Address a1 = new Address(8,"nagar","tada");
		
		
		Customer obj = new Customer(10,"surya",a1);
		
		
		System.out.println(obj.id+obj.name+obj.address);
		
		
		
	}

}




//
//tightly coupled example:
//
//class Customer{
//	int c_id;
//	String name;
//	Address address;
//	public Customer(){
//		c_id=101;
//		name="ram";
//		address=new Address(23,"balaji street","chennai");
//	}
//
//
//
//}
//
//class Address{
//	int doorno;
//	String street;
//	String city;
//	......
//}



