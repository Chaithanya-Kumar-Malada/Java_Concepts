package AbstractionUsing_MultipleInterfaces;

public class Main implements Dog, Cat, Goat {

	
	public void mee() {
		
		System.out.println("Goat says mee mee ");
	}

	@Override
	public void meow() {
	
		System.out.println("Cat says meow meow...... ");
	}

	@Override
	public void bow() {
		System.out.println("Dog says bow bow ___________ ");
	}

	public static void main(String[] args) {
		
		Main obj = new Main();
		
		obj.bow();
		obj.meow();
		obj.mee();
		
		

	}

}
