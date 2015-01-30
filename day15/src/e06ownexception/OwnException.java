package e06ownexception;

import java.util.Scanner;

/**
 * 
 * PiJ day 15 Exception handling
 * 
 * Exercise 6 Your first exceptions
 * 
 * Create two exceptions, one checked exception and one runtime exception. Then
 * create a simple class that will throw each of them in two different
 * situations, according to user input:
 * 
 * 1. inside a try block.
 * 
 * 2. outside a try block.
 * 
 * Note: Two exceptions times two situations means four different inputs from
 * users. Create the new exceptions with four different messages (using the
 * appropriate constructor), e.g. ”I am a checked exception and I have been
 * thown out of a try block”. Assuming you do all of the above inside the
 * launch() method of your class, did you have to make any changes to the
 * method’s declaration
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 26 Jan 2015
 * 
 */
public class OwnException {

	class MyCheckedException extends Exception {
		/**
		 * 
		 */
		public MyCheckedException() {
		}

		public MyCheckedException(String arg0) {
			super(arg0);
		}
	}

	class MyRtException extends RuntimeException {
		public MyRtException() {
		}

		public MyRtException(String arg0) {
			super(arg0);
		}
	}

	/**
	 * main method has to catch or throw MyCheckedException because of launch
	 * 
	 * @param args
	 * @throws MyCheckedException
	 */
	public static void main(String[] args) throws MyCheckedException {
		OwnException oe = new OwnException();
		oe.launch();
	}

	/**
	 * trying out throwing own exceptions
	 * 
	 * @throws MyCheckedException
	 *             essential because of option 3
	 */
	public void launch() throws MyCheckedException {
		boolean finished = false;

		// normally use system.console().readline but Scanner works better in
		// eclipse
		Scanner input = new Scanner(System.in);

		while (!finished) {
			System.out.println("Will throw an exception of your choice:");
			System.out.println("1\tfor checked exception thrown in try block");
			System.out.println("2\tfor runtime exception thrown in try block");
			System.out
					.println("3\tfor checked exception thrown outside try block");
			System.out
					.println("4\tfor runtime exception thrown outside try block");
			System.out.println("0\tto exit");
			System.out.print("Enter choice: ");
			int choice = input.nextInt();
			if (choice == 0) {
				finished = true;
			} else if (choice == 1) {
				try {
					throw new MyCheckedException(
							"I am a checked exception and I have been thrown out of a try block");
				} catch (MyCheckedException ex) {
					System.out.println("Caught MyCheckedException msg '"
							+ ex.getMessage() + "'");
				}
			} else if (choice == 2) {
				try {
					throw new MyRtException(
							"I am a run time exception and I have been thrown out of a try block");
				} catch (MyRtException ex) {
					System.out.println("Caught MyRtException msg '"
							+ ex.getMessage() + "'");
				}
			} else if (choice == 3) {
				throw new MyCheckedException(
						"I am a checked exception and I have been thrown outside of any try block");
			} else if (choice == 4) {
				throw new MyRtException(
						"I am a run time exception and I have been thrown outside of any try block");
			}

		}
		input.close(); // close scanners when finished
						// http://web.eecs.utk.edu/~bvz/cs365/examples/datacheck.html
		System.out.println("normal termination");
	}
}
