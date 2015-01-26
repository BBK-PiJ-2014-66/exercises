package e03ErrorHandlingUserInput;
/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 3 Error handling on user input
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 26 Jan 2015
 */
public class ErrorHandlingUser {

	public static void main(String[] args) {
		ErrorHandlingUser eh = new ErrorHandlingUser();
		eh.launch();
	}

	public void launch() {
		// prompt for ten integers
		int nAsk = promptForInt("How many numbers do you want to enter?> ");
		int total = 0;
		for (int ia = 0; ia < nAsk; ia++) {
			int myNum = promptForInt("Enter an integer> ");
			total += myNum;
		}
		double average = (double) total / ((double) nAsk);
		System.out.println("the average is " + average);
	}

	/**
	 * prompts user for an integer
	 * 
	 * @return
	 */
	private int promptForInt(String prompt) {
		while (true) {
			try {
				System.out.print(prompt);
				String inString = System.console().readLine();
				int result = Integer.parseInt(inString);
				return result;
			} catch (NumberFormatException ex) {
				System.out.println("ERROR did not understand that! try again");
			}
		}
	}
}
