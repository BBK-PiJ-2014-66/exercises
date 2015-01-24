package e05mergesort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * Tests for  MergeSort
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

}
