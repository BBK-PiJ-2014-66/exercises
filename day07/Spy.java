/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 10 Nov 2014
 *  
 * Day 7 Exercise 1 Instance counter
 *
 * task set:
 
Complete the example given in the notes with a class called Spy. Your class must have:
	* one and only one static variable, and int called spyCount.
	* an instance variable of type int for the spy’s ID.
	* a constructor method that receives the ID of the spy as an argument,
	  increases spyCount(int) by one, and prints on the screen the ID of 
	  this spy plus the total number of spies so far.
	* a die() method that prints on the screen "Spy XX has been detected and 
          eliminated" (where XX is the spy’s ID), decrements the spy counter and 
          prints on the screen the total number of spies so far.
	* a main method in which several objects of class Spy are created and some of
          them killed (their method die() is called).

Observe how the static variable is accessed by different objects both to increment and to decrement it.

 *
 * Initial thoughts
 *
 * Is spyCount the number of Spy's that exist at that time? Or the "total number of spies so far"?
 * As we are mean to decrement it then presumably the former.
 */
public class Spy {
	private static int spyCount = 0;
	public Spy(...) {
		spyCount++;
	// ...
	}
	public static int getNumberOfSpies() {
		return spyCount;
	}
	// ...
}
