package e05mergesort;

import java.util.ArrayList;
import java.util.List;

/**
 * PiJ day 14 Recusion II
 * 
 * 5 Merge Sort
 * 
 * task:
 * 
 * Mergesort is a popular sorting algorithm that employs a divide-and-conquer
 * strategy. You can implement a Merge- sort for lists by following the
 * following steps: Subproblem: If the list contains 0 or 1 element, it is
 * sorted and you can return it. If not, then divide the list into two lists of
 * the same length (± 1). Then sort the lists (i.e. apply mergesort to each
 * sublist). Integration: When both sublists are returned sorted, check the
 * first element of both sublists; remove the one that comes first (e.g. the
 * lowest integer of the two) and add it to the result list. Repeat this process
 * until all elements in both sublists have been added to the result list.
 * Return the result list.
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since 23 Jan 2015
 */
public class MergeSort<O> {

	/**
	 * applies Merge Sort sorting
	 * 
	 * @param inList
	 *            the input unsorted list (not altered)
	 * @return a new sorted list of the objects in inLists
	 */
	public List<O> mergeSort(List<O> inList) {
		int inSize = inList.size();
		List<O> result = new ArrayList<O>(inSize);
		if (inSize < 2) {
			// list has one or zero elements simply return a copy of the original
			for (O itO : inList) {
				result.add(itO);
			}
		} else {
			System.out.println("debug MergeSort needs to sort list " + inList);
			return null;
		}
		return result;
	}

}
