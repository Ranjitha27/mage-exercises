import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOfPrimesEvalTest {
	SumOfPrimes obj;

	@Before
	public void init() {
		obj = new SumOfPrimes();
	}

	@Test
	public void UTC_01() {
		long expected = 1060;
		long actual = obj.findSumOfPrimesBetween(1, 100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 21208;
		long actual = obj.findSumOfPrimesBetween(50, 500);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		long expected = 1060;
		long actual = obj.findSumOfPrimesBetween(100, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		long expected = 1060;
		long actual = obj.findSumOfPrimesBetween(-100, 100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		long expected = 1060;
		long actual = obj.findSumOfPrimesBetween(100, -100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		long expected = 0;
		long actual = obj.findSumOfPrimesBetween(100, 100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		long expected = 732;
		long actual = obj.findSumOfPrimesBetween(50, 100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		long expected = 228;
		long actual = obj.findSumOfPrimesBetween(25, 50);
		assertEquals(expected, actual);
	}
}
