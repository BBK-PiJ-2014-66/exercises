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
		for (int lc=0; lc < numbLines; lc++) { // line count
			for (int cc=0; cc < lc+1; cc++) // column count for lc=0 want 1 output of 1, lc=1 want two output of 2 ..
				System.out.print(lc+1); 
			System.out.println(); // final carriage return to end the line
		}
	}
}
