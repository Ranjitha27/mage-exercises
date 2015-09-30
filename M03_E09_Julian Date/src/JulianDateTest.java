import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JulianDateTest {
	JulianDate obj;

	@Before
	public void init() {
		obj = new JulianDate();
	}

	@Test
	public void UTC_01() {
		int expected = 40926;
		int actual = obj.getJulianDate(19, 1, 2012);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = -2;
		int actual = obj.getJulianDate(19, 13, 2012);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = -3;
		int actual = obj.getJulianDate(29, 2, 2011);
		assertEquals(expected, actual);
	}
}
