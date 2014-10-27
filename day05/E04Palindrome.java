/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 27 Sept 2014
 *  
 * Day 5 Exercise 4 Palindrome
 *
 * task set:
 * 
 * 	Create a program with a (recursive) method that takes a String paremeter and
 * 	returns true if the String is a palindrome and false otherwise. Compare this
 * 	recursive version with the iterative version you wrote in past weeks.  Which
 * 	one seems clearer to you?
 * 	
 *
 * Initial thoughts
 *
 */


public class E04Palindrome{
	public static boolean isPalindromeRecursive( String inStr) {
		System.out.println("debug call to isPalindromeRecursive with \"" + inStr + "\"");
		// want to get the first and last character
		int inStrLength = inStr.length();
		if (inStrLength<=1) // have got down to 1 or two characters
			return true;

		char firstChar = inStr.charAt(0);
		char lastChar = inStr.charAt(inStrLength-1);
		System.out.println("debug inStrLength="+ inStrLength + " firstChar=" + firstChar + " lastChar= " + lastChar);
		if (firstChar != lastChar) {
			return false;
		} else {
			String cutDown =  inStr.substring(1,inStrLength-1);
			System.out.println("debug cutDown = \""+ cutDown + "\"");
			return isPalindromeRecursive(cutDown);
		}
	}

	public static void main(String[] args) {
		System.out.println("test isPalindromeRecursive(\"radar\")= " + isPalindromeRecursive("radar"));
		System.out.println("test isPalindromeRecursive(\"step on no pets\")= " + isPalindromeRecursive("step on no pets"));
		System.out.println("test isPalindromeRecursive(\"step on pets\")= " + isPalindromeRecursive("step on pets"));
	}
}
