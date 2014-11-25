/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 2 Trees as sets
 *
 * Node for TreeIntSet implementation
 */
public class TreeIntSetNode{
	private int value;
	private TreeIntSetNode left;
	private TreeIntSetNode right;

	TreeIntSetNode( int inValue) { // constructor
		value = inValue;
		left = null;
		right = null;
	}

	public void add( int newNumber) { // adds a new number to the set 
		if (newNumber == value) { // do nothing simply return
		} else if (newNumber > value) {
                        if (right == null) {
                                right = new TreeIntSetNode( newNumber);
                        } else {
                                right.add(newNumber);
                        }
                } else {
                        if (left == null) {
                                left = new TreeIntSetNode( newNumber);
                        } else {
                                left.add(newNumber);
                        }
                }
        }

	public boolean contains( int inNum, boolean verbose) {
		if (verbose) {
			System.out.println("\tcontains checks " + inNum + " against " + value);
		}
		if (inNum > value) {
			if (right == null) {
				return false;
			} else {
				return right.contains( inNum, verbose);
			}
		} else if (value == inNum) {
			return true;
		} else  {
			if (left == null) {
				return false;
			} else {
				return left.contains( inNum, verbose);
			}
		}
	}

        @Override
        public String toString() { 
                String retStr= "" + value;
                if (left!=null) {
                        retStr += ", " + left; 
                }
                if (right!=null) {
                        retStr += ", " + right;
                }
                return retStr;
        }



}

