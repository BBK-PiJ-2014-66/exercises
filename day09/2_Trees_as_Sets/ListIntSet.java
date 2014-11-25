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
		if (head == null) {
			head = new ListIntSetNode( num);
		} else {
			head.add(num);
		}
	} 

	/*
         * contains(int)  returns true if the number is in the set, false otherwise.
	 */
	public boolean contains( int num) {
		return head.contains( num, false); // non-verbose.
	}

	/*
         * containsVerbose(int) returns the same values as the former method, 
	 * but for every element that is checked prints its value on screen.
	 */
	public boolean containsVerbose( int num) {
		return head.contains( num, true); // verbose prints comparisons
	}

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas.
	 */
        @Override
	public String toString() {
		return "" + head;
	}
}
