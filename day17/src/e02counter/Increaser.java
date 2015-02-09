package e02counter;

/**
 * PiJ day 17 Concurrent Programming
 * 
 * Exercise 2 Counters
 * 
 * @author PiJ exercise sheet
 *
 */
public class Increaser implements Runnable {
	private Counter c;

	public Increaser(Counter c) {
		this.c = c;
	}

	public static void main(String args[]) {
		Counter counter = new Counter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}

	@Override
	public void run() {
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}

}
