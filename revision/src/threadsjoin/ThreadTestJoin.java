package threadsjoin;

/**
 * Simple test where two threads are started but do not "join" them so main will
 * finish before the threads - I predict they will die? They do not but main
 * finishes earlier than one or two
 *
 */
public class ThreadTestJoin {

	public static void main(String[] args) {
		Thread one = new Thread(new SimpleThread("one"));
		Thread two = new Thread(new SimpleThread("two"));
		one.start();
		two.start();
		System.out.println("end of main");
	}

}
