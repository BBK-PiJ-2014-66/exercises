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
		List<O> result; // to be returned
		int inSize = inList.size();
		if (inSize < 2) {
			result = new ArrayList<O>(inSize);
			// list has one or zero elements simply return a copy of the original
			for (O itO : inList) {
				result.add(itO);
			}
		} else {
			System.out.println("debug MergeSort needs to sort list " + inList);
			// need to split the list into two sublists of ~equal size
			List<O> subListA = inList.subList(0,(inSize+1)/2);
			List<O> subListB = inList.subList((inSize+1)/2,inSize);
			System.out.println("debug split into " + subListA + " and " + subListB);
			// now sort each subList
			List<O> sortListA = this.mergeSort(subListA);
			List<O> sortListB = this.mergeSort(subListB);
	        // Need to Merge the two sorted sublist ("integration" stage).
			result = this.merge(sortListA, sortListB);
		}
		return result;
	}
	
	/**
	 * merges two already sorted lists so result is sorted 
	 * @param listA first sorted list
	 * @param listB
	 * @return the resulting sorted list
	 */
	protected List<O> merge( List<O> listA, List<O> listB) {
		return null;
	}

}