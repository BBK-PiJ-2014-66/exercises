package e02counter;
/**
 * PiJ day 17 Concurrent Programming
 * 
 * Exercise 2 Counters
 * 
 * @author PiJ exercise sheet
 *
 */
public class Counter {
	private int n = 0;

	public void increase() {
		n++;
	}
	
	public int getCount() {
		return n;
	}

}
