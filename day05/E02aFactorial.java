/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 27 Sept 2014
 *  
 * Day 5 Exercise 2a Factorial
 *
 * task set:
 * 
 * 	Write a small program with a method that calculates the factorial 
 *	of an integer number as seen in the notes.
 *	Is it easy to do this both iteratively and recursively? 
 * 	Try both ways and see which is more natural for you. 
 *
 * Initial thoughts
 *
 */
public class E02aFactorial{
	public static int factorialRecursive( int n) {
		if ( n==1 || n==0) {
			return 1;
		} else if (n<0) {
			System.out.println("ERROR factorial not defined for negative numbers" );
			// throw an exception
			throw new IllegalArgumentException("factorial not defined for negative numbers");
			
		} else {
			int result = n*factorialRecursive(n-1);
			return result;
		}
	}
        public static int factorialIterative( int n) {
		// use zero and negative argument handling from the Recursive version.
                if (n<1) return factorialRecursive(n); 
		int result = 1;
		for (int cc=1; cc<=n; cc++) { // count 1, 2, ... n
			result *= cc;
		}
		return result;
        }


	public static void main(String[] args) {
		System.out.println("test factorial function (recursive) factorialRecursive(12) = " +  factorialRecursive(12));
		System.out.println("test factorial function (iterative) factorialIterative(12) = " +  factorialIterative(12));
		System.out.println("                           (According to my calculator 12! = 479001600)" );
		System.out.println("now lets try zero a difficult value  factorialRecursive(0) = " +  factorialRecursive(0));
		System.out.println("factorial of negative values is not defined so should throw an " + 
		                           "exception when calculating factorialRecursive(-12), Try it now ");  
		factorialRecursive(-12);
	}
}
