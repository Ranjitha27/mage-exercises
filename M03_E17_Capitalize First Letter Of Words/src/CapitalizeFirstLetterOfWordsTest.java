import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CapitalizeFirstLetterOfWordsTest {

	CapitalizeFirstLetterOfWords obj;

	@Before
	public void init() {
		obj = new CapitalizeFirstLetterOfWords();
	}

	@Test
	public void UTC_01() {
		String expected = "This Is A Test";
		String input = "this is a test";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "This Is A Test";
		String input = "THIS IS A TEST";
		String actual = obj.capitalize(input);
		assertEquals(expected, actual);
	}

}
