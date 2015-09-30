import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class SmallestAtEachIndexTest {
	SmallestAtEachIndex obj;

	@Before
	public void init() {
		obj = new SmallestAtEachIndex();
	}

	@Test
	public void UTC_01() {
		int[] nums1 = { 9, 69, 40, 31, 18, 69 };
		int[] nums2 = { 5, 75, 18, 18, 14, 82 };

		int[] expected = { 5, 69, 18, 18, 14, 69 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] nums1 = { 48, 75, 9, 36, 1, 38 };
		int[] nums2 = null;

		int[] expected = { 48, 75, 9, 36, 1, 38 };
		int[] actual = obj.findSmallestAtEachIndex(nums1, nums2);

		assertArrayEquals(expected, actual);
	}
}
