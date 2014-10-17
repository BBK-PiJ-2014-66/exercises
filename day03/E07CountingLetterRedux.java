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
 *	Keep a String lettersEntered and concate each letter 
 *	processed to it.  (A String can store arbitary number of
 *	characteris and we haven't done arrays or vectors)
 *
 *	The method numTimesChrInStr can then be use to check whether 
 *	the new character is already entered.
 *
 */
public class E07CountingLetterRedux{
	public static int  numTimesChrInStr( char myChr, String myStr) {
		int numTimes = 0;
		for (int cc = 0; cc < myStr.length()-1; cc++) {
			if (myChr == myStr.charAt(cc)) 
				numTimes++;
		}
		return numTimes;
	}
	public static void main(String[] args) {
		String lettersEntered="";
        	System.out.print("Please write a text: ");
        	String userText = System.console().readLine();
		while(true) {	// infinite loop must break
	 		System.out.print("Which letter would you like to count now? ");
			String strForLetter = System.console().readLine();
			if (strForLetter.length() != 1) {
			 	System.out.println("ERROR you must enter a single character. Try again");
				continue; // prompt again
			}
			char letter=strForLetter.charAt(0);
			/* N.B. normal java would use String method indexOf to check for the occurance 
			        of a character in a string:

                           if (lettersEntered.indexOf(letter) != -1) {
			
			   but we can reuse the method here */
                           if (lettersEntered.indexOf(letter) != -1) {
				System.out.println("Repeated character. Exiting the program...");
				break; // out of the infinite loop
			}
			System.out.println("There are "+ numTimesChrInStr( letter, userText) + " in your text.");
			lettersEntered += letter; // add this letter to the store
		}
		System.out.println("Thank you for your cooperation. Good bye!");
		
	}
}
		
