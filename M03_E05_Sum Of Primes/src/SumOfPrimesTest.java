import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOfPrimesTest {
	SumOfPrimes obj;

	@Before
	public void init() {
		obj = new SumOfPrimes();
	}

	@Test
	public void UTC_01() {
		long expected = 311;
		long actual = obj.findSumOfPrimesBetween(10, 50);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 328;
		long actual = obj.findSumOfPrimesBetween(50, -100);
		assertEquals(expected, actual);
	}
}
