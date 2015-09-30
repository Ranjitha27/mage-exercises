import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FibonacciNumberEvalTest {

	FibonacciNumber obj;

	@Before
	public void init() {
		obj = new FibonacciNumber();
	}

	@Test
	public void UTC_01() {
		long expected = 8;
		long actual = obj.getFibonacciElementAt(7);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 34;
		long actual = obj.getFibonacciElementAt(10);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		long expected = -1;
		long actual = obj.getFibonacciElementAt(-5);
		assertEquals(expected, actual);
	}
	@Test
	public void UTC_04() {
		long expected = 377;
		long actual = obj.getFibonacciElementAt(15);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		long expected = 3416454622906707L;
		long actual = obj.getFibonacciElementAt(77);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		long expected = 6174643828739884737L;
		long actual = obj.getFibonacciElementAt(99);
		assertEquals(expected, actual);
	}
	@Test
	public void UTC_07() {
		long expected = -2;
		long actual = obj.getFibonacciElementAt(123);
		assertEquals(expected, actual);
	}

}
