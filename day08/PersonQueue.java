/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 17 Nov 2014
 *  
 * Day 8 Exercise 1 Supermarket queue.
 *
 * The interface PersonQueue as given in the notes.
 */
public interface PersonQueue {
	/*
	 * Adds another person to the queue.
	 */
	void insert( Person person);	

	/*
	 * Removes a person from the queue.
	 */
	Person retrieve();
}
