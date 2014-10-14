/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 4 Line to column
 * task set:
 * 	Write a program that reads some text from the user and then 
 *	writes the same text on screen, but each letter on a 
 * 	different line.
 *
 *	Now modify your program to write each word 
 *	(as defined by spaces) rather than letter on a different 
 *	line.
 *
 *  @author Oliver S. Smart
 *
 *  Initial thoughts
 *  	"text" is assumed to be a text string so prompt as per
 *	normal
 *
 * 	Use for loop with String str.length() and String 
 *	str.Atchar() to go thru' string character by character
 *      call it imyChar
 *
 *	First task simple output the myChar on a line of its own
 *	using println
 *
 *	Second task:
 *      print myChar that are not "spaces" without a newline. 
 *      If myChar is a space output newline to terminate
 *	previous word.
 *      But if there are two or more "spaces" only process first one
 *	Must not forget to make sure last word output is terminated by
 *	a (single) newline
 *	
 *	A space is " " or \t
 *
 */
