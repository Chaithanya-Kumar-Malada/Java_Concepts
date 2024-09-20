package OOPs;

public class PublicModifier {

   public int id ;
   public String name;            // Public modifier 
   public double salary;
	
 public	void display() {
		
		System.out.println(id+" "+ name+ " "+ salary);
		
	}

	public static void main(String[] args) {
		
		PublicModifier ob = new PublicModifier();
		
		System.out.println("Public Modifier Within Class :" +ob.id+ob.name+ob.salary );
		
		
	}

}

