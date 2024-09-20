package Multi_Threading;



	
	 class Thread1 extends Thread{
		
		public void run() {
			
			for(int i=1;i<=10;i++) {
				
				try {
					Thread.sleep(1000);
					System.out.println(i);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
			
			System.out.println("Thread1 Output");
		}
		
	}
	
	 class Thread2 extends Thread{
		
		public void run() {
			for(int i=11;i<=20;i++) {
				
				try {
				Thread.sleep(1000);
				System.out.println(i);
				}catch(Exception e) {
					
				}
			}
			
			System.out.println("Thread2 Output");
			
		}
		
	}
	
	
	
	 public class Extending_Thread {
	
	public synchronized static void main(String[] args) {
		
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();
		
	
	

}

}