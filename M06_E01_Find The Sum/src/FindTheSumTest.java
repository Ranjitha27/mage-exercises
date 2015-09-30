import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindTheSumTest {

	FindTheSum obj;

	@Before
	public void init() {
		obj = new FindTheSum();
	}

	@Test
	public void UTC_01() {
		String filename = "file0.txt";
		Double expected = 77.9;
		Double actual = obj.findSum(filename);
		assertEquals(expected, actual);
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_07() {
		String filename = "";
		obj.findSum(filename);
	}

}
