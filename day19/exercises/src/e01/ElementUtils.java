package e01;

/**
 * Class for static methods that work on generic element type T
 * 
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 22 February 2015
 *
 */
public class ElementUtils<T> {

	private ElementUtils() {
		throw new UnsupportedOperationException("Uninstantiable class");
	}

		/**
	 * Method to return the "better" of two elements
	 * 
	 * @param ele1
	 *            the first element
	 * @param ele2
	 *            the second element
	 * @param predicate
	 *            lambda tests whether ele1 is "better" than ele2
	 * @return the "better" of ele1 and ele2
	 */
	public static <T> T betterElement(T ele1, T ele2,
			TwoElementPredicate<T> predicate) {
		T retEle = ele1;
		if (!predicate.test(ele1, ele2))
			retEle = ele2;
		return retEle;
	}

}
