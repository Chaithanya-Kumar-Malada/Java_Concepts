package Exceptions;

public class ArthimaticException__ {

	public static void main(String[] args) {


		int x =10;
		int arr[]= {10,20,30,40,50};
		
		try {
			System.out.println(x/0);       
		}catch (Exception e) {                  //  ArithmeticException
			System.out.println(e);
		}
		
	
		
		try {
			for(int i=0;i<arr.length;i++) {
				int a=arr[i]/0;
				System.out.println(a);
			}
		}catch(Exception e) {                   //   ArithmeticException
			System.out.println(e);
		}finally{
			System.out.println("Try and catch is completed.......");
		}
		
		
		
	}
}
