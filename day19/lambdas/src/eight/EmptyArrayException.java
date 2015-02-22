package eight;
/**
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1"
 *         page 15
 *
 */
public class EmptyArrayException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	EmptyArrayException() {
		super("Array Empty");
	}

}
