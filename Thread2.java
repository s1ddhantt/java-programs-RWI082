package multithreading;

//Creation of thread by implementing runnable interface

public class Thread2 implements Runnable {
	public void run() {
		System.out.println("Thread is running by implementing Runnable interface");
	}
   
	public static void main (String args[]) {
		Thread2 t1 = new Thread2();
		Thread th = new Thread(t1);
		th.start();
	}
	
	
}
