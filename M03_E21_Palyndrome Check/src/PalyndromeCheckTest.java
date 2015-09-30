import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PalyndromeCheckTest {

	PalyndromeCheck obj;

	@Before
	public void init() {
		obj = new PalyndromeCheck();
	}

	@Test
	public void UTC_01() {
		assertTrue(obj.isPalyndrome("ana"));
	}

	@Test
	public void UTC_02() {
		assertFalse(obj.isPalyndrome("java"));
	}

	@Test
	public void UTC_03() {
		assertTrue(obj.isPalyndrome("   "));
	}
}
