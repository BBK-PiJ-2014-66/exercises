/* 
 * Birbeck MSc Computer Science PiJ coursework From September 2014
 *  
 * Day 3 Exercise 1 Calculator
 * task set:
 *    Write a program that reads two numbers from the user and then offers a 
 *    menu with the four basic operations: addition, subtraction, 
 *    multiplication, and division. Once the user has selected an operation
 *    from the menu, the calculator performs the operation.
 * 
 *    Hint: In the same way that there exists an Integer.parseInt() method 
 *    to parse integers, there is a Double.parseDouble() method to parse 
 *    real numbers.
 *
 *  @author Oliver S. Smart
 *
 *  Initial thoughts
 * (a) has to be interactive
 * (b) task does not decribe what to after the calculator performs
 *     the operation. But as it is a "menu" lets allow another operation.
 * (c) User can terminate program by hitting enter at any prompt
 * (d) User could even change the numbers
 *
 * meant not to use methods, will not catch exceptions for instance entering non-number 
 * at number prompt
 *
 */
class E01Calculator {
        public static void main(String[] args) {
		boolean gotNumbers=false;
		while(true) { // getting user input
			double numberA, numberB; 
			if (!gotNumbers) {
                		System.out.print("Please enter 1st decimal number <stop program>: ");
                		String inStr = System.console().readLine();
				if (inStr.length()==0) break; 
				numberA = Double.parseDouble(inStr);

                		System.out.print("Please enter 2nd decimal number <stop program>: ");
                		inStr = System.console().readLine();
				if (inStr.length()==0) break; 
				numberB = Double.parseDouble(inStr);
                		System.out.println("Debug numberA= " + numberA + " numberB= " + numberB);
				gotNumbers = true;
			}
			// main menu
                	System.out.println("Now choose operation to perform: ");
                	System.out.println("\tEnter \"+\" for addition");
                	System.out.println("\tEnter \"-\" for subtraction");
                	System.out.println("\tEnter \"*\" for multiplication");
                	System.out.println("\tEnter \"/\" for division");
                	System.out.println("\tEnter \"r\" to enter new numbers");
                	System.out.println("\tor just hit \"Enter\" key to stop program");
                	System.out.print("Please enter your choice <stop program>: ");

			
			break; // temporary
		}
		
	}
}

