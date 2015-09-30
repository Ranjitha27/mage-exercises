import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DaysInMonthAndYearEvalTest {
	DaysInMonthAndYear obj;

	@Before
	public void init() {
		obj = new DaysInMonthAndYear();
	}

	@After
	public void clean() {
	}

	@Test
	public void UTC_01() {
		Integer expected = 31;
		Integer actual = obj.getMaxDays(1, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		Integer expected = 30;
		Integer actual = obj.getMaxDays(4, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		Integer expected = -1;
		Integer actual = obj.getMaxDays(20, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		Integer expected = -2;
		Integer actual = obj.getMaxDays(1, 0);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		Integer expected = 28;
		Integer actual = obj.getMaxDays(2, 2014);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		Integer expected = 28;
		Integer actual = obj.getMaxDays(2, 2015);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		Integer expected = 29;
		Integer actual = obj.getMaxDays(2, 2016);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		Integer expected = 28;
		Integer actual = obj.getMaxDays(2, 1900);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_09() {
		Integer expected = 29;
		Integer actual = obj.getMaxDays(2, 2000);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_10() {
		Integer expected = 28;
		Integer actual = obj.getMaxDays(2, 2100);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_11() {
		Integer expected = 29;
		Integer actual = obj.getMaxDays(2, 2400);
		assertEquals(expected, actual);
	}
}
