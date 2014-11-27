/*
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 25 Nov 2014
 *  
 * Day 9 Exercise 2 Trees as sets
 *
 * Node for ListIntSet implementation
 */
public class ListIntSetNode{
	private int value;
	private ListIntSetNode next;


	ListIntSetNode( int num) {
		value = num;
		next = null;
	}


	public void add( int num) {
		if (num == value) {
			; //ignore as this is a set
		} else if (next == null) {
			next = new ListIntSetNode( num);
		} else {
			next.add(num);
		}
	}

	public int value() {
		return value;
	}

	public void setValue( int num) {
		value = num;
	}


	public void addSortedList( int num) {
		if (next == null) { // add to the end biggest as it the biggest
			next = new ListIntSetNode( num);
		} else if ((value <= num) && (num < next.value)) {
			// add in between
			ListIntSetNode newNode = new ListIntSetNode( num);
			newNode.next = next;
			next = newNode;
		} else {
			next.addSortedList(num);
		}
	}

	@Override
        public String toString() { // comma separated
		if (next==null) {
			return "" + value;
		} else {
			return "" + value + ", " + next;
		}
	}

	public boolean contains( int inNum, boolean verbose) {
		if (verbose) {
			System.out.println("\tcontains checks " + inNum + " against " + value);
		}
		if (inNum == value ) {
			return true;
		} else if (next == null) {
			return false;
		} else {
			return next.contains( inNum, verbose);
		}
	}	
	
}

