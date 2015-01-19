package e02anagrams;

import java.util.ArrayList;
import java.util.List;

/**
 * PiJ day 14 Recusion II
 * 
 * 2
 * 
 * task: Anagrams
 * 
 * An anagram is a word created by recombination of the letters in another
 * words. Some anagrams make sense ("silent", "listen") and some do not
 * (“nietsl”). Some people only accepts “real” anagrams, but in this exercise we
 * will accept them all, even if they do not exist as real words. Write a class
 * with a static method that takes a String as a parameter and returns a list
 * (hint: you can use List<String> and ArrayList<String>) of strings with all
 * the anagrams that can be made with it.
 * 
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public class Recursive {
	/**
	 * 
	 * @param string
	 *            the input string
	 * @return a sorted list of the all non-real anagrams
	 */
	public static List<String> allNonRealAnagrams(String string) {
		// catch null input
		if (string == null) {
			return null;
		}
		List<String> retList = new ArrayList<String>();

		// trivial single item list for strings of length 1
		if (string.length() == 1) {
			retList.add(string);
		} else {
			retList.add("not yet implemented for strings longer than 1 character");
		}
		return retList;
	}
}
