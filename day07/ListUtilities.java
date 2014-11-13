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
 * lets start with 8 stacks with push pop and empty
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
        public void push( int inValue) {
		System.out.println("Pushing " + inValue);
		if (firstNode == null) {
			firstNode = new Node(inValue);
			lastNode = firstNode;
			numbOfNodes = 1;
		} else {
			firstNode = new Node( inValue, firstNode);
			numbOfNodes++;
		}
	} 
	public int pop() {
		if (numbOfNodes==0)  {
			System.out.println("ERROR trying to pop from empty stack return -999999999");
			return -999999999;
                }
		int retValue = firstNode.getValue(); 
		firstNode = firstNode.nextNode();
		numbOfNodes--;
		return retValue;
	}
	public boolean empty() {
		boolean isEmpty = false;
		if (numbOfNodes==0) 
			isEmpty = true;
		return isEmpty;
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
}

