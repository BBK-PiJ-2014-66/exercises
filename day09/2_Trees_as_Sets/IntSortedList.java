/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 3 Trees as (sorted) lists
 *
 * The interface as required
 */

public interface IntSortedList {

        /*
         * adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
         */
	public void add( int num); 

	/*
         * contains(int)  returns true if the number is in the list, false otherwise.
	 */
	public boolean contains( int num);

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas.
	 */
	public String toString();

}
