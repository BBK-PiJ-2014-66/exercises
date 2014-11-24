/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 5.1 Integer Binary Tree
 *
 * IntegerTreeNode class as given in notes, completed
 */
public class IntegerTreeNode{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	public void add( int newNumber) {
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
	
			

}
