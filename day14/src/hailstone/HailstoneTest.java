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
	public void testInput3() {
		/*
		 * https://www.math.hmc.edu/funfacts/ffiles/10008.5.shtml
		 * gives hailstone for 3 as 10, 5, 16, 8, 4, 2, 1
		 */
		List<Integer> actual = Hailstone.calculateIterative(3);
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		/*
		 * great way of comparing Lists from
		 * http://stackoverflow.com/questions/3236880/assert-list-in-junit
		 * hamcrest rules!
		 */
		assertThat("Hailstone for input 3", actual, is(expected));
	}

}
