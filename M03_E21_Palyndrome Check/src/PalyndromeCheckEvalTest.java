import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalyndromeCheckEvalTest {

	PalyndromeCheck obj;

	@Before
	public void init() {
		obj = new PalyndromeCheck();
	}

	@Test
	public void UTC_01() {
		assertTrue(obj.isPalyndrome("malayalam"));
	}

	@Test
	public void UTC_02() {
		assertTrue(obj.isPalyndrome("madam"));
	}

	@Test
	public void UTC_03() {
		assertFalse(obj.isPalyndrome("palyndrome"));
	}

	@Test
	public void UTC_04() {
		assertFalse(obj.isPalyndrome(null));
	}

	@Test
	public void UTC_05() {
		assertTrue(obj.isPalyndrome(""));
	}
}
