/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 5.1 Integer Binary Tree
 *
 * IntegerTreeNode class as given in notes, completed
 */
public class IntegerTreeNode implements IntegerList {
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	IntegerTreeNode( int newNumber) { // creates the head or a leaf 
		value = newNumber;
		left = null;
		right = null;
	}

	public void add( int newNumber) { // adds a new number to the tree as given in notes
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode( newNumber);
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode( newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}

	public boolean contains( int n) {
		if (n == value) {
			return true;
		} else if (n > value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
                        if (left == null) {
                                return false;
                        } else {
                                return left.contains(n);
                        }
		}
	}

	public int getMax() { // returns maximum value in the tree 
		if (right == null) {
			return value;
		} else {
			return right.getMax();
		}
	}
	
	public int getMin() { // returns minimum value in the tree 
		if (left == null) {
			return value;
		} else {
			return left.getMin();
		}
	}

        @Override
        public String toString() { // "simplified" print in exercise
		String retStr= "[" + value;
		if (left!=null) {
			retStr += " " + left; // toString will be invoked
		}
		if (right!=null) {
			retStr += " " + right; 
		}
		retStr += "]";
		return retStr;
	}

        public String toStringComplete() { // "complete" print in exercise
		String retStr= "[" + value;
		if (left==null) {
			retStr += " L[]";
		} else	 {
			retStr += " L" + left; // toString will be invoked
		}
		if (right==null) {
			retStr += " R[]";
		} else	 {
			retStr += " R" + right; 
		}
		retStr += "]";
		return retStr;
	}


			

}
