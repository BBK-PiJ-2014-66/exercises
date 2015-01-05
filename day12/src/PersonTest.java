import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * JUnit Tests of getInitials method from d12.pdf page 4.
 * 
 * @author PiJ modified by Oliver Smart
 * 
 */
public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		// correct assertEquals to expected then output and add message
		assertEquals("Error failed to get correct initials", expected, output);
	}
	
	/**
	 * bug report in exercise_d12.pdf origin version failed to deal
	 * with name with mulitple spaces separating
	 */
	@Test
	public void testsNameWithSpace() {
		Person p = new Person();
		String input = "Henry  H.   Hippo";
		String output = p.getInitials(input);
		String expected = "HHH";
		assertEquals("Error failed to get correct initials", expected, output);
	}

	
}
