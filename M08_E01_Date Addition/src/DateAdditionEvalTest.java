import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateAdditionEvalTest {
	DateAddition obj;

	@Before
	public void init() {
		obj = new DateAddition();
	}

	@Test
	public void UTC_01() {
		String expected = "1974-02-14";
		String actual = obj.addDate("20/01/1974", 25, 'D');
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "1973-12-26";
		String actual = obj.addDate("20/01/1974", -25, 'D');
		assertEquals(expected, actual);
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_03() {
		obj.addDate("40/01/1974", -25, 'D');
	}

	@Test
	public void UTC_04() {
		String expected = "1975-01-20";
		String actual = obj.addDate("20/01/1974", 365, 'D');
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		String expected = "2004-06-20";
		String actual = obj.addDate("20/01/1974", 365, 'M');
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		String expected = "2074-01-20";
		String actual = obj.addDate("20/01/1974", 100, 'Y');
		assertEquals(expected, actual);
	}
}
