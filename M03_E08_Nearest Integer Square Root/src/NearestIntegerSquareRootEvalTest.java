import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NearestIntegerSquareRootEvalTest {

	NearestIntegerSquareRoot obj;

	@Before
	public void init() {
		obj = new NearestIntegerSquareRoot();
	}

	@Test
	public void UTC_01() {
		int expected = 7;
		int input = 50;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = 31;
		int input = 1000;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = 99;
		int input = 9999;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int expected = 122;
		int input = 15000;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int expected = 12;
		int input = 144;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int expected = 3;
		int input = 10;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int expected = -2;
		int input = 3;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		int expected = -1;
		int input = -100;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}
}
