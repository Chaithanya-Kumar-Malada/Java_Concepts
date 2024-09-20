package Hierarchicalinheritance;

public class Main {

	public static void main(String[] args) {
	
		Goat obj = new Goat();
		
		obj.name="Chai";
		obj.Eat();
		obj.Sleep();
		obj.Noise();
		
		Dog ob = new Dog();
		
		ob.name="cha";
		ob.Bark();
		
		Cat objs = new Cat();
		objs.name="ch";
		objs.Sound();
		
// More than one Sub class is inherited from single parent class is called "Hierarchical"
		// In this One parent and many Child classes.... 
	}

	

}
