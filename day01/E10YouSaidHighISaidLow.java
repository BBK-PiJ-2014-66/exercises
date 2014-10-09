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
	public static int promptForInt(String prompt) {
		System.out.print(prompt);
		String str = System.console().readLine();
		// no error check on type conversion
		int thisint = Integer.parseInt(str);
		return thisint;
	}

	public static void main(String[] args) {
		boolean lAscending = true;
		boolean lDesending = true;
		int numread = 0;
		int previousnum = -1;
		while (true) { // infinite loop
			int thisnum = promptForInt("Please enter a positive integer -1 to finish: ");
			if (thisnum == -1)
				break;
			numread++;
			if (numread == 1) { // ignore first number
			} else if (numread < 1) {
				System.out.println("Error you entered a non-positive integer");
				return;
			} else {
				if (thisnum != previousnum + 1)
					lAscending = false;
				if (thisnum != previousnum - 1)
					lDesending = false;
			}
			previousnum = thisnum;
		}
		if ((numread > 1) && (lAscending || lDesending)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
