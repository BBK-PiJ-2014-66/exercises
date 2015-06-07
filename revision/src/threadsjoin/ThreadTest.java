package threadsjoin;

/**
 * Simple test where two threads are started then join
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		Thread one = new Thread(new SimpleThread("one"));
		Thread two = new Thread(new SimpleThread("two"));
		one.start();
		two.start();
		System.out.println("main: started one and two");
		
		try {
			one.join();
		} catch ( InterruptedException ex) {
			System.out.println("Exception in main one one.join(), message: " + ex.getMessage());
		} finally {
			System.out.println("main: one.join finished");
		}
		
		try {
			two.join();
		} catch ( InterruptedException ex) {
			System.out.println("Exception in main two one.join(), message: " + ex.getMessage());
		} finally {
			System.out.println("main: two.join finished");
		}
		
		System.out.println("end of main");
	}

}
