package e03ErrorHandlingUserInput;

public class ErrorHandlingUser {

	public static void main(String[] args) {
		ErrorHandlingUser eh = new ErrorHandlingUser();
		eh.launch();
	}

	public void launch() {
		// prompt for ten integers
		int nAsk = 10; // number of integers to ask
		int total=0;
		for (int ia = 0; ia < nAsk; ia++) {
			int myNum = promptForInt("Enter an integer> ");
			total += myNum;
		}
		double average = (double) total/((double) nAsk);
		System.out.println("the average is " + average);
	}

	/**
	 * prompts user for an integer
	 * 
	 * @return
	 */
	private int promptForInt(String prompt) {
		System.out.print(prompt);
		String inString = System.console().readLine();
		int result = Integer.parseInt(inString);
		return result;
	}

}
