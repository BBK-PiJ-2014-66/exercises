package eleven;

import java.util.function.UnaryOperator;
/**
 * static string to string function
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 2"
 *         page 2
 *
 */
public class MethodRefDemo {
	private static String stringOp(StringFunc fs, String s) {
		return fs.func(s);
	}

	public static void main(String args[]) {
		String inStr = "Lambdas add power to Java";
		MyStringOps strOps = new MyStringOps();
		String outStr = stringOp(strOps::strReverse, inStr);
		System.out.println("String reversed: " + outStr);

		// use built-in
		UnaryOperator<String> reverse = strOps::strReverse;
		System.out.println("String reversed UA: " + reverse.apply(inStr));
		
		// directly use
		System.out.println("String reversed direct: " + strOps.strReverse(inStr));
	}
}