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
		int inStrLength = inStr.length();
		if (inStrLength<=1)  // have got down to zero or one characters
			return true; // it is a palindrome 

		char firstChar = inStr.charAt(0);
		char lastChar = inStr.charAt(inStrLength-1);
		if (firstChar != lastChar)  // not a palindrome as 1st and last characters differ
			return false; 

		String cutOutFirstAndLast =  inStr.substring(1,inStrLength-1);
		return isPalindromeRecursive(cutOutFirstAndLast);
	}

	public static void main(String[] args) {
		System.out.println("test isPalindromeRecursive(\"radar\")= " + isPalindromeRecursive("radar"));
		System.out.println("test isPalindromeRecursive(\"step on no pets\")= " + isPalindromeRecursive("step on no pets"));
		System.out.println("test isPalindromeRecursive(\"step on pets\")= " + isPalindromeRecursive("step on pets"));
	}
}
