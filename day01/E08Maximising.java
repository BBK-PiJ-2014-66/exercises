/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 8 Maximising
 * task set:
 * Write a program that read a (arbitrarily long) sequence of positive numbers.
 * The sequence is ended when the users enters "-1". At that point, the program
 * must output the highest number in the sequence.
 * 
 * Questions/Assumptions (Specification rather loose)
 * (a) is a "number" an integer or a float? 
 *     Assume integer.
 * (b) What should the program do if supplied with a negative number or zero?
 *     Assume it should say "not recognized" and reprompt.
 * (c) What if the user enters something like "fred"?
 *     Assume it should say not recognized and reprompt:
 * (d) What if the user just hits Enter?
 *     Take this as a (better) alternative to -1 to finish.
 * (e) What should happen if user just enters -1?
 *     Write out "ERROR No positive integer entered" and finish.
 *
 * Not allowed methods and everything must be in main.
 * 
 *  @author Oliver S. Smart
 */
public class E08Maximising {
	public static void main(String[] args) {
		int numMax = -10000;
		boolean lFirst = true;
		while (true) { // infinite loop asking for input must break
			System.out.print("Please a positive integer number: ");
                        String strRead = System.console().readLine();
                        if (strRead.length() ==0)
				break; // (d) Enter is taken as alternative to -1 to terminate input
			int numRead = Integer.parseInt(strRead);
			if (numRead == -1) 
				break;
			// got number input, is it positive?
			if (numRead < 1) {
				System.out.println("ERROR that is not a positive integer. Try again");
				continue;
			}
			if ( lFirst || numRead > numMax) 
				numMax = numRead;
			lFirst = false;
		}
		// finished input output results
		if (lFirst)
			 System.out.println("ERROR No positive integer entered");
		else
			 System.out.println("Maximum positive integer entered = " + numMax);
	}
}
