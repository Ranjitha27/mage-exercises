import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class PalyndromeArrayEvalTest {

	PalyndromeArray obj;

	@Before
	public void init() {
		obj = new PalyndromeArray();
	}

	@Test
	public void UTC_01() {
		int[] input = { 1, 2, 3, 2, 1 };
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] input = { 12, 33, 440, 5, 440, 33, 12 };
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int[] input = { 12, 23, 23, 12 };
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int[] input = { 12, 23, 12, 10 };
		boolean expected = false;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int[] input = { 12 };
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int[] input = {};
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int[] input = null;
		boolean expected = true;
		boolean actual = obj.isPalyndromeArray(input);
		assertEquals(expected, actual);
	}
}
