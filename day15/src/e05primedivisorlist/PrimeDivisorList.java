package e05primedivisorlist;

/**
 * PiJ day 15 Exception handling
 * 
 * Exercise 5 Prime divisors
 * 
 * 
 * task:
 * 
 * Create a class PrimeDivisorList. Integers (as in class Integer) can be added
 * to / removed from the list. If a null number is passed to the add(Integer)
 * method, a NullPointerException must be thrown. If a non-prime number is
 * added, an IllegalArgumentException must be thrown.
 * 
 * Override the method toString() so that it returns something like:
 * 
 * [ 2 * 3^2 * 7 = 126 ]
 * 
 * for a list containing one 2, two 3, and one 7. 
 * 
 * Use the TDD methodology to
 * create the class (interface, tests,implementation). You can base your class
 * on classes and interfaces from the Java Collections Library.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 29 Jan 2015
 */
public interface PrimeDivisorList {
	/**
	 * Add a new or existing prime number to the list
	 * 
	 * @param aPrime
	 *            that must be prime
	 * @throws IllegalArgumentException
	 *             if the number is not prime
	 */
	void addPrime(Integer aPrime) throws IllegalArgumentException;

	/**
	 * Remove a number that is in the list
	 * 
	 * @param aNumber
	 * @throws IllegalArgumentException
	 *             if aNumber is not in the list
	 */
	void remove(Integer aNumber) throws IllegalArgumentException;

}
