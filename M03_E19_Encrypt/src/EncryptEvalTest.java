import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class EncryptEvalTest {

	Encrypt obj;

	@Before
	public void init() {
		obj = new Encrypt();
	}

	@Test
	public void UTC_01() {
		String input = "java programming language";
		String chars = "abcdefgh";
		String code = "12345678";
		String expected = "j1v1 pro7r1mmin7 l1n7u175";

		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String input = "java programming language";
		String chars = "aeiou";
		String code = "{}[]|";
		String expected = "j{v{ pr]gr{mm[ng l{ng|{g}";

		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String input = "java programming language";
		String chars = "asdfghjklp";
		String code = ",<.>/?[]{}";
		String expected = "[,v, }ro/r,mmin/ {,n/u,/e";

		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String input = null;
		String chars = "asdfghjklp";
		String code = ",<.>/?[]{}";

		String actual = obj.encrypt(input, chars, code);
		assertNull(actual);
	}

	@Test
	public void UTC_05() {
		String input = "java programming language";
		String chars = "asdfghjklp";
		String code = ".,;";
		String expected = input;
		
		String actual = obj.encrypt(input, chars, code);
		assertEquals(expected, actual);
	}
}
