package e04morepatients;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientTest {

	@Test
	public void testNegativeAge() {
		// test throwing exception as shown
		// http://stackoverflow.com/questions/156503/how-do-you-assert-that-a-certain-exception-is-thrown-in-junit-4-tests
		boolean thrown = false;
		try {
			Patient test = new Patient(2020, "test name");
		} catch (IllegalArgumentException ex) {
			thrown = true;
		}
		assertTrue("Constructor failed to throw a IllegalArgumentException "
				+ "for a patient born in 2020", thrown);
	}

	@Test
	public void testSupplyingAgeInsteadOfYear() {
		boolean thrown = false;
		try {
			Patient test = new Patient(0, "test name");
		} catch (IllegalArgumentException ex) {
			thrown = true;
		}
		assertTrue("Constructor failed to throw a IllegalArgumentException "
				+ " for a patient born in 0 - so 2015 years old!", thrown);
	}

}
