package e05primedivisorlist;

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

	// no constructor yet

	@Override
	public void addPrime(Integer aPrime) throws IllegalArgumentException {
		System.out
				.println("debug stub method PrimeDivisorListImpl.addPrime() needs to be written!");
	}

	@Override
	public void remove(Integer aNumber) throws IllegalArgumentException {
		System.out
				.println("debug stub method PrimeDivisorListImpl.remove() needs to be written!");
	}

	@Override
	public String toString() {
		return "debug stub method PrimeDivisorListImpl.toString() needs to be written!";
	}

	/**
	 * 
	 * Tests whether an integer is prime
	 * 
	 * Method adapted from that written on day01 Prime04A.java
	 *  
	 * @param itest integer to test
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
