/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author: Oliver S. Smart
 * date:   from 24 Nov 2014
 *  
 * Day 9 Exercise 5.1 Integer Binary Tree
 *
 * One of the learning objectives is to use Interfaces 
 * So this is an interface for the the "Integer Binary Tree"
 * we are storing a list of integers in the tree so call 
 * the interface IntegerList.
 */
public interface IntegerList{
        /*
         * add a number num to the list
         */
	public void add( int num); 
	/*
         * check whether the list contains the a number.
	 */
	public boolean contains( int num); // returns true if num in list
	/*
         * getMax finds the maxium number in the list and getMin the minimum.
         * not sure what to do if the list does not contain any numbers!
         */
	public int getMax(); 
	public int getMin();

	/* 
         * provides some kind of a string version of the complete list
	 */
	public String toString();

	/*
         * provides information about the list - number of entries 
         */
	public String information();
}
