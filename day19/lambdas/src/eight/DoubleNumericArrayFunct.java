package eight;
/**
 * functional interface for array of doubles to a double
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1"
 *         page 15
 *
 *@throws EmptyArrayException if supplied with an empty array.
 */
public interface DoubleNumericArrayFunct {
	double func(double[] n) throws EmptyArrayException;

}
