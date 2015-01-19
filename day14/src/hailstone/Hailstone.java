package hailstone;

import java.util.ArrayList;
import java.util.List;

/**
 * PiJ day 14 Recusion II
 * 
 * 3 Hailstone numbers
 * 
 * task:
 * 
 * The sequence hailstone numbers is defined as follows:
 * 
 * If the number n is even, the next number is n/2
 * 
 * If the number is odd, the next number is 3n + 1
 * 
 * It is thought that this sequence always converges to 1 (this is the Collatz
 * conjecture, not demonstrated yet). Write a method that returns a list of
 * integers (hint: you can use List<Integer> and ArrayList<Integer>) with the
 * sequence of hailstone numbers that starts at some given natural number
 * provided by the user.
 * 
 * When list hits 1 terminate
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public class Hailstone {
	/**
	 * Calculates a list of Hailstone numbers starting at iStart
	 * and ending when 1 is reached.
	 * 
	 * Recursive version
	 * 
	 * @param iStart starting integer
	 * @return the list of Hailstone integer;
	 */
	public static List<Integer> calculateRecursive(Integer iStart) {
		if (iStart == null) // protect against null inpit
			return null;
		List<Integer> result = new ArrayList<Integer>();
		
		if (iStart != 1) {
			Integer next = (iStart%2 == 0 ) ? iStart/2 :  3*iStart + 1;
			result.add(next);
			result.addAll(calculateRecursive(next));
		}
		return result;
	}
	
	

}
