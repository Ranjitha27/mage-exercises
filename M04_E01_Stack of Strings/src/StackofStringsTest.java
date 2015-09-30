import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackofStringsTest {

	@Test
	public void UTC_01() {
		StringStack obj = new StringStack(3);
		assertTrue(obj.push("string1"));
		assertTrue(obj.push("string2"));
		assertTrue(obj.push("string3"));
		assertFalse(obj.push("string4"));
	}
	
	@Test
	public void UTC_02() {
		StringStack obj = new StringStack();
		assertTrue(obj.push("string1"));
		assertTrue(obj.push("string2"));
		assertTrue(obj.push("string3"));
		assertTrue(obj.push("string4"));
		assertTrue(obj.push("string5"));
		assertFalse(obj.push("string6"));
	}

}
