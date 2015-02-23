package e01;

/**
 * Interface with a method that takes two strings and returns true if first is
 * better than second
 * 
 * As java Predicate<T> has the method "test" use this name.
 * 
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * Exercise 3
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 22 February 2015
 *
 */
@FunctionalInterface
public interface TwoStringPredicate {
	/**
	 * Evaluates a predicate comparing two strings
	 * 
	 * @param str1
	 *            input argument first string
	 * @param str2
	 *            input argument second string
	 * @return true if the two strings match the predictate false otherwise
	 */
	boolean test(String str1, String str2);
}
