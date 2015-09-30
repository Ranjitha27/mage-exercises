import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DigitOrderingEvalTest {

	DigitOrdering obj;

	@Before
	public void init() {
		obj = new DigitOrdering();
	}

	@Test
	public void UTC_01() {
		int expected = 2289;
		int input = 2928;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = 44558;
		int input = 48455;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = -985333;
		int input = -333958;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int expected = 123788;
		int input = 182837;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int expected = 456789;
		int input = 987654;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int expected = 0;
		int input = 0;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int expected = -54321;
		int input = -12345;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		int expected = 12345;
		int input = 12345;
		int actual = obj.orderDigits(input);
		assertEquals(expected, actual);
	}

}
