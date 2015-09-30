import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RotateStringTest {

	RotateString obj;

	@Before
	public void init() {
		obj = new RotateString();
	}

	@Test
	public void UTC_01() {
		String input = "this is a test";
		String expected = "test this is a";
		String actual = obj.rotate(input, 1);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String input = "this is a test";
		String expected = "a test this is";
		String actual = obj.rotate(input, -2);
		assertEquals(expected, actual);
	}
}
