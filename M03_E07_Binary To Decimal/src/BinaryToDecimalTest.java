import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryToDecimalTest {

	BinaryToDecimal obj;

	@Before
	public void init() {
		obj = new BinaryToDecimal();
	}

	@Test
	public void UTC_01() {
		long expected = 85;
		long actual = obj.convert(1010101L);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		long expected = -1;
		long actual = obj.convert(29283L);
		assertEquals(expected, actual);
	}
}
