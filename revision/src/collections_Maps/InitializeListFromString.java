package collections_Maps;

import java.util.Arrays;
import java.util.List;

/** 
 * how to simply initialise a list of letters of the alphabet
 * @author osmart
 *
 */
public class InitializeListFromString {

	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvxyz";
		List<String> letters = Arrays.asList(alphabet.split(""));
		System.out.println("List letters = " + letters);
	}

}
