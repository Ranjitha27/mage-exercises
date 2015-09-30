import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CompareEmployeesTest {

	@Test
	public void UTC_01() {
		String[] args = { "7788", "Scott", "2000", "200", "7654", "Miller",
				"2300", "0", "salary", "<" };
		try {
			assertTrue(CompareEmployees.compare(args));
		} catch (InvalidParameterException e) {
			fail();
		}
	}

	@Test(expected = NumberFormatException.class)
	public void UTC_02() throws InvalidParameterException {
		String[] args = { "7788", "Scott", "asdf", "200", "7654", "Miller",
				"2300", "0", "salary", "<" };
		assertTrue(CompareEmployees.compare(args));
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_03() throws InvalidParameterException {
		String[] args = { "7788", "Scott", "2000", "200", "7654", "Miller",
				"2300", "0", "salary", "asdf" };
		CompareEmployees.compare(args);
	}

}
