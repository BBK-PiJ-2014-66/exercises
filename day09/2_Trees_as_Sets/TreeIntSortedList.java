/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 2 Trees as sets
 *
 * IntSet implementation using a tree structure.
 */

public class TreeIntSortedList implements IntSortedList {

        // we need a do we need a root node
	private IntegerTreeNode root;
	
	TreeIntSortedList() { // constructor
		root = null;
	}

        /*
         * add(int) adds a new int to the set; if it is there already, nothing happens.
         */
	public void add( int num) {
		if (root == null) {
			root = new IntegerTreeNode( num);
		} else {
			root.add(num);
		}
			
	}

	/*
         * contains(int)  returns true if the number is in the set, false otherwise.
	 */
	public boolean contains( int num) {
		return root.contains( num);
	}

	/* 
         * toString() returns a string with the values of the elements in the 
         * set separated by commas. Should be output in In order!
	 */
	@Override
	public String toString() {
		return "" + root.toStringInOrderCommaSeparated();
	}

}
