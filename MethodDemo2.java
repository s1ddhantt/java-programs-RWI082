package multithreading;

class Dance extends Thread{
	public void run() {
		System.out.println("Ye wala nachega...");
		System.out.println(Thread.currentThread().getName());
		System.out.println(isAlive());
	}
}

class Sing extends Thread{
	public void run() {
		System.out.println("Ye waala gaega...");
		System.out.println(Thread.currentThread().getName());
		System.out.println(isAlive());
	}
	
}

public class MethodDemo2 {

	public static void main(String[] args) {
		Dance th1 = new Dance();
		th1.setName("Naachne wala thread");
		Sing th2 = new Sing();
		th2.setName("Gaane waala Thread");
		
		th1.start();
		
		th2.start();
		

	}

}
