/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 9 Going up!
 * task set:
 * Read an arbitrarily long sequence of positive numbers from the user, until -1
 * is entered. At that point, print "Yes" if the numbers were consecutive and
 * increasing and "No” otherwise. Sequences "1,2,3,4,-1" and "5,6,7,8,9,1,0,11,-1"
 * should output "Yes", but "2,3,5,6,7,-1", "10,9,8,7,-1", and "1,1,2,3,4,5,-1"
 * should output "No"
 *
 * Not allowed methods and everything must be in main.
 * 
 *  @author Oliver S. Smart
 */
public class E09GoingUp {
	public static void main(String[] args) {
		boolean lAscending = true;
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
			}
			numPrevious = numRead;
		}
                // Simple output as per spec. Need at least one number read and for it be 
                // ascending or descending
		if ((countSuccessfulRead > 1) && lAscending ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
