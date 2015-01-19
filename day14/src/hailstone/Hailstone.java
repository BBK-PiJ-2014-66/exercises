package hailstone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	private boolean memo=false; // turn on memo
	private Map<Integer,List<Integer>> memoMap;
	
	Hailstone() {
		memoMap = new HashMap<Integer,List<Integer>>();
	}
	
	public void setMemo( boolean memo) {
		this.memo = memo;
	}
	
	/**
	 * Calculates a list of Hailstone numbers starting at iStart
	 * and ending when 1 is reached.
	 * 
	 * Recursive version
	 * 
	 * @param iStart starting integer
	 * @return the list of Hailstone integer;
	 */
	public List<Integer> calculateRecursive(Integer iStart) {
		if (iStart == null) // protect against null inpit
			return null;
        if (memo) {
        	if (memoMap.containsKey(iStart)) {
        		System.out.println("debug returning memo store for " + iStart);
        		return memoMap.get(iStart);
        	}
        }
		List<Integer> result = new ArrayList<Integer>();
		
		if (iStart != 1) {
			Integer next = (iStart%2 == 0 ) ? iStart/2 :  3*iStart + 1;
			result.add(next);
			result.addAll(calculateRecursive(next));
		}
		if (memo) { // if memoisation on the store the result 
			memoMap.put(iStart, result);
		}
		return result;
	}

	
	/**
	 * Calculates a list of Hailstone numbers starting at iStart
	 * and ending when 1 is reached.
	 * 
	 * Recursive version
	 * 
	 * @param iStart starting integer
	 * @return the list of Hailstone integer;
	 */
	public List<Integer> calculateIterative(Integer iStart) {
		if (iStart == null) // protect against null inpit
			return null;
		List<Integer> result = new ArrayList<Integer>();
		Integer iWork = iStart;
		while (iWork != 1) {
			iWork = (iWork%2 == 0 ) ? iWork/2 :  3*iWork + 1;
			result.add(iWork);
		}
		return result;
	}
	
}
