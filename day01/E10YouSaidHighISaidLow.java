/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 10 You said high, I said low. . .
 * task set:
 * Modify your former program so that it outputs "Yes" when the numbers are
 * consecutive, regardless of whether they go up or down. For example, both
 * "2,3,4,5,6,-1" and "10,9,8,7,-1" should now result in "Yes".
 *
 * Not allowed methods and everything must be in main.
 * 
 *  @author Oliver S. Smart
 */

public class E10YouSaidHighISaidLow {
	public static void main(String[] args) {
		boolean lAscending = true;
		boolean lDesending = true;
		int countSuccessfulRead = 0;
		int numPrevious = -1;
		while (true) { // infinite loop
			System.out.print("Please a positive integer number: ");
			String strRead = System.console().readLine();
			if (strRead.length() == 0)
				break; // (d) Enter is taken as alternative to -1 to terminate
						// input
			// avoid exception if non-integer is entered
			// see
			// http://stackoverflow.com/questions/5439529/determine-if-a-string-is-an-integer-in-java
			int numRead;
			try {
				numRead = Integer.parseInt(strRead);
			} catch (NumberFormatException e) {
				System.out.println("ERROR that is not an integer. Try again!");
				continue;
			}
			if (numRead == -1)
				break;
			// got number input, is it positive?
			if (numRead < 1) {
				System.out.println("ERROR that is not a +ve integer. Try again!");
				continue;
			}
                        // finally got a number to be taken seriously
                        countSuccessfulRead++;
			if (countSuccessfulRead != 1) { // ignore first number
				if (numRead != numPrevious + 1)
					lAscending = false;
				if (numRead != numPrevious - 1)
					lDesending = false;
			}
			numPrevious = numRead;
		}
                // Simple output as per spec. Need at least one number read and for it be 
                // ascending or descending
		if ((countSuccessfulRead > 1) && (lAscending || lDesending)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
