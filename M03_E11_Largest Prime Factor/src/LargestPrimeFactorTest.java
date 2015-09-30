import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestPrimeFactorTest {

	LargestPrimeFactor obj;

	@Before
	public void init() {
		obj = new LargestPrimeFactor();
	}

	@Test
	public void UTC_01() {
		int expected = 2;
		int actual = obj.findLargestPrimeFactor(16);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = 5;
		int actual = obj.findLargestPrimeFactor(90);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = -1;
		int actual = obj.findLargestPrimeFactor(-29);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int expected = -2;
		int actual = obj.findLargestPrimeFactor(23);
		assertEquals(expected, actual);
	}

}
