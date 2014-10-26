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
	public int getValue() {
		return myInt;
	}
	public void setValue( int inInt) {
		myInt = inInt;
	}
	public void prettyPrint() {
		System.out.print(myInt);
	}
	public boolean isEven() {
		if (myInt%2 == 0) 
			return true;
		return false;
	}
	public boolean isOdd() {
		return !isEven();
	}
	/* use @Override to make sure we override the Object method 
	   http://www.javapractices.com/topic/TopicAction.do?Id=223 */
	@Override 
	public String toString() {
		return "" + myInt;
	}

}
