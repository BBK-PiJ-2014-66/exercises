// Keith says import should avoid wildcards
// (and recommends vogel parameterized tests).
import org.junit.Test;
import static org.junit.Assert.assertEquals; 
import static org.junit.Assert.assertTrue; 
import static org.junit.Assert.assertFalse; 
import java.util.Random;
//import static HashUtilities;
/**
 * JUnit test for HashUtilies shortHash Method
 * 
 * @author Oliver Smart <osmart01@dcs.bbk.ac.uk>
 */
public class HashUtilitiesTest {

	@Test
	public void shortHashTest10returns10() {
		assertEquals("10 should be returned as 10",10,HashUtilities.shortHash(10));
	}
	
	@Test 
	public void shortHashTestRandomNumbers() { 
		Random rand = new Random();
		// told to try 2000 random numbers
		int nTest = 2000;
		int rmin = -9999;
		int rmax = 9999;
		int rangemax = HashUtilities.SHORTHASHMAX; // maximum number allowed
		for (int ic = 0; ic < nTest; ic++) {
			// random number method from 
			// http://stackoverflow.com/questions/363681/generating-random-integers-in-a-range-with-java
			int randomNum = rand.nextInt((rmax - rmin) + 1) + rmin;
			int myHash = HashUtilities.shortHash(randomNum);
			String descript = "shortHash("+ randomNum + ") returned number out of range = " + myHash;
			assertTrue(descript,myHash>0);
			assertFalse(descript + " > " + rangemax, myHash>rangemax);
		}
	}
	
	
	
	

}
