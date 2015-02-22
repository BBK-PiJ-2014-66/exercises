package ten;
/**
 * static string to string function
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1"
 *         page 9
 *
 */
public class MyStringOps {

		public static String strReverse( String str) {
			String reverse="";
			for (char cit : str.toCharArray()) {
				reverse = cit + reverse;
			}
			return reverse;
		}
}
