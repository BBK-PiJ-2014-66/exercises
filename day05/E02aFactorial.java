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
	public int factorial( int n) {
		if (n==1) {
			return 1;
		} else {
			int result = n*factorial(n-1);
			return result;
		}
	}
}
