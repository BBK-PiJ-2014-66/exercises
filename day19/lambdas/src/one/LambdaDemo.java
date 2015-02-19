package one;

/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1" 
 * page 5
 *
 */
public class LambdaDemo {
	public static void main(String args[]) {
		MyNumber myNum; // declare an interface reference

		myNum = () -> 123.45;
		// call getValue(), which is overridden by the previously assigned
		// lambda expresions
		System.out.println("A fixed value: " + myNum.getValue());

		myNum = () -> Math.random() * 100;
		System.out.println("A random value: " + myNum.getValue());
		System.out.println("2nd random value: " + myNum.getValue());
		

	}
}
