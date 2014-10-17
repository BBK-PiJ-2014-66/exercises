/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 7 Counting letters redux (*)
 * task set:
 *	Write a program that reads a text from the user and then 
 *	enter a loop of requesting letters and counting them.
 *	The program stops if the user asks for the same letter 
 *	twice. This is an example of the output of such a program
 *	(with a rather short and boring text):
 *
 * 	    Please write a text: It was a dark and stormy night
 *          Which letter would you like to count now? a
 *          There are 6 in your text.
 *          Which letter would you like to count now? s
 *          There are 3 in your text.
 *          Which letter would you like to count now? u
 *          There are 0 in your text.
 *          Which letter would you like to count now? a
 *          Repeated character. Exiting the program...
 *          Thank you for your cooperation. Good bye!
 *
 *  @author Oliver S. Smart
 *
 * Thoughts
 *	Write a method numTimesChrInStr to do the counting of the 
 *	letter in a string.
 *
 * 	Only accept single character reply to 
 *	"Which letter would you like to count now?"
 *	give error message for anything else (like enter)
 *
 *	Keep a String letterEntered and concate each letter 
 *	processed to it.  (A String can store arbitary number of
 *	characteris and we haven't done arrays or vectors)
 *
 *	The method numTimesChrInStr can then be use to check whether 
 *	the new character is already entered.
 *
 */
