package e01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

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
	
	/**
	 * Takes a list of T's and a predicate returns a new list of T's
	 * that pass the test
	 * 
	 * @param inList
	 *            the list of T's
	 * @param predicate
	 *            the "test" boolean function to be applied
	 * @return a list of the T's that pass the test
	 */
	public static <T> List<T> allMatches(List<T> inList,
			Predicate<T> predicate) {
		/*
		 * 2nd version: make a (shallow) copy of the original list then use
		 * .removeIf() method to chop out what we do not want
		 */
		List<T> retList = new ArrayList<>(inList);
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
	public static <T> List<T> transformedList(List<T> inList,
			Function<T, T> funct) {
		List<T> retList = null;
		if (inList != null) {// protect against being supplied with a null list
			retList = new ArrayList<>(inList.size());
			for (T itT : inList) {
				retList.add(funct.apply(itT));
			}
		}
		return retList;
	}



}
