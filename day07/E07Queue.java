/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 12 Nov 2014
 *  
 * Day 7 Exercise 7 Queues (*)
 * Task set:

A queue is a dynamic structure that implements these methods:

	insert(...) inserts an element at the beginning of the queue.
	retrieve(...) remove an element from the end of the queue.
	size() returns the current size of the queue.

Queues are heavily used in computing: communication buffers, incoming request to web servers, read/write
requests to hard disks, etc.

Implement a queue of integers. This could represent requests to a hard drive to read from different sectors.

Implement the three methods listed above.

Then write another class that creates a queue, and makes several insert(), retrieve(), and size() calls.
Check that the values you get are consistent. The output of the program could look like this:

	There are 0 requests in the queue.
	Inserting request 5...
	Inserting request 8...
	Inserting request 12...
	There are 3 requests in the queue.
	Retrieving request 5... done.
	Inserting request 13...
	There are 3 requests in the queue.
	Retrieving request 8... done.
	Retrieving request 12... done.
	There are 2 requests in the queue.
	Retrieving request 13... done.
	etc...
 *
 * My thoughts. Use ListUtilies class that already does Stack...
 * The task says that you add a new element at the begining of a queue and retrieve 
 * a new element from the end.
 * This seems the wrong way around normally join the end of a queue and take from the start?
 * So lets implement:
 *	insert() method add elements to the right (wrap existing push)
 *	retrieve() method take elements from the left (wrap existing shift) 
 *	size() new method 
 *
 */
public class E07Queue{
	private static void printNumberRequests( ListUtilities inQueue) {
		System.out.println("There are " + inQueue.size() + " requests in the queue.");
	}
	public static void main( String[] args) {
		ListUtilities queue = new ListUtilities();
		printNumberRequests(queue); 
		queue.insert(5);
		queue.insert(8);
		queue.insert(12);
		printNumberRequests(queue); 
		System.out.println("Retrieving first request in the queue, value= " + queue.retrieve());
		queue.insert(13);
		printNumberRequests(queue); 
		System.out.println("Retrieving first request in the queue, value= " + queue.retrieve());
		System.out.println("Retrieving first request in the queue, value= " + queue.retrieve());
		printNumberRequests(queue); 
		System.out.println("Retrieving first request in the queue, value= " + queue.retrieve());
	}
}
