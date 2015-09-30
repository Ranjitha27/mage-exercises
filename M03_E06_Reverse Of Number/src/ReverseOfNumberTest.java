import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseOfNumberTest {
	ReverseOfNumber obj;

	@Before
	public void init() {
		obj = new ReverseOfNumber();
	}

	@Test
	public void UTC_01() {
		long expected = 21;
		long actual = obj.reverse(1200);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = -21;
		long actual = obj.reverse(-12);
		assertEquals(expected, actual);
	}
	
}
