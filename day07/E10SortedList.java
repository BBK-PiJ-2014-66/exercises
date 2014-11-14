/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date from 14 Nov 2014
 *  
 * Day 7 Exercise 10 A sorted list
 *
 * Task set:

Create a linked list of integers that is automatically sorted.  Everytime you
add an element, make sure you introduce it at the right place in the queue so
that the queue is always sorted from lower to higher numbers.  Create the list,
insert several numbers into it (around 15 is fine) and then go through the list
printing the value of each element. Check that the elements are correctly
sorted.

 * My thoughts:
 * Create a method arrayToSortedLinkedList based on exercise 9 method.
 * Instead of a "push" to end of the list this should insert the value in the 
 * appropriate place.
 */
