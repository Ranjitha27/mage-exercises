import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class NumberToWordsEvalTest {
	NumberToWords obj;

	@Before
	public void init() {
		obj = new NumberToWords();
	}

	@Test
	public void UTC_01() {
		String expected = "twelve crore thirty four lakh fifty six thusand seven hundred eighty nine";
		int input = 123456789;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "ten crore one";
		int input = 100000001;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String expected = "ten crore ten lakh ten thusand one hundred one";
		int input = 101010101;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String expected = "one thusand one";
		int input = 1001;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		String expected = "one";
		int input = 1;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		String expected = "one hundred";
		int input = 100;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		String expected = "ten thusand";
		int input = 10000;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		String expected = "ninty eight thusand seven hundred sixty five";
		int input = -98765;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_09() {
		String expected = "ninty eight thusand seven";
		int input = 98007;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_10() {
		String expected = "";
		int input = 0;
		String actual = obj.convertNumberToWords(input);
		assertEquals(expected, actual);
	}

}
