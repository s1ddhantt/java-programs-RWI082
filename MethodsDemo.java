package multithreading;

public class MethodsDemo extends Thread {
    public static void main (String args[]) {
    	System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Siddhant ka thread");
        System.out.println(Thread.currentThread().getName());
    }
}
