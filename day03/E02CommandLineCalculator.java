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
                        /* now split the calculation string into wordLeft, an operand character, wordRight
			   we will do manually using a for loop because it is a learning exercise 

			   N.B. for proper code a better way to do this using standard java would be
			   to use the "int indexOf(int ch)" string method to find the location of the ch 
			   character in the string */
			String wordLeft="", wordRight="";	
			char operand=OPUNDEF;
			for (int cc=0; cc < calculation.length(); cc++) {
				char mychar=calculation.charAt(cc);
				if (mychar==OPSUM) 
					operand = OPSUM;
				else if (mychar==OPMINUS) 
                                        operand = OPMINUS;
				else if (mychar==OPTIMES) 
                                        operand = OPTIMES;
				else if (mychar==OPDIVIDE) 
                                        operand = OPDIVIDE;
				else if (mychar==' '|| mychar == '\t')
					; // ignore
				else if (operand==OPUNDEF) {	
					wordLeft  += mychar;
				}
				else {
					wordRight  += mychar;
				}
			}

			if ((operand==OPUNDEF) || (wordLeft.length()==0) || (wordRight.length()==0)) {
				System.out.print("ERROR could not parse calculation string \"" + calculation + "\"");
				System.out.println(      "it must contain NUMBER then + or - or / or * then NUMBER");
				System.exit(2); // terminate program with ERROR status 2
			}
			
			double numberLeft = Double.parseDouble(wordLeft); // no error trapping - life it too short
			double numberRight = Double.parseDouble(wordRight); // no error trapping - life it too short
			// finally do the calculation, instructions say the output should be "bare"
 			if (operand==OPSUM)
				System.out.println(numberLeft+numberRight);
 			else if (operand==OPMINUS)
				System.out.println(numberLeft-numberRight);
 			else if (operand==OPTIMES)
				System.out.println(numberLeft*numberRight);
 			else if (operand==OPDIVIDE)
				System.out.println(numberLeft/numberRight);
			else
				System.out.println("ERROR impossible error in E02CommandLineCalculator this should never happen");
			
		}
	}
}
