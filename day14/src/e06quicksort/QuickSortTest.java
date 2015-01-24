package e06quicksort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class QuickSortTest {


	@Test
	public void testIntegerListOnSheet() {

		List<Integer> integerList = new ArrayList<Integer>();
		integerList.addAll(Arrays.asList(3, 7, 2, 9, 1));
		QuickSort<Integer> qs = new QuickSort<Integer>();
		List<Integer> sortedList = qs.quickSort(integerList);

		Collections.sort(integerList);

		assertThat("Compare mergeSort() with Collections.sort()", sortedList,
				is(integerList));
	}
}
