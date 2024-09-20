package OOPs;

public class PrivateMainByGetter {

	public static void main(String[] args) {
	
		PrivateModifierBySetter obj = new PrivateModifierBySetter();
		
		obj.setId(8);
		obj.setName("Chai");
		obj.setSalary(500); 
		
		System.out.println(obj.getId()+obj.getName()+obj.getSalary());
		
	}
}
