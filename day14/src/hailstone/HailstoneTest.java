package hailstone;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
/**
 * PiJ day 14 Recusion II
 * 
 * 3 Hailstone numbers
 * 
 * JUnit tests
 *
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 * @since Jan 2015
 */
public class HailstoneTest {
		
	@Test
	public void testInput3Recursive() {
		/*
		 * https://www.math.hmc.edu/funfacts/ffiles/10008.5.shtml
		 * gives hailstone for 3 as 10, 5, 16, 8, 4, 2, 1
		 */
		Hailstone hailstone = new Hailstone(); 
		List<Integer> actual = hailstone.calculateRecursive(3);
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		/*
		 * great way of comparing Lists from
		 * http://stackoverflow.com/questions/3236880/assert-list-in-junit
		 * hamcrest rules!
		 */
		assertThat("Hailstone for input 3, recursive", actual, is(expected));
	}

	@Test
	public void testInput3Iterative() {
		Hailstone hailstone = new Hailstone();
		List<Integer> actual = hailstone.calculateIterative(3);
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		assertThat("Hailstone for input 3, iterative", actual, is(expected));
	}
	
	@Test
	public void testMemo() {
		Hailstone hailstone = new Hailstone(); 
		hailstone.setMemo(true);
		List<Integer> actual = hailstone.calculateRecursive(8);
		actual = hailstone.calculateRecursive(3);
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		assertThat("Hailstone for input 3, recursive", actual, is(expected));
	}
	
	

}
