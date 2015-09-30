import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseOfSentenceByWordsTest {

	ReverseOfSentenceByWords obj;

	@Before
	public void init() {
		obj = new ReverseOfSentenceByWords();
	}

	@Test
	public void UTC_01() {
		String expected = "language programming java";
		String input = "java programming language";
		String actual = obj.reverseByWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String expected = "language      programming java";
		String input = "java programming      language";
		String actual = obj.reverseByWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String expected = null;
		String input = null;
		String actual = obj.reverseByWords(input);
		assertEquals(expected, actual);
	}

}
