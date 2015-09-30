import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PalyndromeArrayTest {
	PalyndromeArray obj;

	@Before
	public void init() {
		obj = new PalyndromeArray();
	}

	@Test
	public void UTC_01() {
		int[] input = { 10, 20, 30, 20, 10 };
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] input = { 1, 2, 3, 4 };
		boolean expected = false;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}
}
