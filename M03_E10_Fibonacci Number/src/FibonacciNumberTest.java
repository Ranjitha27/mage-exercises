import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciNumberTest {

	FibonacciNumber obj;

	@Before
	public void init() {
		obj = new FibonacciNumber();
	}

	@Test
	public void UTC_01() {
		long expected = -1;
		long actual = obj.getFibonacciElementAt(-7);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 13;
		long actual = obj.getFibonacciElementAt(8);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		long expected = -2;
		long actual = obj.getFibonacciElementAt(123);
		assertEquals(expected, actual);
	}
}
