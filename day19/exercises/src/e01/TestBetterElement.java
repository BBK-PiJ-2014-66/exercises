package e01;
/**
 * Exercise 4: Generic version of "betterString" 
 * 
 * PiJ day 19 Work Sheet: Lambda Expressions
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 22 February 2015
 *
 */
public class TestBetterElement {
	public static void main( String args[]) {
		String test1 = "adam";
		String test2 = "Eve";
		System.out.println("1st test string: " + test1);
		System.out.println("2nd test string: " + test2);
		String longer = ElementUtils.betterElement(test1, test2, (s1,s2) -> s1.length() > s2.length());
		System.out.println("The longer string: " + longer);
		String second =  ElementUtils.betterElement(test1, test2, (s1,s2) -> false);
		System.out.println("The 2nd string: " + second);
		String lexi =ElementUtils.betterElement(test1, test2, (s1,s2) -> s2.compareTo(s1) > 0);
		System.out.println("The 1st string alphabetically: " + lexi);
		String lexiIC = ElementUtils.betterElement(test1, test2, (s1,s2) -> s2.compareToIgnoreCase(s1) > 0);
		System.out.println("The 1st string alphabetically ignoring case: " + lexiIC);
	}

}
