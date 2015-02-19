/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1" 
 * page 9
 *
 */
package four;

import java.util.function.UnaryOperator;

public class LambdaDemo {

	public static void main(String[] args) {
		NumericFunc factorial = (n) -> {
			int result = 1;
			for (int ic=n; ic>1; ic--)  {
				result *= ic;
			}
			return result;
		};
		System.out.println("The factorial of 3 is " + factorial.func(3));
		System.out.println("The factorial of 5 is " + factorial.func(5));
		
		// OSS for fun try out UnaryOperator in place of DIY functional interface
		UnaryOperator<Integer> factorialU = (n) -> {
			int result = 1;
			for (int ic=n; ic>1; ic--)  {
				result *= ic;
			}
			return result;
		};
		System.out.println("factorialU of 5 is " + factorialU.apply(5));
	}
}

