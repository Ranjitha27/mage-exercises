import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberToWordsTest {
	NumberToWords obj;

	@Before
	public void init() {
		obj = new NumberToWords();
	}

	@Test
	public void UTC_01() {
		String expected = "eighty seven thusand";
		int input = -87000;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "one lakh one thusand ten";
		int input = 101010;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

}
