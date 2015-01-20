package hailstone;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

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
		 * https://www.math.hmc.edu/funfacts/ffiles/10008.5.shtml gives
		 * hailstone for 3 as 10, 5, 16, 8, 4, 2, 1
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
	public void testMemoRecursive() {
		// check that memo reduces number of calculations needed
		// if have already found hailstone number in the sequence
		Hailstone hailstone = new Hailstone();
		hailstone.setMemo(true);
		// 8 is one of the numbers in the sequence for 3
		List<Integer> sequence = hailstone.calculateRecursive(8);
		hailstone.resetCounter(); // reset calculation counter
		sequence = hailstone.calculateRecursive(3);
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		assertThat("Hailstone(3), memo recursive", sequence, is(expected));
		
		int nCalcMemo = hailstone.getCounter(); // number of calcs
		int nCalcNon = sequence.size(); // number with no memo
		assertThat("Memoisation should reduce the number of calcs\n"
				+ "       needed for Hailstone(3) having already found Hailstone(8)\n"
				+ "       Testing Recursive version\n"
				+ "       Checking Ncalcs with memo, Ncalcs without memo.",
				nCalcMemo, not(nCalcNon));

	}

	@Test
	public void testMemoIterative() {
		Hailstone hailstone = new Hailstone();
		hailstone.setMemo(true);
		List<Integer> sequence = hailstone.calculateIterative(8);
		hailstone.resetCounter(); 
		sequence = hailstone.calculateIterative(3);
		// check actual values are correct
		List<Integer> expected = Arrays.asList(10, 5, 16, 8, 4, 2, 1);
		assertThat("Hailstone(3), memo Iterative", sequence, is(expected));
		int nCalcMemo = hailstone.getCounter(); 
		int nCalcNon = sequence.size(); 
		assertThat("Memoisation should reduce the number of calcs\n"
				+ "       needed for hailstone(3) having already found hailstone(8)\n"
				+ "       Testing Iterative version\n"
				+ "       Checking Ncalcs with memo, Ncalcs without memo.",
				nCalcMemo, not(nCalcNon));
	}

	@Test
	public void testMemoIterative2() {
		// as before but swap 8 and 3
		Hailstone hailstone = new Hailstone();
		hailstone.setMemo(true);
		List<Integer> sequence = hailstone.calculateIterative(3);
		hailstone.resetCounter(); 
		sequence = hailstone.calculateIterative(8);
		// check actual values are correct
		List<Integer> expected = Arrays.asList( 4, 2, 1);
		assertThat("Hailstone(8), memo Iterative", sequence, is(expected));
		int nCalcMemo = hailstone.getCounter(); 
		int nCalcNon = sequence.size(); 
		assertThat("Memoisation should reduce the number of calcs\n"
				+ "       needed for hailstone(8) having already found hailstone(3)\n"
				+ "       Testing Iterative version\n"
				+ "       Checking Ncalcs with memo, Ncalcs without memo.",
				nCalcMemo, not(nCalcNon));
	}

}
