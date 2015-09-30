import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryToDecimalEvalTest {
	BinaryToDecimal obj;

	@Before
	public void init() {
		obj = new BinaryToDecimal();
	}

	@Test
	public void UTC_01() {
		long expected = 65;
		long actual = obj.convert(1000001L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = 4356;
		long actual = obj.convert(1000100000100L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		long expected = 0;
		long actual = obj.convert(0000000L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		long expected = 65535;
		long actual = obj.convert(1111111111111111L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		long expected = -1;
		long actual = obj.convert(1234L);
		assertEquals(expected, actual);
	}
}
