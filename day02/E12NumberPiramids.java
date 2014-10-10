/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 2 Exercise 12 Number piramids
 * task set:
 * Write a program that output a number piramid like the one below.
 * 1
 * 22
 * 333
 * 4444
 * 55555
 * 666666
 * 7777777
 * \ldots
 * 
 * Not allowed methods and everything must be in main.
 * assume the ldots is a typo from latex.
 *
 * Not told the user is to have any control. 
 *
 * Have choosen to use command line arguments to control and
 * to see how to terminate with error if problems found
 * 
 *  @author Oliver S. Smart
 */

public class E12NumberPiramids {
	public static void main(String[] args) {
		int numbLines = 7; // default value will allow override

		// parse command lines to get numbLines
		String useMessage = "To produce a number piramid with NLINES run\n\n"
				+ "    java E12NumberPiramids NLINES\n\n"
				+ "where NLINES is a postive integer\n";
		if (args.length == 0) { // no command line args
			System.out.println("Using default number of lines = " + numbLines);
			System.out.print(useMessage);
		} else if (args.length == 1) {
			try {
				numbLines = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("ERROR 01 parsing integer from \"" + args[0]
						+ "\" N.B. the argument must be an integer\n");
				System.out.print(useMessage);
				System.exit(1); // terminate program with ERROR status 1
			}
		} else {
			System.out
					.println("ERROR 02 more than one command line argument\n");
			System.out.print(useMessage);
			System.exit(2); // terminate program with ERROR status 2
		}

		// now produce the piramid
		for (int lc = 0; lc < numbLines; lc++) { // lines count from zero
			int numbOut = lc + 1; // but output 1, 2, 3
			for (int cc = 0; cc < numbOut; cc++) {
				// use modulo to knock off any leading digits 
				// so 10 becomes 0. This keeps piramid straight
				System.out.print(numbOut % 10); 
			}
			System.out.println(); // final carriage return to end each line
		}
	}
}
