import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class DateAdditionTest {

	DateAddition obj;

	@Before
	public void init() {
		obj = new DateAddition();
	}

	@Test
	public void UTC_01() {
		String expected = "1974-01-30";
		String actual = obj.addDate("20/01/1974", 10, 'D');
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "1974-11-20";
		String actual = obj.addDate("20/01/1974", 10, 'M');
		assertEquals(expected, actual);
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_03() {
		obj.addDate("20/01/1974", 10, 'x');
	}
}
