/**
 * 7 Final means no change
 * 
 * Create a class that extends String and adds a method printEven() that prints
 * on screen the even-numbered characters of the string. Try to compile it and
 * see what happens.
 * 
 */
public class FinalMeansNoChange7 extends String {
	public void printEven() {
		// do not know that the string in String is called! so difficult to write
		// assume it to be string String string = "1234567890";
		for (int sc = 1; sc < string.length() ; sc += 2) {
			System.out.print(string.charAt(sc));
		}
		System.out.println();
	}
}
