package e04binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
public class Setup {

	/**
	 * Main method runs a simple test printing result to console
	 * 
	 * @param args
	 *            not used
	 */
	public static void main(String[] args) {

		System.out.println("Test ListOfRandomIntegers by getting "
				+ "sorted list of 20 integers in range 0 to 10:");
		List<Integer> test = ListOfRandomIntegers(20, 10);
		for (Integer itInt : test)
			System.out.print(" " + itInt);
		System.out.println();

	}

	/**
	 * Produces a sorted list of listSize random numbers in range 0 to max
	 * 
	 * @param listSize
	 *            size of the list
	 * @param max
	 *            maximum random number
	 * @return the list
	 */
	public static List<Integer> ListOfRandomIntegers(int listSize, int max) {
		List<Integer> result = new ArrayList<Integer>();
		for (int ic = 0; ic < listSize; ic++) {
			// http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
			Random rand = new Random();
			int min = 0;
			Integer randNum = rand.nextInt((max - min) + 1) + min;
			result.add(randNum);
		}
		Collections.sort(result);
		return result;
	}
	
	/**
	 * Returns a single random numer
	 * @param min the minimum value for the random number
	 * @param max the maximum value for the random number
	 * @return the random number
	 */
	public static int randomInt( int min, int max) {
		Random rand = new Random();
		int randNum = rand.nextInt((max - min) + 1) + min;
		return randNum;
	}

}
