package multithreading;

public class MethodDaemonDemo extends Thread {
	public void run() {
		System.out.println("this is Daemon thread");
	}

	public static void main(String[] args) {
		System.out.println("This is Main Thread");
		MethodDaemonDemo th = new MethodDaemonDemo();
		th.setDaemon(true);
		th.start();
		//th.setDaemon(true); we cant set daemon to a thread after starting it
		System.out.println(th.isDaemon());

	}

}
