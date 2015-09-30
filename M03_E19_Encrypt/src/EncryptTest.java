import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EncryptTest {

	Encrypt obj;

	@Before
	public void init() {
		obj = new Encrypt();
	}

	@Test
	public void UTC_01() {
		String input = "this is a test";
		String chars = "isat";
		String code = "&*()";
		String expected = ")h&* &* ( )e*)";

		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String input = "this is a test";
		String chars = "aeiou";
		String code = "{}";
		String expected = "this is a test";

		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}
}
