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
	public void push( int inValue) { // verbose - says what it does
		System.out.println("Pushing " + inValue);
		pushSilent(inValue);
	}
        public void pushSilent( int inValue) { // adds to right hand side of the list (silent)
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
	public void insertInOrder( int inValue) { // add in order - small to large
		if (firstNode == null) {
			firstNode = new Node(inValue);
			lastNode = firstNode;
			numbOfNodes = 1;
		} else if (inValue < firstNode.getValue()) { // smallest yet - add to left
			unshift( inValue);	
		} else if (inValue > lastNode.getValue()) { // largest yet - add to right
			pushSilent( inValue);
		} else {
			//System.out.println("Debug insert " + inValue + " into list:"); printList();
			orderedInsertAfter( firstNode, inValue);
			//System.out.println("Debug after the insertion list is "); printList();
		}
	}
	public void orderedInsertAfter( Node inNode, int inValue) { // inserts after if inValue is in between this and next
		if (inNode.getValue()<=inValue && inValue <= inNode.nextNode().getValue()) {
			//System.out.println("Debug insert " + inValue + " inbetween " + inNode.getValue() + " and " + inNode.nextNode().getValue());
			Node newNode = new Node(inValue, inNode.nextNode());
			inNode.setNextNode(newNode);
			numbOfNodes++;
		}
		else {
			orderedInsertAfter( inNode.nextNode(), inValue);
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

	public static ListUtilities arrayToLinkedList( int inArray[]) {
		ListUtilities newLinkedList = new ListUtilities();	
		for (int ac = 0; ac < inArray.length; ac++) {
			newLinkedList.pushSilent(inArray[ac]);
		}
		return newLinkedList;
	}

  	public static ListUtilities arrayToSortedLinkedList( int inArray[]) {
		ListUtilities newLinkedList = new ListUtilities();	
		for (int ac = 0; ac < inArray.length; ac++) {
			newLinkedList.insertInOrder(inArray[ac]);
		}
		return newLinkedList;
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
