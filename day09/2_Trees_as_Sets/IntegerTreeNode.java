/* 
 * Birbeck MSc Computer Science PiJ Exercises 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 5.1 Integer Binary Tree
 *
 * IntegerTreeNode class as given in notes, completed
 * Then extended for exercise 2 and exercise 3
 */
public class IntegerTreeNode {
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

	// version of add for sets - no duplicates allowed
	public void addSet( int newNumber) { // adds a new number to the set 
		if (newNumber == value) { // do nothing simply return
		} else if (newNumber > value) {
                        if (right == null) {
                                right = new IntegerTreeNode( newNumber);
                        } else {
                                right.addSet(newNumber);
                        }
                } else {
                        if (left == null) {
                                left = new IntegerTreeNode( newNumber);
                        } else {
                                left.addSet(newNumber);
                        }
                }
        }



	public boolean contains( int n) {
		return containsVerbose( n, false);
	}


	public boolean containsVerbose( int inNum, boolean verbose) {
	 	if (verbose) {
			System.out.println("\tcontains checks " + inNum + " against " + value);
		}
		if (inNum > value) {
			if (right == null) {
				return false;
			} else {
				return right.containsVerbose( inNum, verbose);
			}
		} else if (value == inNum) {
			return true;
		} else  {
			if (left == null) {
				return false;
			} else {
				return left.containsVerbose( inNum, verbose);
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

        public String toStringCommaSeparated() { 
                String retStr= "" + value;
                if (left!=null) {
                        retStr += ", " + left.toStringCommaSeparated(); 
                }
                if (right!=null) {
                        retStr += ", " + right.toStringCommaSeparated();
                }
                return retStr;
        }


	public String toStringInOrderCommaSeparated() {
		String retStr="";
                if (left!=null) {
                        retStr += left.toStringInOrderCommaSeparated() + ", "; 
                }
                retStr += "" + value;
                if (right!=null) {
                        retStr += ", " + right.toStringInOrderCommaSeparated();
                }
                return retStr;
 
	}

	public String information() {
		return "The tree contains " + this.numberValues() + 
			" values. It has a depth of " + this.depth();
	}

	private int depth() { // returns the depth that is the number of levels below (1.3)
		if (left==null && right==null) {
			return 0; // leaf has depth zero
		} else if (left==null) {
			return 1 + right.depth();
		} else if (right==null) {
			return 1 + left.depth();
		} else {
			return 1 + Math.max(right.depth(),left.depth());
		}
	}

	private int numberValues() {
		int retNumber = 1; // this node
		if (left!=null)
			retNumber += left.numberValues();
		if (right!=null)
			retNumber += right.numberValues();
		return retNumber;
	}
}
