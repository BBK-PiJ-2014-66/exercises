import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * 
 * JUnit Tests of getInitials method from d12.pdf page 4.
 * 
 * @author PiJ 
 * 
 */
public class PersonTest {
	@Test
	public void testsNormalName() {
		Person p = new Person();
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(output, expected);
	}
}
