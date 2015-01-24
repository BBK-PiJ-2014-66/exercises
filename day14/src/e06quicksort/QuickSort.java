package e06quicksort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * PiJ day 14 Recusion II
 * 
 * 6 Quicksort
 * 
 * task:
 * 
 * Quicksort is another sorting algorithm that also employs a divide-and-conquer
 * strategy. It works well in most usual computers because of the low-level
 * interactions between registers and the main memory, which make it very
 * popular and widely used.
 * 
 * 
 * You can implement a Mergesort for lists by following the following steps:
 * 
 * Initial action: If the list contains 0 or 1 element, it is sorted and you can
 * return it. Otherwise, choose one element as “pivot” (usually the first one).
 * 
 * 
 * Subproblem: Divide the list into two lists: the first list contains the
 * elements before the pivot (e.g. the integers lower than the pivot) and the
 * second one contains the elements after the pivot. Then sort both lists (i.e.
 * apply quicksort to each sublist, choosing a new pivot, etc).
 * 
 * Integration: When both sublists are returned sorted, simply concatenate them
 * (first list, then pivot, then second list) and return the result.
 * 
 * 
 * N.B. follow Goodrich and Tamassia page 501 by making 3 lists rather than two
 * less, same and more as this seems sensible
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 23 Jan 2015
 */
public class QuickSort<O extends Comparable<O>> {

	/**
	 * applies Quick Sort sorting very much not in place
	 * 
	 * @param inList
	 *            the input unsorted list (not altered)
	 * @return a new sorted list of the objects in inLists
	 */
	public List<O> quickSort(List<O> inList) {
		System.out.println("debug call to quickSort with " + inList);
		List<O> result; // to be returned
		int inSize = inList.size();
		result = new ArrayList<O>(inSize);
		if (inSize < 2) {
			// list has one or zero elements simply return a copy of the
			// original
			for (O itO : inList) {
				result.add(itO);
			}
		} else {
			// create 3 lists
			List<O> lessList = new ArrayList<O>();
			List<O> sameList = new ArrayList<O>();
			List<O> moreList = new ArrayList<O>();
			Iterator<O> it = inList.iterator();
			O pivot = it.next(); // the first item
			sameList.add(pivot);
			while (it.hasNext()) {
				O item = it.next();
				int compareTo = item.compareTo(pivot);
				if (compareTo < 0) {
					lessList.add(item);
				} else if (compareTo == 0) {
					sameList.add(item);
				} else {
					moreList.add(item);
				}
			}
			// sort the lessList and moreList - no need to sort sameList
			lessList = this.quickSort(lessList);
			moreList = this.quickSort(moreList);
			// cat the 3 lists into result
			result.addAll(lessList);
			result.addAll(sameList);
			result.addAll(moreList);
		}
		System.out.println("debug quickSort for " + inList + " returns "
				+ result);
		return result;
	}

}
