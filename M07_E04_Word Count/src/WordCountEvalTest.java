import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class WordCountEvalTest {
	WordCount obj;

	@Before
	public void init() {
		obj = new WordCount();
	}

	private Map<String, Integer> getMapFromString(String mapData) {
		Map<String, Integer> expected = new TreeMap<String, Integer>();
		String[] arr = mapData.split(",");
		for (String a : arr) {
			String[] b = a.split("=");
			if (b.length == 1)
				continue;
			expected.put(b[0].trim(), new Integer(b[1].trim()));
		}
		return expected;
	}

	@Test
	public void UTC_01() {
		String input = "vinod 120 495 120 vinod kumar vinod. vinod123";
		String mapData = "120=2, 495=1, kumar=1, vinod=3, vinod123=1";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String input = "123$32;45.234-123";
		String mapData = "123=2, 234=1, 32=1, 45=1";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		String input = "";
		String mapData = "";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		String input = null;
		String mapData = "";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		String input = "123";
		String mapData = "123=1";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}
}
