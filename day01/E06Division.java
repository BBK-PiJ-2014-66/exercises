/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Week 1 Exercise 6 Division
 * Write a program that requests two numbers from the user and then outputs the
 * quotient and the remainder, e.g. if the user enters 7 and 3, your program should
 * output something like “7 divided by 3 is 2, remainder 1”. You cannot use the
 * “/” or “%” operators.
 * 
 *  @author Oliver S. Smart
 */

public class E06Division {
	public static void main(String[] args) {
                // lets be good no methods do all in main
                System.out.print("Please enter the 1st integer number: ");
                int numa =  Integer.parseInt(System.console().readLine());
                System.out.print("Please enter the 2nd integer number: ");
                int numb =  Integer.parseInt(System.console().readLine());

		// protect against divide by zero
		if (numb==0) {
			System.out.println(numa + " divided by " + numb + " is infinity"); 
		}
		else {
                	boolean lSignsDiffer=false; // set true if numa and numb have difference signs
                	if (numa < 0) lSignsDiffer = (!lSignsDiffer);
                	if (numb < 0) lSignsDiffer = (!lSignsDiffer);
             
                	// method is to start the "remainder" at numa and subtract numb repeatedly 
                	// until the "remainder" is less than numb.
                	int remainder = (numa<0) ? -numa : numa; // absolute value of numa
                	int absnumb = (numb < 0) ? -numb : numb; // absolute value of numb
                	int quotient=0;
                	while( remainder > absnumb) {
				remainder -= absnumb;
				quotient++;
			}
                	if (lSignsDiffer) 
				quotient = -quotient;
			if (numa<0)
                        	remainder = -remainder;
			System.out.println(numa + " divided by " + numb + " is " + 
                                   	quotient + ", remainder " + remainder);
		}

		//System.out.println("debug to just to check numa/numb= " + numa/numb + " numa%numb= " + numa%numb);
	}
}
