import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FetchUniqueWordsFromParagraphTest {
	FetchUniqueWordsFromParagraph obj;

	@Before
	public void setup() {
		obj = new FetchUniqueWordsFromParagraph();
	}

	@Test
	public void UTC_01() {
		String paragraph = "The tiger is the largest cat species. Its most recognisable feature is a pattern of dark vertical stripes on reddish-orange fur with a lighter underside. The species is classified in the genus Panthera with the lion, leopard, jaguar and snow leopard.";
		int mode = 2;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		List<String> expected = Arrays.asList("a", "in", "is", "of", "on",
				"Its", "The", "and", "cat", "fur", "the", "dark", "lion",
				"most", "snow", "with", "genus", "tiger", "jaguar", "orange",
				"feature", "largest", "leopard", "lighter", "pattern",
				"reddish", "species", "stripes", "Panthera", "vertical",
				"underside", "classified", "recognisable");

		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String paragraph = "The tiger is the largest cat species. Its most recognisable feature is a pattern of dark vertical stripes on reddish-orange fur with a lighter underside. The species is classified in the genus Panthera with the lion, leopard, jaguar and snow leopard.";
		int mode = 1;

		List<String> actual = obj.fetchUniqueWords(paragraph, mode);
		List<String> expected = Arrays.asList("Its", "Panthera", "The", "a",
				"and", "cat", "classified", "dark", "feature", "fur", "genus",
				"in", "is", "jaguar", "largest", "leopard", "lighter", "lion",
				"most", "of", "on", "orange", "pattern", "recognisable",
				"reddish", "snow", "species", "stripes", "the", "tiger",
				"underside", "vertical", "with");

		assertEquals(expected, actual);
	}
}
