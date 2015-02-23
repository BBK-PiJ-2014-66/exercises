package e01;

/**
 * Interface with a method that takes two elements and returns true if first is
 * better than second (generic version)
 * 
 * As java Predicate<T> has the method "test" use this name.
 * 
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * Exercise 4
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 23 February 2015
 *
 */
@FunctionalInterface
public interface TwoElementPredicate<T> {
	/**
	 * Evaluates a predicate comparing two elements
	 * 
	 * @param ele1
	 *            input argument first element
	 * @param ele2
	 *            input argument second element
	 * @return true if the two elements match the predicate false otherwise
	 */
	boolean test(T ele1, T ele2);
}
