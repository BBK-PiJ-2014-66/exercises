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
		System.out.println("Test binary search on sorted list of 10,"
				+ " 100 and 1000 random integers");
		List<Integer> test;

		// iterate first 10 elements then 100 then 1000
		for (int size = 10; size <= 1000; size *= 10) {
			int max = 2 * size; // make maximum twice the size to give approx
								// 50% true/false
			System.out.println("\ntest lists of " + size + " random integers,"
					+ " in range 0 to " + max);
			if (size != 10) {
				System.out.print("\tnumber of comparisons: ");
			}
			// in each case do 30 trials
			int nTrials = 30;
			for (int trial = 0; trial < nTrials; trial++) {
				test = Setup.ListOfRandomIntegers(size, max);
				// look for a random integer in same range
				int look = Setup.randomInt(0, max);
				resetNComparisons(); // reset comparisons
				boolean myContains = binaryContains(test, look);
				int nComp = getNComparisons();
				if (size == 10) {
					System.out.println("\t" + test + " contains(" + look
							+ ")= " + myContains + " made " + nComp
							+ " comparisons");
				} else {
					System.out.print(nComp + " ");
				}
				if (myContains != test.contains(look)) {
					System.out.println("ERROR binaryContains got it WRONG!");
					System.out.println("ERROR input list " + test);
					System.out.println("ERROR binaryContains got it WRONG!");
					break;
				}
			}
			if (size != 10)
				System.out.println(); // complete line

		}

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
