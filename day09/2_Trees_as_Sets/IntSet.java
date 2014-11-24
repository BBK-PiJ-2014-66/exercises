/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 2 trees as sets
 *
 * The interface as required
 */

public interface IntSet {

        /*
         * add(int) adds a new int to the set; if it is there already, nothing happens.
         */
	public void add( int num); 

	/*
         * contains(int)  returns true if the number is in the set, false otherwise.
	 */
	public boolean contains( int num);

	/*
         * containsVerbose(int) returns the same values as the former method, 
	 * but for every element that is checked prints its value on screen.
	 */
	public boolean containsVerbose( int num);

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas.
	 */
	public String toString();

}
