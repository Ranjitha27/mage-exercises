import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortTheListTest {
	SortTheList obj;

	@Before
	public void init() {
		obj = new SortTheList();
	}

	@Test
	public void UTC_01() {
		List<String> expected = Arrays.asList("java, language, programming"
				.split(", "));
		String input = "java programming language";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<String> expected = new ArrayList<String>();
		String input = null;
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}
}
