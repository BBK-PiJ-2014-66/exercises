package e05mergesort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Tests for MergeSort
 * 
 */
public class MergeSortTest {

	@Test
	public void testIntegerListWithOneEntry() {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);

		// my sort
		MergeSort<Integer> ms = new MergeSort<Integer>();
		List<Integer> sortedList = ms.mergeSort(integerList);

		// standard sort
		Collections.sort(integerList);

		assertThat("Compare mergeSort() with Collections.sort()", sortedList,
				is(integerList));
	}

	@Test
	public void testIntegerListWithTwoEntries() {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(2);
		integerList.add(1);

		// my sort
		MergeSort<Integer> ms = new MergeSort<Integer>();
		List<Integer> sortedList = ms.mergeSort(integerList);

		// standard sort
		Collections.sort(integerList);

		assertThat("Compare mergeSort() with Collections.sort()", sortedList,
				is(integerList));
	}

	@Test
	public void testIntegerListOnSheet() {

		List<Integer> integerList = new ArrayList<Integer>();
		/*
		 * Follow
		 * http://stackoverflow.com/questions/1005073/initialization-of-an
		 * -arraylist-in-one-line
		 */
		integerList.addAll(Arrays.asList(3, 7, 2, 9, 1));
		// my sort
		MergeSort<Integer> ms = new MergeSort<Integer>();
		List<Integer> sortedList = ms.mergeSort(integerList);

		// standard sort
		Collections.sort(integerList);

		assertThat("Compare mergeSort() with Collections.sort()", sortedList,
				is(integerList));
	}

	@Test
	public void testMerge() {
		List<Integer> listA = new ArrayList<Integer>(Arrays.asList(1, 3));
		List<Integer> listB = new ArrayList<Integer>(Arrays.asList(2, 4, 5));
		List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 2, 3,
				4, 5));
		MergeSort<Integer> ms = new MergeSort<Integer>();
		List<Integer> actual = ms.merge(listA, listB);
		assertThat("merge " + listA + " with " + listB, actual, is(expected));

	}
}
