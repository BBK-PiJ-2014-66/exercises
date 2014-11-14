/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 14 Nov 2014
 *  
 * Day 7 Exercise 9 From array to list
 *
 * Task set:

Create a static method that takes an array of integers and returns a linked
list of integers in the same order as the original array. You can put this
method in a class called ListUtilities so that you can easily use it for the
following exercises.

Initialising an array with 15-20 elements is very easy with
curly-brackets-notation, so it is common to create an array and then convert it
into a dynamic structure automatically.


 * My thoughts:
 * (On reflection) Have to return a new object so create it in the class,
 * using existing push method to add each element of the array in turn.
 */
public class E09ArrayToList {
	public static void main( String[] args) {
		int[] myArray = { 1, 3, 5, 7, 6, 5, 4, 2, 8, 15, 14, 9, 13, 
                                  10, 12, 11, -1000, 2000, -3000, 4000, -5000};
	     	ListUtilities myLinkedList = ListUtilities.arrayToLinkedList(myArray);
		myLinkedList.printList();
	}
}

