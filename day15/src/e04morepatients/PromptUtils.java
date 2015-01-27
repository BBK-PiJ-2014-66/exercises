package e04morepatients;

import java.io.IOError;

public class PromptUtils {
	/**
	 * prompts for an integer
	 * 
	 * @param prompt
	 *            the prompt string
	 * @return the integer entered or null if EOF is entered
	 */
	public static Integer promptForInt(String prompt) {
		while (true) {
			System.out.print(prompt);
			String inString=null;
			try {
				inString = System.console().readLine();
			} catch (IOError ex) {
				System.out.println("ERROR there was an IOError " + " try again");
				continue;
			}
			if (inString == null) 
				return null; // EOF
			try {
				return Integer.parseInt(inString);
			} catch (NumberFormatException ex) {
				System.out.println("ERROR did not understand that! try again");
				continue;
			}
		}
	}

	public static String promptForString(String prompt) {
		while (true) {
			System.out.print(prompt);
			try {
				String inString = System.console().readLine();
				return inString;
			} catch (IOError ex) {
				System.out.println("ERROR there was an IOError " + " try again");
			}
		}
	}

}
