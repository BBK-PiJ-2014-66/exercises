/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 26 Nov 2014
 *  
 * Day 9 Exercise 3 Trees as (sorted) lists
 *
 * IntSorted implementation using a linked list structure
 */

public class ListIntSortedList implements IntSortedList {

	// head node of our linked list	
	private ListIntSetNode head;

	ListIntSortedList() {
		head = null;
	}

        /*
         * adds a new int to the list so that the list remains sorted; a list can contain duplicates unlike a set.
         */
	public void add( int num) {
		if (head == null) {
			head = new ListIntSetNode( num);
		} else if (num < head.value()) { // special handling for values before the head
			int temp = head.value();
			head.setValue(num);
			head.addSortedList(temp);
		} else {
			head.addSortedList(num);
		}
	}

	/*
         * contains(int)  returns true if the number is in the list, false otherwise.
	 */
	public boolean contains( int num) {
		return head.contains(num,false);
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


