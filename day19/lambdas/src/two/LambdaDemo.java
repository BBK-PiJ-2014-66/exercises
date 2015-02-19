package two;

/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1" 
 * page 6
 *
 */
public class LambdaDemo {
	public static void main(String args[]) {
		// a lambda expression that tests if a number is even
		NumericTest isEven = (n) -> (n%2) == 0;

		if (isEven.test(10)) 
			System.out.println("10 is even");
		if (!isEven.test(9)) 
			System.out.println("9 is odd");
		
		// test for non-negative number
		NumericTest isNotNeg = (n) -> (n>=0);
		if (isNotNeg.test(0))
			System.out.println("0 is not negative");
		if (!isNotNeg.test(-10))
			System.out.println("-10 is negative");
		

	}
}
