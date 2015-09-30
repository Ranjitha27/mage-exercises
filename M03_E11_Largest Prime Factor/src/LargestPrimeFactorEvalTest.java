import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestPrimeFactorEvalTest {

	LargestPrimeFactor obj;

	@Before
	public void init() {
		obj = new LargestPrimeFactor();
	}

	@Test
	public void UTC_01() {
		int expected = 5;
		int actual = obj.findLargestPrimeFactor(10);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = 7;
		int actual = obj.findLargestPrimeFactor(42);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = 29;
		int actual = obj.findLargestPrimeFactor(13195);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int expected = 11;
		int actual = obj.findLargestPrimeFactor(77);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int expected = -2;
		int actual = obj.findLargestPrimeFactor(11);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int expected = 2;
		int actual = obj.findLargestPrimeFactor(4);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int expected = 13;
		int actual = obj.findLargestPrimeFactor(26);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		int expected = -1;
		int actual = obj.findLargestPrimeFactor(1);
		assertEquals(expected, actual);
	}
}
