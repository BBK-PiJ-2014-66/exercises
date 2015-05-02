package genericdrill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Keith Mannock "Generics Drill" in Revision Session 27th April 2015
 * 
 * 3rd example: A generic example of Sum - that is impossible to write? got very
 * confusing .....
 * 
 * So I did by overloading instead.
 * 
 * 4th example - getting sum recursively. This was also confused in class - so I
 * did a recursive method using an ArrayList and remove
 * 
 * Produces output:
 * 
 * sum of [1, 2, 3, 4, 5] is 15
 * 
 * sum of [1.1, 1.2, 1.3, 1.4, 1.5] is 6.5
 * 
 * recursive sum of [1.1, 1.2, 1.3, 1.4, 1.5] is 6.5
 *
 */
public class Sum {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Integer intSum = sumIterative(intArray);

		System.out.println(" sum of " + Arrays.asList(intArray) + " is "
				+ intSum);

		Double[] doubleArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
		Double dSum = sumIterative(doubleArray);
		System.out.println(" sum of " + Arrays.asList(doubleArray) + " is "
				+ dSum);
		
		Optional<Double>dSum2 = sumRecursive(doubleArray);
		System.out.println(" recursive sum is " + dSum2.get());

	}

	// public static <T extends Number> T sumIterative(T... arr) {
	// System.out.println("sumIterative arr.getClass()= " +
	// arr.getClass().getName());
	// /*
	// * Went through in class but I got confused - it appears task is not wise.
	// */
	// // following line does not compile cannot make a new instance of T
	// T result = 0.0;
	// for (T ele : arr ) {
	// // The following line does not compile as + is not defined for "Number"
	// result = result + ele;
	// }
	//
	// /*
	// * further attempt at home - getting no where
	// */
	// System.out.println("sumIterative arr.getClass()= " +
	// arr.getClass().getName());
	// String className = arr.getClass().getName();
	// if (className.contains("Integer") ) {
	// int result = 0;
	// for (T ele : arr) {
	// result = result + ele.intValue();
	// }
	// return (T) result;
	// } else {
	//
	// }
	// return null;
	// }

	// can easily do by simple overloading
	public static double sumIterative(Double... darr) {
		double result = 0.;
		if (darr.length > 0) {
			for (double dit : darr) {
				result += dit;
			}
		}
		return result;
	}

	public static int sumIterative(Integer... iarr) {
		int result = 0;
		if (iarr.length > 0) {
			for (int iit : iarr) {
				result += iit;
			}
		}
		return result;
	}

	private static Optional<Double> sumRecursive(Double... darr) {
		Optional<Double> result = Optional.empty();
		if (darr != null && darr.length > 1) {
			ArrayList<Double> dlist = new ArrayList<Double>(Arrays.asList(darr));
			result = Optional.of(sumRecursive(dlist));
		}
		return result;
	}

	private static Double sumRecursive(ArrayList<Double> dlist) {
		double result = 0.0;
		if (dlist.size() == 1) {
			result = dlist.get(0);
		} else {
			double first = dlist.get(0);
			dlist.remove(0);
			result = first + sumRecursive(dlist);
		}
		return result;
	}

}
