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
 * assune the ldots is a typo from latex.
 * Not told the user is to have any control. 
 * First code to do seven as shown.
 * Then extend to allow user to control number using a command line argument 
 * 
 *  @author Oliver S. Smart
 */

public class E12NumberPiramids {
	public static void main(String[] args) {
		int numbLines =  7; // default value will allow override
                
 		// parse command lines to get numbLines
		if (args.length==0) { // no command line args
			 System.out.println("Using default number of lines = " + numbLines);
			 System.out.println("To produce a number piramid with NLINES rerun");
			 System.out.println();
			 System.out.println("    java E12NumberPiramids NLINES");
			 System.out.println();
			 System.out.println("where NLINES is a postive integer");
		}
		else if (args.length == 1) {
			numbLines = Integer.parseInt(args[0]);
		}

                // now produce the piramid
		for (int lc=0; lc < numbLines; lc++) { // line count from zero as per C not FORTRAN
                        int numbOut = lc + 1; // output 1, 2, 3
			for (int cc=0; cc < numbOut; cc++) {// column count for lc=0 want 1 output of 1, lc=1 want two output of 2 ..
				System.out.print(numbOut%10); // for 10 output 0, 11 output 1 to keep piramid straight
                        }
			System.out.println(); // final carriage return to end each line
		}
	}
}
