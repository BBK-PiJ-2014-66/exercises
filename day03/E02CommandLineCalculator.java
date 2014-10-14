/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Command-line calculator (*)
 *
 * task set:
 *
 *	Write a program that reads a text representing a mathematical 
 *	operation (one of the four basic ones) with two operands, and 
 * 	then execute it. For example, if the user enters "3/5" the 
 *	program outputs “0.6”; if the user enters "23 * 4"
 *	the program outputs "92".
 *  @author Oliver S. Smart
 *
 *  Initial thoughts
 *
 * Command line args are easier than prompt and response menus!
 * Task appears to have been made to be tricky by explicily
 * giving 
 * (1st) example "3/5" where a single argument args[0] = "3/5"
 * (2nd) example "23 * 4" would result in 3 arguments 
 *       args[0]="23" arg[1]="*" and args[2]="4"
 *
 * Guess the thing to do is to concat all the args together.
 * into a single string.
 *
 * Use a for loop to go thru that string (meant to be use for this week)
 * character by character. split into 
 * (a) first word
 * (b) the operand char (either + or - or * or /)
 * (c) the second word
 * read the numbers from the words (with no error handling)
 * do the operation
 * 
 */
public class E02CommandLineCalculator {
	public static void main(String[] args) {
		// in Monday night's session Keith Mannock showed an
		// ENUM like way of making the code clearer
		// think it worked like this.
		char OPUNDEF='\t';
		char OPSUM='+';
		char OPMINUS='-';
		char OPTIMES='*';
		char OPDIVIDE='/';
		for (int cc = 0; cc < args.length; cc++) {
			System.out.println("debug args["+cc+"] = \"" + args[cc] + "\"");
		}
		if (args.length==0) {
			System.out.println("Usage you must specify the calculation wanted on the command line");
			System.out.println("for instance:\n");
			System.out.println("\tjava E02CommandLineCalculator 3/5");
			System.out.println("\nor:\n");
			System.out.println("\tjava E02CommandLineCalculator 23 * 4");
			System.out.println("\ntry again");
		}
		else {
			String calculation=""; // cat of all args
			for (int cc = 0; cc < args.length; cc++) 
				calculation +=  args[cc];
			System.out.println("debug calculation="+calculation);
			String word1="", word2="";	
			char operand=OPUNDEF;
			for (int cc=0; cc < calculation.length(); cc++) {
				char mychar=calculation.charAt(cc);
				System.out.println("debug calculation char by char \""+mychar+"\"");
				if (mychar==OPSUM) 
					operand = OPSUM;
				else if (mychar==OPMINUS) 
                                        operand = OPMINUS;
				else if (mychar==OPTIMES) 
                                        operand = OPTIMES;
				else if (mychar==OPDIVIDE) 
                                        operand = OPDIVIDE;
				else if (operand==OPUNDEF) {	
					word1  += mychar;
				}
				else {
					word2  += mychar;
				}
			}
			System.out.println("debug word1=" + word1 + " word2= " + word2 + " operand= " + operand);
			
			
		}
	}
}
