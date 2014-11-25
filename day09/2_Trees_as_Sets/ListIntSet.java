/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 25 Nov 2014
 *  
 * Day 9 Exercise 2 trees as sets
 *
 * IntSet implementation using a linked list structure
 */

public class ListIntSet implements IntSet {

	// head node of our linked list	
	private ListIntSetNode head;

	ListIntSet() {
		head = null;
	}

        /*
         * add(int) adds a new int to the set; if it is there already, nothing happens.
         */
	public void add( int num) {
		System.out.println("debug ListIntSet.add() to be written");
	} 

	/*
         * contains(int)  returns true if the number is in the set, false otherwise.
	 */
	public boolean contains( int num) {
		System.out.println("debug ListIntSet.contains() to be written");
		return false;
	}

	/*
         * containsVerbose(int) returns the same values as the former method, 
	 * but for every element that is checked prints its value on screen.
	 */
	public boolean containsVerbose( int num) {
		System.out.println("debug ListIntSet.containsVerbose() to be written");
		return false;
	}

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas.
	 */
	public String toString() {
		return "debug ListIntSet.toString() to be written";
	}
}
