/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 27 Sept 2014
 *  
 * Day 5 Exercise 5 Power
 *
 * task set:
 * 
 *	Create a class with a static method pow that takes to integers
 *	(base and exponent) and calculates the power, e.g. pow(2,3)
 *	calculates 2**3=-8.  Is it easy to do this both iteratively and
 *	recursively?
 *
 * Initial thoughts
 *	Lets use double for the method and handle negative exponents
 *
 */
class E05Power{
	public static double powIterative( int base, int exponent) {
		double result = 1.0;
		boolean negativeExponent = false;
		if (exponent<0) {
			exponent *= -1.; //change sign
			negativeExponent = true;
		}
		for (int ec=1; ec<=exponent; ec++) { // count 1, 2, 3
			result *= base;
		}
		if (negativeExponent) {
			result = 1./result;
		}
		return result;
	}
	public static double powRecursive( int base, int exponent) {
		if (exponent==0) {
			return 1.;
		} else if (exponent<0) {
			return 1./powRecursive( base, -exponent);
	 	} else {
			return base*powRecursive( base, exponent-1);
		}
	}
	public static void main( String args[]) {
		System.out.println("test powIterative(2,3) expect 8. get " + powIterative(2,3));
		System.out.println("test powIterative(2,-3) expect 0.125 get " + powIterative(2,-3));
		System.out.println("test powIterative(-2,3) expect -8. get " + powIterative(-2,3));
		System.out.println("test powIterative(-2,0) expect 1. get " + powIterative(2,0));

		System.out.println("test powRecursive(2,3) expect 8. get " + powRecursive(2,3));
		System.out.println("test powRecursive(2,-3) expect 0.125 get " + powRecursive(2,-3));
		System.out.println("test powRecursive(-2,3) expect -8. get " + powRecursive(-2,3));
		System.out.println("test powRecursive(-2,0) expect 1. get " + powRecursive(2,0));

	}
	

}
