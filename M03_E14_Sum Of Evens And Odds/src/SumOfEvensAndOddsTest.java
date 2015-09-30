import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SumOfEvensAndOddsTest {
	SumOfEvensAndOdds obj;

	@Before
	public void init() {
		obj = new SumOfEvensAndOdds();
	}

	@Test
	public void UTC_01() {
		int[] input = { 11, 74, 97, 33, 61, 38, 49, 60, 5 };

		int[] expected = { 172, 256 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] input = { 74, 38, 60 };

		int[] expected = { 172, 0 };
		int[] actual = obj.getSumOfEvensAndOdds(input);

		assertArrayEquals(expected, actual);
	}
}
