import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseOfNumberEvalTest {
	ReverseOfNumber obj;

	@Before
	public void init() {
		obj = new ReverseOfNumber();
	}

	@Test
	public void UTC_01() {
		long expected = 54321;
		long actual = obj.reverse(12345L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 21;
		long actual = obj.reverse(12000L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		long expected = 504030201;
		long actual = obj.reverse(102030405L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		long expected = 1000002;
		long actual = obj.reverse(2000001L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		long expected = -123;
		long actual = obj.reverse(-321);
		assertEquals(expected, actual);
	}

}
