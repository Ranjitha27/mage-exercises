import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindTheSumEvalTest {
	FindTheSum obj;

	@Before
	public void init() {
		obj = new FindTheSum();
	}

	@Test
	public void UTC_01() {
		String filename = "file1.txt";
		Double expected = 651.4;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String filename = "file2.txt";
		Double expected = 60.0;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String filename = "file3.txt";
		Double expected = 369.0;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String filename = "file4.txt";
		Double expected = 135.75;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		String filename = "file5.txt";
		Double expected = 0.0;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		String filename = "file6.txt";
		Double expected = -1955.0;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_07() {
		String filename = null;
		obj.findSum(filename);
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_08() {
		String filename = "nofile.txt";
		obj.findSum(filename);
	}
}
