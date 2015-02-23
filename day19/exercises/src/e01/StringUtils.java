package e01;

/**
 * Class for static methods that work on String
 * 
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 22 February 2015
 *
 */
public class StringUtils {

	private StringUtils() {
		throw new UnsupportedOperationException("Uninstantiable class");
	}

	/**
	 * compares two string to see whether they contain 'e'
	 * 
	 * @param s1
	 *            the first string
	 * @param s2
	 *            the second string
	 * @return an int value suitable for a Comparator compare: -1 if s1 contains
	 *         'e' but s2 does not OR 1 if s2 contains 'e' but s1 does not
	 *         OTHERWISE 0 
	 */
	public static int eChecker(String s1, String s2) {
		boolean e1 = s1.contains("e");
		boolean e2 = s2.contains("e");
		if (e2 & !e1)
			return 1;
		if (e1 & !e2)
			return -1;
		return 0;
	}

}
