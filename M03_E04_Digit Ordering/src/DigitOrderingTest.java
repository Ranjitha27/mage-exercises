import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DigitOrderingTest {
	DigitOrdering obj;

	@Before
	public void init() {
		obj = new DigitOrdering();
	}

	@Test
	public void UTC_01() {
		int expected = 237889;
		int input = 872893;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = -86543;
		int input = -38465;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

}
