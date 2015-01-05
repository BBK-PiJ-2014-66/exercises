/**
 * 
 * getInitials method from d12.pdf page 3.
 * 
 * @author PiJ 
 * 
 */
public class Person {
	public String getInitials(String fullName) {
		String result = "";
		String[] words = fullName.split(" ");
		for (int i = 0; i < words.length; i++) {
			String nextInitial = "" + words[i].charAt(0);
			result = result + nextInitial.toUpperCase();
		}
		return result;
	}
}