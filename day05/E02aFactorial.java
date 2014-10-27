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

	public static void main(String[] args) {
		System.out.println("test factorial function (recursive) factorialRecursive(12)=" +  factorialRecursive(12));
		System.out.println("now lets try some difficult values  factorialRecursive(0)=" +  factorialRecursive(0));
		System.out.println("now lets try some difficult values  factorialRecursive(-12)=" +  factorialRecursive(-12));
	}
}
