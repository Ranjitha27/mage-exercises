import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SumOfListElementsTest {

	SumOfListElements obj;

	@Before
	public void init() {
		obj = new SumOfListElements();
	}

	@Test
	public void UTC_01() {
		List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> input2 = Arrays.asList(7, 8, 9);
		List<Integer> expected = Arrays.asList(8, 10, 12, 4, 5, 6);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<Integer> input1 = Arrays.asList();
		List<Integer> input2 = Arrays.asList(1, 2, 3, 4);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

}
