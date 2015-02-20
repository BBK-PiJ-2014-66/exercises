package seven;

import java.util.function.UnaryOperator;

/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1"
 *         page 13
 *
 */
public class LambdasAsArgumentsDemo {

	/**
	 * Apply functional interface function sf.func to string str
	 * 
	 * @param stringfunc
	 *            the instance of the string function
	 * @param str
	 *            the string on which the function should be applied
	 * @return the resulting string
	 */
	static String stringOp(StringFunc stringfunc, String str) {
		return stringfunc.func(str);
	}

	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		System.out.println("Here is the input string: " + inStr);
		String outStr = stringOp((str) -> str.toUpperCase(), inStr);
		System.out.println("The string in upper case: " + outStr);

		outStr = stringOp((str) -> {
			String result = "";
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) != ' ')
					result += str.charAt(i);
			}
			return result;
		}, inStr);
		System.out.println("The string with spaces removed: " + outStr);
		
		// OSS try the last one more succinctly \\s means white space
		outStr = stringOp((str) -> str.replaceAll("\\s", ""), inStr);
		System.out.println("The string with spaces removed v2: " + outStr);
		// try using Unary operator instead
		UnaryOperator<String> removeSpaces = (str) -> str.replaceAll("\\s","");
		outStr = removeSpaces.apply(inStr);
		System.out.println("The string with spaces removed v3: " + outStr);
		System.out.println("The string with spaces removed v4: " + inStr.replaceAll("\\s", ""));
		
		
		UnaryOperator<String> reverse = (str) -> {
			String result = "";
			for ( char c : str.toCharArray() ) {
				result = c + result;
			}
			return result;
		};
		System.out.println("The string reversed: " + reverse.apply(inStr));

	}

}
