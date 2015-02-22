package eight;
/**
 * Exceptions in lambda expressions
 * @author PiJ sheet "An Introduction to Lambda Expressions in Java 8: Part 1"
 *         page 16
 *
 */
public class LambdaDemo {
	public static void main(String args[]) throws EmptyArrayException {
		double[] values = { 1.0, 2.0, 3.0, 4.0};
		
		// block lambda to compute average of an array of doubles
		DoubleNumericArrayFunct average = (n) -> {
			double sum = 0;
			// OSS handle null array the same way.
			if (n==null || n.length == 0) throw new EmptyArrayException();
			for (double dit : n) {
				sum += dit;
			}
			return sum/n.length;
		};
		
		
		System.out.println("The average is " + average.func(values));
		// OSS try setting to null
		values = null;
		System.out.print("Expect exception on empty array"  + average.func(values));
		System.out.print("Expect exception on empty array"  + average.func(new double[0]));
	}

}
