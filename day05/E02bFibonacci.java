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
	private static int numFnCalls=0;
	private static int numAdditions=0;
	private static int[] memo = {0};
	private static int memoMax=1000;
	public static int fibRecursive( int n) {
		numFnCalls++;
		if ( (n==1) || (n==2) ) {
			return 1;
		}
		else if (n<1) {
                	System.out.println("ERROR fibonacci method cannot handle zero or negative input, returning 0");
			return 0;
		}
		else {
			numAdditions++;
			int result = fibRecursive(n-1) + fibRecursive(n-2); // method calls itself
			return result;
		}
	}
	public static int fibRecursMemo ( int n) { // memoized version
		if (memo.length != memoMax) { // initialize memo store on first call 
			memo = new int[memoMax];
			for (int mc=0; mc<memoMax; mc++)
				memo[mc] = 0; // set all to zero
		}
		if (n<=2) { /* handle first two numbers, zero or negative using Recursive
			       this avoids cut/paste of code - making maintenance easier */
			return fibRecursive(n);
		}
		else if (n < memoMax  && memo[n] != 0) { // have we stored in memo?
			numFnCalls++;
			return memo[n];
		}
		else {
			numFnCalls++;
			numAdditions++;
			int result = fibRecursMemo(n-1) + fibRecursMemo(n-2); // method calls itself
			if (n < memoMax) memo[n] = result; // if it fits, put in memo store
			return result;
		}
	}
	public static int fibIterative( int n) {
		if (n<=2) { /* handle first two numbers, zero or negative using Recursive
			       this avoids cut/paste of code - making maintenance easier */
			return fibRecursive(n);
		} else {
			numFnCalls++;
			int FnMinus2 = 1;
			int FnMinus1 = 1;
			int Fn=0;
			for (int nc=3; nc <= n; nc++) {
				numAdditions++;
				Fn = FnMinus1 + FnMinus2;
				FnMinus2 = FnMinus1;
				FnMinus1 = Fn;
			}
			return Fn;
		}
	}

	public static String reportNums() {
		return " #functionCalls=" + numFnCalls + " #additions=" + numAdditions;
	}
	public static void resetNums() {
		numFnCalls=0;
		numAdditions=0;
	}

       public static void main(String[] args) {
                System.out.println("test fibRecursive(8),  expect this to be 21, actual = " +  fibRecursive(8) + reportNums());
		resetNums();

                System.out.println("test fibIterative(8),  expect this to be 21, actual = " +  fibIterative(8) + reportNums());
		resetNums();


                System.out.println("test fibRecursMemo(8),  expect this to be 21, actual = " +  fibRecursMemo(8) + reportNums());
		resetNums();


                System.out.println("test fibRecursive(40), expect this to be 102334155, actual = " +  fibRecursive(40) + reportNums());
		resetNums();

                System.out.println("test fibIterative(40), expect this to be 102334155, actual = " +  fibIterative(40) + reportNums());
		resetNums();

                System.out.println("test fibRecursMemo(40), expect this to be 102334155, actual = " +  fibRecursMemo(40) + reportNums());
		resetNums();

                System.out.println("test fibRecursive(-1), want a simple message cannot handle zero/negative input " );
		fibRecursive(-1);
	}
 
}
