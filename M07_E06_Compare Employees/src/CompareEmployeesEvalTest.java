import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CompareEmployeesEvalTest {
	@Test
	public void UTC_01() {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "name", ">" };
		try {
			assertTrue(CompareEmployees.compare(args));
		} catch (InvalidParameterException e) {
			fail();
		}
	}

	@Test
	public void UTC_02() {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "name", "<" };
		try {
			assertFalse(CompareEmployees.compare(args));
		} catch (InvalidParameterException e) {
			fail();
		}
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_03() throws InvalidParameterException {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "name", "===" };
		CompareEmployees.compare(args);
	}

	@Test
	public void UTC_04() {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "id", "<" };
		try {
			assertFalse(CompareEmployees.compare(args));
		} catch (InvalidParameterException e) {
			fail();
		}
	}

	@Test
	public void UTC_05() {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "id", ">" };
		try {
			assertTrue(CompareEmployees.compare(args));
		} catch (InvalidParameterException e) {
			fail();
		}
	}

	@Test(expected = InvalidParameterException.class)
	public void UTC_06() throws InvalidParameterException {
		String[] args = { "7788", "Scott", "2799", "200", "7654", "Miller",
				"2300", "0", "firstname", ">" };
		assertTrue(CompareEmployees.compare(args));
	}
}
