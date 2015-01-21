package e04binarySearch;

import java.util.List;

/**
 * PiJ day 14 Recusion II
 * 
 * 4 Binary Search
 * 
 * Want a Sorted List of 10, 100 or 1000 random Integers.
 * 
 * This class provides a method to produce them. N.B. use Java Collection
 * Library sort rather than DIY.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 20 Jan 2015
 */
public class BinarySearch {

	/**
	 * launch test method testing out implementation
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {
		BinarySearch init = new BinarySearch();
		init.test();

	}

	private int nComparisons = 0; // counter for number of comparison

	public int getNComparisons() {
		return nComparisons;
	}

	public void resetNComparisons() {
		nComparisons = 0;
	}

	/**
	 * test runs
	 */
	public void test() {
		System.out
				.println("Development Test binary search on sorted list of 10"
						+ " integers in range 0 to 20:");
		List<Integer> test;

		test = Setup.ListOfRandomIntegers(10, 20);
		// for development check whether list contains 13
		System.out.println(test + " contains(13)= " + binaryContains(test, 13)
				+ " made " + getNComparisons() + " comparisons");

	}

	/**
	 * Binary search implementation checks where list contains one or more
	 * "value"
	 * 
	 * @param list
	 *            sorted list of Integers
	 * @param value
	 *            to check for
	 * @return true if the list contains the value false otherwise
	 */
	public boolean binaryContains(List<Integer> list, int value) {
		if (list == null)
			return false;
		int size = list.size();
		// empty list does not have the value
		if (size == 0)
			return false;
		// find the middle item
		int middle = size / 2;
		int midVal = list.get(middle);
		System.out.println("debug list=" + list + " size = " + size
				+ " midVal= " + midVal);
		nComparisons++; // == is the first comparison
		if (midVal == value) {
			return true; // found it
		} else {
			nComparisons++; // < is the second comparison
			if (value < midVal) { // next search the first half not including
									// middle

				/*
				 * use subList to get ".. the portion of this list between the
				 * specified fromIndex, inclusive, and toIndex, exclusive. (If
				 * fromIndex and toIndex are equal, the returned list is
				 * empty.)"
				 */
				return binaryContains(list.subList(0, middle), value);
			} else { // search the second half not including middle
				return binaryContains(list.subList(middle + 1, size), value);
			}
		}
	}

}
