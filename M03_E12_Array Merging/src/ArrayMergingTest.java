import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayMergingTest {

	ArrayMerging obj;

	@Before
	public void init() {
		obj = new ArrayMerging();
	}

	@Test
	public void UTC_01() {
		int[] nums1 = { 7, 8, 9, 10, 11, 12 };
		int[] nums2 = null;

		int[] expected = {7, 9, 11 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}

	@Test
	public void UTC_02() {
		int[] nums1 = { 1, 1, 1, 1 };
		int[] nums2 = { 3, 3, 3, 3 };

		int[] expected = {1, 1, 1, 1, 3, 3, 3, 3 };
		int[] actual = obj.merge(nums1, nums2);

		assertArrayEquals(expected, actual);
	}
	
}
