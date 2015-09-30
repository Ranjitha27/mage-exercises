import static org.junit.Assert.assertEquals;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
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
		String input = "this test is a test to test the code";
		String mapData = "a=1, code=1, is=1, test=3, the=1, this=1, to=1";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		String input = "Ramesh and Harish are good friends. Ramesh is a good student. Harish is an average student.";
		String mapData = "a=1, an=1, and=1, are=1, average=1, friends=1, good=2, harish=2, is=2, ramesh=2, student=2";

		Map<String, Integer> expected = getMapFromString(mapData);
		Map<String, Integer> actual = obj.countWords(input);
		assertEquals(expected, actual);
	}

}
