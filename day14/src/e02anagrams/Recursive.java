package e02anagrams;

import java.util.ArrayList;
import java.util.Collections;
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
			// split the first character from the string
			char firstChar = string.charAt(0);
			String strRest = string.substring(1);
			// find the anagrams of strRest by a recursive call to this function
			List<String> anaRest = allNonRealAnagrams(strRest);
			/*
			 * now we need to add in letter firstChar to each of the anagrams
			 * anaRest.
			 * 
			 * For instance if firstChar=A and anaRest = { BC, CB }
			 * 
			 * Need to add in A to BC get ABC, BAC, BCA
			 * 
			 * an add in A to CB to get CBA, CAB, CBA  
			 */
			for (String itAr : anaRest) {
				// first add before 1st character
				String formStr = firstChar+itAr;
				retList.add(formStr);
				for (int cc=0; cc < itAr.length(); cc++) {
					formStr = itAr.substring(0,cc+1) + firstChar;
					formStr += itAr.substring(cc+1);
					retList.add(formStr);
				}
			}
		}
		Collections.sort(retList); // sort return to facilitate testing
		return retList;

	}
}
