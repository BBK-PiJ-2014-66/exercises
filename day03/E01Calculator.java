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
		boolean displayMenu=true;
		double numberA=-1E12, numberB=-1E12; 
		while(true) { // getting user input
			// initialize to weird numbers to avoid javac complaint
			if (!gotNumbers) {
                		System.out.print("Please enter 1st decimal number: ");
                		String inStr = System.console().readLine();
				if (inStr.length()==0) continue; 
				numberA = Double.parseDouble(inStr);


                		System.out.print("Please enter 2nd decimal number: ");
                		inStr = System.console().readLine();
				if (inStr.length()==0) continue; 
				numberB = Double.parseDouble(inStr);
				gotNumbers = true;
			}
			else if (displayMenu) {
				// main menu
                		System.out.println("Now choose operation to perform: ");
                		System.out.println("\tEnter \"+\" for addition");
                		System.out.println("\tEnter \"-\" for subtraction");
                		System.out.println("\tEnter \"*\" for multiplication");
                		System.out.println("\tEnter \"/\" for division");
                		System.out.println("\tEnter \"r\" to enter new numbers");
                		System.out.println("\tEnter \"s\" to stop program");
				displayMenu = false;
			}
			else { // prompt and read response
                		System.out.print("Please enter your choice <display menu>: ");
                		String inStr = System.console().readLine();
				if (inStr.length()==0) {
					displayMenu = true;
					continue; 
				}
                		char choice = inStr.charAt(0);
	
				if (choice == '+') {
                			System.out.println( "\t" + numberA + "  + " + numberB + " = " + (numberA+numberB));
				}
				else if (choice == '-') {
                			System.out.println( "\t" + numberA + "  - " + numberB + " = " + (numberA-numberB));
				}
				else if (choice == '*') {
                			System.out.println( "\t " +numberA + "  * " + numberB + " = " + (numberA*numberB));
				}
				else if (choice == '/') {
					if (numberB!=0) {
                				System.out.println( "\t " +numberA + "  / " + numberB + " = " + (numberA/numberB));
					}
					else {
                				System.out.println( "\tERROR cannot divide by zero");
					}
				}
				else if (choice == 'r') {
					gotNumbers = false;
				}
				else if (choice == 's') {
					break;
				}
				else {
					System.out.print("u0007"); // bell character 	
					System.out.println( "\tInvalid response try again");
				}
			}
			
		}
		
	}
}

