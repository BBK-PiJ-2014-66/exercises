package e01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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

	/**
	 * Method to return the "better" of two strings
	 * 
	 * @param str1
	 *            the first string
	 * @param str2
	 *            the second string
	 * @param predicate
	 *            lambda tests whether str1 is "better" than str2
	 * @return the "better" of str1 and str2
	 */
	public static String betterString(String str1, String str2,
			TwoStringPredicate predicate) {
		String retStr = str1;
		if (!predicate.test(str1, str2))
			retStr = str2;
		return retStr;
	}

	/**
	 * Takes a list of Strings and a predicate returns a new list of strings
	 * that pass the test
	 * 
	 * @param inList
	 *            the list of strings
	 * @param predicate
	 *            the "test" boolean function to be applied
	 * @return a list of the strings that pass the test
	 */
	public static List<String> allMatches(List<String> inList,
			Predicate<String> predicate) {

		if (inList == null) // protect against being supplied with a null list
			return null;
		/*
		 * 1st version: make a new empty list and then add elements if they
		 * match
		 */
		// List<String> retList = new ArrayList<>();
		// for (String itStr : inList) {
		// if (predicate.test(itStr))
		// retList.add(itStr);
		// }

		/*
		 * 2nd version: make a (shallow) copy of the original list then use
		 * .removeIf() method to chop out what we do not want
		 */
		List<String> retList = new ArrayList<>(inList);
		retList.removeIf(predicate.negate());
		return retList;
	}

	/**
	 * returns a new list that contains the result of applying function funct to
	 * each element in inList
	 * 
	 * @param inList
	 *            the input list - not altered
	 * @param funct
	 *            the Function to be applied
	 * @return a new list with the result of apply funct to each element of
	 *         input list
	 */
	public static List<String> transformedList(List<String> inList,
			Function<String, String> funct) {
		List<String> retList = null;
		if (inList != null) {// protect against being supplied with a null list
			retList = new ArrayList<>(inList.size());
			for (String itStr : inList) {
				retList.add(funct.apply(itStr));
			}
		}
		return retList;
	}

}
