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
 *      call it myChar
 *
 *	First task simple output the myChar on a line of its own
 *	using println. Assume in this case "letter" includes spaces
 *      and punctuation?
 *
 *	Second task:
 *      print myChar that are not "spaces" without a newline. 
 *      If myChar is a space output newline to terminate
 *	previous word.
 *      But if there are two or more "spaces" only process first one
 *	Must not forget to make sure last word output is terminated by
 *	a (single) newline
 *	
 *	A space is " " or \t or \n anything else that 
 *	Character.isWhitespace method picks up
 *
 * test with  
 * The 123  quick brown fox, jumps	over the lazy dog.
 */
public class E04LineToColumn {
	public static void main(String[] args) {
        	System.out.print("Please enter text to process: ");
        	String inStr = System.console().readLine();
		System.out.println("Your text with each character on a single line:");
		for (int cc=0; cc<inStr.length() ; cc++) {
			char inStrChar = inStr.charAt(cc);
			System.out.println(inStrChar);
		}
		System.out.println("Your text with each \"letter\" on a single line (digits, spaces and punctuation ignored):");
		for (int cc=0; cc<inStr.length() ; cc++) {
			char inStrChar = inStr.charAt(cc); 
			if (Character.isLetter(inStrChar))
				System.out.println(inStrChar);
		}
		System.out.println("Your text with each word on a separate line (a \"word\" is anything surrounded by whitespace): ");
		boolean previousSpace = true; // to avoid outputting initial newline if the text starts with a space
		for (int cc=0; cc<inStr.length() ; cc++) {
			char inStrChar = inStr.charAt(cc); 
			if (Character.isWhitespace(inStrChar)) {
				if (!previousSpace) System.out.println(); // newline to complete word
			 	previousSpace = true; 
  			}
			else {
				System.out.print(inStrChar);
			 	previousSpace = false;
			}
		}
		if (!previousSpace) System.out.println(); // newline to complete the last word
	
	}
}
