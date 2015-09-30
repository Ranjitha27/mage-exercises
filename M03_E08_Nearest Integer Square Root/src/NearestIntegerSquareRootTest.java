import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NearestIntegerSquareRootTest {

	NearestIntegerSquareRoot obj;

	@Before
	public void init() {
		obj = new NearestIntegerSquareRoot();
	}

	@Test
	public void UTC_01() {
		int expected = 7;
		int input = 55;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = -1;
		int input = -1234;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = -2;
		int input = 2;
		int actual = obj.findNearestIntegerSquareRoot(input);
		assertEquals(expected, actual);
	}
}
