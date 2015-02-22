package eleven;
/**
 * static string to string function
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 2"
 *         page 1
 *
 */
public class MyStringOps {

		public String strReverse( String str) {
			String reverse="";
			for (char cit : str.toCharArray()) {
				reverse = cit + reverse;
			}
			return reverse;
		}
}
