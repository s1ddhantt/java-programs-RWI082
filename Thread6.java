package multithreading;

//performing multiple task from multiple thread

class video extends Thread{
	public void run() {
		System.out.println("Video is running");
	}
}

class audio extends Thread{
	public void run() {
		System.out.println("Audio is playing");
	}
}

class Timer extends Thread{
	public void run() {
		System.out.println("Timer is calculating");
	}
}
public class Thread6 {
   public static void main(String args[]) {
	   video th1 = new video();
	   audio th2 = new audio();
	   Timer th3 = new Timer();
	   th1.start();
	   th3.start();
	   th2.start();
   }
}
