import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DaysInMonthAndYearTest {
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
		Integer expected = -2;
		Integer actual = obj.getMaxDays(12, -34);
		assertEquals(expected, actual);
	}
	
	@Test
	public void UTC_02() {
		Integer expected = 28;
		Integer actual = obj.getMaxDays(2, 2013);
		assertEquals(expected, actual);
	}

	

}
