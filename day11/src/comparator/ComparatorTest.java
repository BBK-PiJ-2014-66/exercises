package comparator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComparatorTest {

	@Test
	public void testGetMaxWithDoubles() {
		Comparator comp = new Comparator(); 
		assertEquals("getMax(1.,10.) should give 10", 10.,comp.getMax(1.,10.),0.00001);
	}
	@Test
	public void testGetMaxWithInts() {
		Comparator comp = new Comparator(); 
		assertEquals("getMax(-3,-2) should give -2", -2,  comp.getMax(-3,-2));
		
	}
	@Test
	public void testGetMaxWithStrings() {
		Comparator comp = new Comparator(); 
		assertEquals("getMax(\"3\",\"10\") should give \"10\"", "10",  comp.getMax("3","10"));
	}
	@Test
	public void testGetMaxInvalidStringReturnsNull() {
		Comparator comp = new Comparator(); 
		assertNull("getMax(\"lemon\",\"cake\") should null return",  comp.getMax("lemon","cake"));
	}

	
}
