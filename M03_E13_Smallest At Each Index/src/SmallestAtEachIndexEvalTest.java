import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SmallestAtEachIndexEvalTest {
	SmallestAtEachIndex obj;

	@Before
	public void init() {
		obj = new SmallestAtEachIndex();
	}

	@Test
	public void UTC_01() {
		int[] nums1 = { 7, 8, 9, 10, 11, 12 };
		int[] nums2 = { 1, 100, 30, 2, 3, 33, 40, 50, 112 };

		int[] expected = { 1, 8, 9, 2, 3, 12, 40, 50, 112 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] nums1 = { 7, 8, 9, 10, 11, 12 };
		int[] nums2 = null;

		int[] expected = { 7, 8, 9, 10, 11, 12 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_03() {
		int[] nums1 = null;
		int[] nums2 = null;

		int[] expected = {};
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_04() {
		int[] nums1 = { 30, 95, 38, 11, 55, 41 };
		int[] nums2 = { 28, 28, 77, 54, 82, 76 };

		int[] expected = { 28, 28, 38, 11, 55, 41 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_05() {
		int[] nums1 = { 58, 10, 85, 33, 72, 64 };
		int[] nums2 = { 82, -76 };

		int[] expected = { 58, -76, 85, 33, 72, 64 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}
}
