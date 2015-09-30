import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StackofStringsEvalTest {
	@Test
	public void UTC_01() {
		StringStack obj = new StringStack(-3);
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
		assertFalse(obj.push("   "));
		assertTrue(obj.push("string3"));
		assertTrue(obj.push("string4"));
		assertTrue(obj.push("string5"));
		assertFalse(obj.push("string6"));
	}
	@Test
	public void UTC_03() {
		StringStack obj = new StringStack(2);
		assertTrue(obj.push("string1"));
		assertFalse(obj.push(null));
		assertFalse(obj.push(null));
		assertTrue(obj.push("string2"));
		assertFalse(obj.push("string3"));
	}
	

	@Test
	public void UTC_04() {
		StringStack obj = new StringStack(0);
		assertNull(obj.pop());
	}
	
	@Test
	public void UTC_05() {
		StringStack obj = new StringStack(2);
		assertTrue(obj.push("string1"));
		assertTrue(obj.push("string2"));
		assertNotNull(obj.pop());
		assertNotNull(obj.pop());
		assertNull(obj.pop());
	}
	

	@Test
	public void UTC_06() {
		StringStack obj = new StringStack(1);
		assertTrue(obj.push("string1"));
		assertNotNull(obj.pop());
		assertNull(obj.pop());
		assertTrue(obj.push("string1"));
		assertNotNull(obj.pop());
		assertNull(obj.pop());
		
	}
}
