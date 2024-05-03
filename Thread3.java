package multithreading;

//performing single tasks from multiple thread

 class Thread5 extends Thread {
	public void run() {
		System.out.println("Thread of thread 5 class is running");
	}
     
}

 

public class Thread3{
	public static void main(String[] args) {
		Thread5  th4 = new Thread5();
		Thread5  th5 = new Thread5();
		th4.start();
		th5.start();
	}
}