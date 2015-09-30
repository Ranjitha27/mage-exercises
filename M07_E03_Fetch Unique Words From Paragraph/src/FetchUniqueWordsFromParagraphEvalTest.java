import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FetchUniqueWordsFromParagraphEvalTest {

	FetchUniqueWordsFromParagraph obj;

	@Before
	public void setup() {
		obj = new FetchUniqueWordsFromParagraph();
	}

	@Test
	public void UTC_01() {
		String paragraph = "Tigers are among the most recognisable and popular of the world's charismatic megafauna. They have featured prominently in ancient mythology and folklore, and continue to be depicted in modern films and literature. They appear on many flags, coats of arms, and as mascots for sporting teams. The tiger is the national animal of Bangladesh, India, Vietnam, Malaysia and South Korea.";
		int mode = 1;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		List<String> expected = Arrays.asList("Bangladesh", "India", "Korea",
				"Malaysia", "South", "The", "They", "Tigers", "Vietnam",
				"among", "ancient", "and", "animal", "appear", "are", "arms",
				"as", "be", "charismatic", "coats", "continue", "depicted",
				"featured", "films", "flags", "folklore", "for", "have", "in",
				"is", "literature", "many", "mascots", "megafauna", "modern",
				"most", "mythology", "national", "of", "on", "popular",
				"prominently", "recognisable", "s", "sporting", "teams", "the",
				"tiger", "to", "world");

		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String paragraph = "Tigers are among the most recognisable and popular of the world's charismatic megafauna. They have featured prominently in ancient mythology and folklore, and continue to be depicted in modern films and literature. They appear on many flags, coats of arms, and as mascots for sporting teams. The tiger is the national animal of Bangladesh, India, Vietnam, Malaysia and South Korea.";
		int mode = 2;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		List<String> expected = Arrays.asList("s", "as", "be", "in", "is",
				"of", "on", "to", "The", "and", "are", "for", "the", "They",
				"arms", "have", "many", "most", "India", "Korea", "South",
				"among", "coats", "films", "flags", "teams", "tiger", "world",
				"Tigers", "animal", "appear", "modern", "Vietnam", "ancient",
				"mascots", "popular", "Malaysia", "continue", "depicted",
				"featured", "folklore", "national", "sporting", "megafauna",
				"mythology", "Bangladesh", "literature", "charismatic",
				"prominently", "recognisable");

		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String paragraph = "";
		int mode = 2;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		List<String> expected = new ArrayList<String>();

		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String paragraph = null;
		int mode = 2;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		assertNull(actual);
	}

	@Test
	public void UTC_05() {
		String paragraph = "";
		int mode = 5;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		assertNull(actual);
	}
}
