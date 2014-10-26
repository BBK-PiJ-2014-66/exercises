/* 
 * Birbeck MSc Computer Science PiJ Exercsies 
 * author Oliver S. Smart
 * date   from 26 Sept 2014
 *  
 * Day 4 Exercise 7 Integer
 *
 * task set:
 * 	Create your own version of boxed int! Create a class Integer2 
 *	with only one field (int value) and the following methods:
 *	getValue(): returns the value of this number as an int, a getter.
 * 	setValue(int): a setter.
 * 	isEven(): returns true if the number is even, false otherwise.
 * 	isOdd(): the opposite.
 * 	prettyPrint(): prints the value of the integer on the screen.
 * 	toString(): returns a String equivalent to the number.
 *
 * then given test code 
 *
 * Initial thoughts
 *	test code given is interactive and requires all methods
 *
 */
class Integer2 {
	private int myInt;
	int getValue() {
		return myInt;
	}
	void setValue( int inInt) {
		myInt = inInt;
	}
	void prettyPrint() {
		System.out.print(myInt);
	}
}
