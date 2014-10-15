/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 8 Palindrome 
 *       Exercise 9 Palindrome creator
 *   and Exercise 10 Palindrome redux (*)
 *
 * tasks set:
 *	Exercise 8 Palindrome: Write a program that reads a text 
 *	and detects whether the text is a strict palindrome.
 *	
 * 	Exercise 9 Palindrome creator: Write a program that reads a 
 *      text and then writes on the screen a palindrome by writing 
 *	the same text followed by the same text in reversed order. 
 *	For example, if the user enters the text 
 *	"It was a dark and stormy night" the program must output 
 * 	"It was a dark and stormy nightthgin ymrots dna krad a saw tI”.
 * 
 *	Exercise 10 Palindrome redux: Write a program that reads a text 
 *	from the user and then says whether the text is a relaxed palindrome. 
 *	Relax palinmores ignores punctuation marks spaces, commas and upper/lower case
 *	Examples include
 *	"A man, a plan, a canal - Panama!" 
 *	"Was it a car or a cat I saw?"
 *	"Rise to vote, sir"
 *	Any strict Palindrome
 *
 *  @author Oliver S. Smart
 *
 * Initial thoughts
 *  do all three tasks in a single program. They are similar.
 *
 *  8:could do palindrome check by doing a character by character check 
 *  starting from both ends of the string. 
 *  But to because of the other tasks it is much easier to write a 
 *  reverseString(inStr) method. then use inStr.equals(reverseString(inStr));
 *
 *  9: Simple use the reverseString(inStr) method from 8 output 
 *	inStr + reverseString(inStr) 
 *
 * 10: Write a method stripPunctation(inStr) and use java str.toLowerCase() method
 *     stripLowerCaseStr = stripPunctation(inStr.toLowerCase());
 *     relaxed palindrome if stripPlow.equals(reverseString(stripPlow))
 */

public class E08toE10Palindromes {
	public static String reverseString( String inStrng) {
		String reversedStrng = "";
		for (int cc= inStrng.length()-1; cc>=0; cc--) 
			reversedStrng += inStrng.charAt(cc);
		return reversedStrng; 
	}
	public static String stripPunctation( String inStrng) {
		String stripStrng = "";
		for (int cc=0; cc<inStrng.length(); cc++) {
			char myChr = inStrng.charAt(cc);
			if (Character.isLetter(myChr))
				stripStrng += myChr;
		}
		return stripStrng;
	}
	public static boolean isPalindrome( String inStrng) {
		if (inStrng.equals(reverseString(inStrng)))
			return true;
		else
			return false;
	}
	public static boolean isRelaxedPalindrome(String inStrng) {
		String stripLowerCaseStr = stripPunctation(inStrng.toLowerCase());
		return isPalindrome(stripLowerCaseStr);
	}
	public static void main(String[] args) {
			System.out.print("Please enter text for palindrome check/creation/relaxed check: ");
			String inStr = System.console().readLine();

			System.out.println("\nExercise 8 Palindrome check:");
			String notOrNull = isPalindrome(inStr) ? "" : "NOT ";
			System.out.println("Your text is " + notOrNull + "a strict palindrome");

			System.out.println("\nExercise 9 Palindrome creator:");
		 	String palindrome=inStr;		
			// only add reversed string if the string is not already a palindrome
			if (!isPalindrome(palindrome)) 
				palindrome += reverseString(inStr);
			System.out.println(palindrome);
			
			System.out.println("\nExercise 10 relaxed Palindrome check:");
			notOrNull = isRelaxedPalindrome(inStr) ? "" : "NOT ";
			System.out.println("Your text is " + notOrNull + "a relaxed palindrome");
	}
}
