package z___JavaPrograms;

import java.util.*;

class Animal{
	String name ;
	
	public Animal(String name) {
		this.name=name;
	}
	
		void sound() {
			System.out.println(name + "is making sounds");
		}
		void bark() {
			System.out.println("barkingggggg");
		}
		
}


public class Rivising_the_Concepts extends Animal{
	
	void sound() {
		System.out.println( "child is making sounds");
		
		super.bark();
		
	}
	


	// TODO Auto-generated method stub
	



	Rivising_the_Concepts(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {

		
	Animal obj = new Rivising_the_Concepts("Surya");
	
	obj.sound();
		
	//obj.bark();
	
		
	}

}
