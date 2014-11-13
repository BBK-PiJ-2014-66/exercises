/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 12 Nov 2014
 *  
 * Day 7 Exercises 7, 8, 9, 10 ....
 *
 * All of these require lists of integers. 9 specifies linked list
 * to lets implement all of them with a single class 
 *
 * lets start with 8 stacks with push, pop and empty
 *
 * Use perl like convention there push and pop work on the right side 
 * of this list. unshift adds to left. shift removes from the left.
 * 
 */
public class ListUtilities {
	private Node firstNode;	
	private Node lastNode;
	private int numbOfNodes; 
	ListUtilities() {
		firstNode = null;
		lastNode = null;
		numbOfNodes = 0;
	}
        public void insert( int inValue) { // wrapper for push for queue task
		this.push( inValue);
	}
        public void push( int inValue) { // adds to right hand side of the list
		System.out.println("Pushing " + inValue);
		if (firstNode == null) {
			firstNode = new Node(inValue);
			lastNode = firstNode;
			numbOfNodes = 1;
		} else {
			Node newNode = new Node(inValue);
			lastNode.setNextNode(newNode);
			lastNode = newNode;
			numbOfNodes++;
		}
	} 
        public void unshift( int inValue) { // adds to left hand side of the list
		if (firstNode == null) {
			firstNode = new Node(inValue);
			lastNode = firstNode;
			numbOfNodes = 1;
		} else {
			firstNode = new Node( inValue, firstNode);
			numbOfNodes++;
		}
	} 
	
	public int pop() { // removes from left hand side of the list
		if (numbOfNodes==0)  {
			System.out.println("ERROR trying to pop from empty stack return -999999999");
			return -999999999;
                }
		int retValue = lastNode.getValue(); 
		numbOfNodes--;
		if (numbOfNodes==0) {
			lastNode = null;
                } else {
			// need to set lastNode to correct 
			lastNode = firstNode.getNodeNumber(numbOfNodes-1);
			lastNode.setNextNode(null);
		}
		return retValue;
	}
        public int retrieve() { // wrapper for shift for queue task
		return this.shift();
	}
	public int shift() { // removes from left hand side of the list
		if (numbOfNodes==0)  {
			System.out.println("ERROR trying to shift from empty stack return -999999999");
			return -999999999;
                }
		int retValue = firstNode.getValue(); 
		firstNode = firstNode.nextNode(); // can be null it there was only one element
		numbOfNodes--;
		return retValue;
	}
	public boolean empty() {
		boolean isEmpty = false;
		if (numbOfNodes==0) 
			isEmpty = true;
		return isEmpty;
	} 
	public int size() {
		return numbOfNodes;
	}
	public void printList() { // for debugging
		System.out.println("\tlist has " + numbOfNodes + " elements ");
		if (numbOfNodes != 0) {
			System.out.println("\tfirst element =  " + firstNode.getValue());
			System.out.println("\tlast element =  " + lastNode.getValue());
			for (int nc = 0; nc< numbOfNodes; nc++) {
				System.out.println("\telement[" + nc + "] = " + firstNode.getNodeNumber(nc).getValue());
			}
		}	
	}
}
class Node {
	private int value;
	private Node nextNode;
	Node( int inValue) {
		value = inValue;
		nextNode = null;
	}
	Node( int  inValue, Node inNextNode) {
		value = inValue;
		nextNode = inNextNode;
	}
	public int getValue() {
		return value;
	}
	public Node nextNode() {
		return nextNode;
	}
	public void setNextNode( Node inNextNode) {
		nextNode = inNextNode;
	}
	public Node getNodeNumber( int inNumb) {
		if (inNumb==0) {
			return this;
		}	
		else {
			return nextNode.getNodeNumber(inNumb-1);
		}
	}
}
