import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SortTheListEvalTest {

	SortTheList obj;

	@Before
	public void init() {
		obj = new SortTheList();
	}

	@Test
	public void UTC_01() {
		List<String> expected = Arrays
				.asList("is, the, java, most, object, popular, language, language, oriented, programming"
						.split(", "));
		String input = "java programming language is the most popular object oriented language";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<String> expected = Arrays.asList("c, c#, ada, c++, java"
				.split(", "));
		String input = "java c c++ c# ada";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		List<String> expected = new ArrayList<String>();
		String input = "";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		List<String> expected = Arrays.asList("java".split(", "));
		String input = "java";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		List<String> expected = new ArrayList<String>();
		System.out.println(expected);
		String input = null;
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		List<String> expected = Arrays.asList("JAVA, jAVA, java".split(", "));
		String input = "java JAVA jAVA";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		List<String> expected = Arrays.asList("java, language, programming"
				.split(", "));
		String input = "java     programming    language";
		List<String> actual = obj.sort(input);
		assertEquals(expected, actual);
	}

}
