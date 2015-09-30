import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOfEvensAndOddsEvalTest {

	SumOfEvensAndOdds obj;

	@Before
	public void init() {
		obj = new SumOfEvensAndOdds();
	}

	@Test
	public void UTC_01() {
		int[] input = { 1, 100, 30, 2, 3, 33, 40, 50, 112 };

		int[] expected = { 334, 37 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] input = {};

		int[] expected = { 0, 0 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int[] input = null;

		int[] expected = { 0, 0 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int[] input = { 30, 18, 2, 83, 20, 71 };

		int[] expected = { 70, 154 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int[] input = { 14, 11, 10, 67, 41 };

		int[] expected = { 24, 119 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int[] input = { 36, 24, -82, 29, 44, -3, -100, -5, 49 };

		int[] expected = { -78, 70 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int[] input = { 18, 88, -71, -6, 32, 99, -14, 9, 42 };

		int[] expected = { 160, 37 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}
}
