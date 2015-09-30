import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class JulianDateEvalTest {

	JulianDate obj;

	@Before
	public void init() {
		obj = new JulianDate();
	}

	@Test
	public void UTC_01() {
		int expected = 42047;
		int actual = obj.getJulianDate(13, 2, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int expected = 27048;
		int actual = obj.getJulianDate(20, 1, 1974);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int expected = 36584;
		int actual = obj.getJulianDate(29, 2, 2000);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int expected = -3;
		int actual = obj.getJulianDate(29, 2, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int expected = -2;
		int actual = obj.getJulianDate(20, 19, 1974);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int expected = -1;
		int actual = obj.getJulianDate(20, 19, 0);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int expected = -3;
		int actual = obj.getJulianDate(-1, 1, 1974);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		int expected = 37565;
		int actual = obj.getJulianDate(06, 11, 2002);
		assertEquals(expected, actual);
	}
}
