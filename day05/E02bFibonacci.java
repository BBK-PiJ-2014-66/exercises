/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 27 Sept 2014
 *  
 * Day 5 Exercise 2b Fibonacci
 *
 * task set:
 * 
 * 	Write a small program with a method that calculates the nth element of the
 *	Fibonacci sequence as seen in the notes.  Is it easy to do this both
 *	iteratively and recursively? Try both ways and see which is more natural for
 *	you. If one takes too long, try the other way.
 * 
 *	When doing it recursively, do it with and without memoization. Compare the time
 *	that is needed in each case to find F(40) or F(45).
 * 
 *
 * Initial thoughts
 *	memoization means storing results calculated in an array. 
 *		see http://xlinux.nist.gov/dads//HTML/memoize.html
 *	asked for "time" can get this from command line but count 
 *	the number of function calls (use a static class variable).
 * 
 *
 */

public class E02bFibonacci{
	public static int fibRecursive( int n) {
		if ( (n==1) || (n==2) ) {
			return 1;
		}
		else {
			int result = fibRecursive(n-1) + fibRecursive(n-2); // method calls itself
			return result;
		}
	}

       public static void main(String[] args) {
                System.out.println("test fibRecursive(8),  expect this to be 21, actual = " +  fibRecursive(8));
                System.out.println("test fibRecursive(-1), want a simple message cannot handle zero/negative input  = " +  fibRecursive(-1));
	}
 
}
