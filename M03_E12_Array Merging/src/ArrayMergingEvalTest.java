import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayMergingEvalTest {

	ArrayMerging obj;

	@Before
	public void init() {
		obj = new ArrayMerging();
	}

	@Test
	public void UTC_01() {
		int[] nums1 = { 10, 30, 49, 55, 56 };
		int[] nums2 = { 12, 44, 27 };

		int[] expected = { 49, 55, 27 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] nums1 = { 1, 2, 3, 4, 5, 6 };
		int[] nums2 = { 7, 8, 9, 10, 11, 12 };

		int[] expected = { 1, 3, 5, 7, 9, 11 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int[] nums1 = { 10, 20, 30 };
		int[] nums2 = { 40, 50, 60 };

		int[] expected = {};
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int[] nums1 = null;
		int[] nums2 = { 7, 8, 9, 10, 11, 12 };

		int[] expected = {7, 9, 11 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int[] nums1 = null;
		int[] nums2 = null;

		int[] expected = {};
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_06() {
		int[] nums1 = { 1, 2, 3, 4, 5 };
		int[] nums2 = null;

		int[] expected = {1, 3, 5 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_07() {
		int[] nums1 = { 7, 9, 11 };
		int[] nums2 = { 11, 9, 7 };

		int[] expected = {7, 9, 11, 11, 9, 7 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}
	
}
