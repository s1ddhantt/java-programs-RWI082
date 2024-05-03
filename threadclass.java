package multithreading;

//creation of thread by extending thread class

public class threadclass extends Thread {
	public void run() {
		System.out.print("Thread is running");
	}
	
    public static void main(String args[])
    {
    	threadclass t1 = new threadclass();
    	t1.start();
    	
    }
}

