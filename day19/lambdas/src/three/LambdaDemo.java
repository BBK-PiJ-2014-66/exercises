package three;

/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1" 
 * page 7
 *
 */
public class LambdaDemo {
	public static void main(String args[]) {
		// a lambda expression that tests if one number is a factor of another
		NumericTest isAFactor = (n,d) -> (n%d) == 0;

		if (isAFactor.test(10,2)) 
			System.out.println("2 is a factor of 10 ");
		if (!isAFactor.test(10,3)) 
			System.out.println("3 is not a factor of 10 ");

	}
}
