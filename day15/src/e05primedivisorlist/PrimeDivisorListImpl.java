package e05primedivisorlist;

import java.util.TreeMap;

/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 5 Prime divisors
 * 
 * Implementation of interface PrimeDivisorList
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 29 Jan 2015
 */

public class PrimeDivisorListImpl implements PrimeDivisorList {

	/*
	 * use a TreeMap to store the number of occurances of each prime seems a
	 * good choice as we want to produce an ordered
	 */

	private TreeMap<Integer, Integer> treeMapPrimeCount;

	PrimeDivisorListImpl() {
		treeMapPrimeCount = new TreeMap<Integer, Integer>();
	}

	/**
	 * Add a new or existing prime number to the list
	 * 
	 * @param aPrime
	 *            that must be prime
	 * @throws IllegalArgumentException
	 *             if the number is not prime
	 */
	@Override
	public void addPrime(Integer aPrime) throws IllegalArgumentException {
		if (!isPrime(aPrime)) { // test that we have been supplied with a prime.
			throw new IllegalArgumentException(aPrime
					+ " is not a prime number");
		}
		int timesSeen = 0;
		if (treeMapPrimeCount.containsKey(aPrime)) {
			timesSeen = treeMapPrimeCount.get(aPrime);
		}
		timesSeen++;
		treeMapPrimeCount.put(aPrime, timesSeen);
	}

	/**
	 * Remove a number that is in the list
	 * 
	 * @param aNumber
	 * @throws IllegalArgumentException
	 *             if aNumber is not in the list
	 */
	@Override
	public void remove(Integer aNumber) throws IllegalArgumentException {
		System.out
				.println("debug stub method PrimeDivisorListImpl.remove() needs to be written!");
	}

	/**
	 * produces a string representation of the PrimeDivisorList conforming to
	 * specification
	 * 
	 * a list containing one 2, two 3, and one 7 returns "[ 2 * 3^2 * 7 = 126 ]"
	 * 
	 * @return the string representation
	 */
	@Override
	public String toString() {
		String outStr = "[ Empty ]";
		if (treeMapPrimeCount.size()!=0) {
			int product = 1;
			outStr = "[";
			// elegant iterate over TreeMap from
			// http://tutorialswithexamples.com/java-treemap-tutorial-and-examples/
			for ( Integer prime: treeMapPrimeCount.keySet()) {
				outStr += " " + prime;
				int nTimes = treeMapPrimeCount.get(prime);
				if (nTimes==1) { // only once
					product *= prime;
				} else {
					product *= Math.pow(prime,nTimes);
					outStr += "^" + nTimes; 
				}
				outStr += " *";
			}
			// at the end we will have added an unwanted '*'
			outStr = outStr.substring(0,outStr.length()-1);
			outStr += "= " + product + " ]";
		}
		return outStr;
	}

	/**
	 * 
	 * Tests whether an integer is prime
	 * 
	 * Method adapted from that written on day01 Prime04A.java
	 * 
	 * @param itest
	 *            integer to test
	 * @return true if itest is prime, false otherwise
	 */
	public static boolean isPrime(int itest) {
		// returns true if itest is prime
		// according to wikipedia http://en.wikipedia.org/wiki/Prime_number
		// Prime numbers have to be greater than one
		if (itest < 2) {
			return false; //
		}
		for (int iodd = 1; iodd < itest / 2; iodd = iodd + 2) {
			int icheck = iodd;
			// but do not check 1 instead check 2, 3, 5, 7, 9
			if (iodd == 1)
				icheck = 2;
			if (itest % icheck == 0)
				return false; // not a prime as icheck a divisor
		}
		return true;
	}

}
