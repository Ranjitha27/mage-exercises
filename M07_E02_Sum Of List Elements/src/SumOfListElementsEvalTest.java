import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SumOfListElementsEvalTest {

	SumOfListElements obj;

	@Before
	public void init() {
		obj = new SumOfListElements();
	}

	@Test
	public void UTC_01() {
		List<Integer> input1 = Arrays.asList(38, 29, 45, 2, 184);
		List<Integer> input2 = Arrays.asList(1, 23, 45);
		List<Integer> expected = Arrays.asList(39, 52, 90, 2, 184);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		List<Integer> input1 = null;
		List<Integer> input2 = Arrays.asList(12, 23, 34, 45, 56);
		List<Integer> expected = Arrays.asList(12, 23, 34, 45, 56);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		List<Integer> input1 = Arrays.asList(12, 23, 34, 45, 56);
		List<Integer> input2 = null;
		List<Integer> expected = Arrays.asList(12, 23, 34, 45, 56);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		List<Integer> input1 = null;
		List<Integer> input2 = null;
		List<Integer> expected = new ArrayList<Integer>();
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		List<Integer> input1 = Arrays.asList(-12, -34, -56);
		List<Integer> input2 = Arrays.asList(-12, -34, -56);
		List<Integer> expected = Arrays.asList(-24, -68, -112);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		List<Integer> input1 = Arrays.asList(-12, -34, -56);
		List<Integer> input2 = null;
		List<Integer> expected = Arrays.asList(-12, -34, -56);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		List<Integer> input1 = Arrays.asList(11);
		List<Integer> input2 = Arrays.asList(22);
		List<Integer> expected = Arrays.asList(33);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

	@Test
	public void UTC_08() {
		List<Integer> input1 = Arrays.asList(-29, 39, 49, 69);
		List<Integer> input2 = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0);
		List<Integer> expected = Arrays.asList(-29, 39, 49, 69, 0, 0, 0, 0, 0);
		List<Integer> actual = obj.getSumOfListElements(input1, input2);
		assertEquals(expected, actual);
	}

}
