package Multithreading;

public class Deadlock {

	public static void main(String[] args) {
		
		final String resourse1="Salman";
		final String resourse2="Shahrukh";
		
		Thread t1 = new Thread(){
		public void run() {
			synchronized(resourse1) {
				try {
					Thread.sleep(1000);
				}catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Thread1 locks resourse1 ");
				synchronized (resourse2) {
					System.out.println("Thread1 locks resourse2");
				}
			}
			
			}
		};
		Thread t2 = new Thread(){
			
		public void run() {
		 synchronized(resourse2) {
			 try {
				 Thread.sleep(1000);
			 }catch(Exception e){
				 System.out.println(e);
			 }
			 System.out.println("Thread2 locks resourse2");
			 
			 synchronized(resourse1) {
				 System.out.println("Thread2 locks resourse1");
			 }
		 }
		}
	
		};
		
		t1.start();
		t2.start();
		

	}

}
