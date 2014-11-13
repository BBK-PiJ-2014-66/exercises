/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 12 Nov 2014
 *  
 * Day 7 Exercise 7 Queues (*)
 * Task set:

A queue is a dynamic structure that implements these methods:

	insert(...) inserts an element at the beginning of the queue.
	retrieve(...)
	remove an element from the end of the queue.
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
 */
public class E07Queue{
}
