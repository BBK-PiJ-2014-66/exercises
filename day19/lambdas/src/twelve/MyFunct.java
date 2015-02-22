package twelve;

/**
 * A functional interface that takes two reference arguments and returns a
 * boolean result.
 * 
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 2"
 *         page 3
 *
 */
public interface MyFunct<T> {
	boolean funct(T v1, T v2);

}
