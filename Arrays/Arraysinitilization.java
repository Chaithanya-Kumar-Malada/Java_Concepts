package Arrays;

public class Arraysinitilization {

	public static void main(String[] args) {
		
		
		int x[] = {10,20,30,40,50};
		
		System.out.println("Length of an Array: "+ x.length);
		
		for(int i:x) {
			System.out.println(i);
		}
		
		for(int i=0;i<x.length;i++) {
			System.out.println("array:"+ x[i]);
		}
		
	}

}
