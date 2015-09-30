import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CapitalizeFirstLetterOfWordsEvalTest {

	CapitalizeFirstLetterOfWords obj;

	@Before
	public void init() {
		obj = new CapitalizeFirstLetterOfWords();
	}

	@Test
	public void UTC_01() {
		String expected = "Java Programming Language";
		String input = "java programming language";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "Java Programming Language";
		String input = "JAVA PROGRAMMING LANGUAGE";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String expected = "Java Programming Language";
		String input = "Java Programming Language";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String expected = "";
		String input = "";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		String expected = "1234";
		String input = "1234";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		String expected = "Java Programming Language";
		String input = "jAVA pROGRAMMING lANGUAGE";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		String expected = "Java     Programming    Language";
		String input = "java     programming    language";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		String expected = "Java Programming Language";
		String input = "JAVA programming LANGUAGE";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

}
