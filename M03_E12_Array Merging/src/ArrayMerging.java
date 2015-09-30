import java.util.Arrays;

public class ArrayMerging {

	public int[] merge(int[] nums1, int[] nums2) {
		// Student code begins here

		if (nums1 == null) {
			nums1 = new int[0];
		}
		if (nums2 == null) {
			nums2 = new int[0];
		}

		int[] tmp = new int[nums1.length + nums2.length];
		int i = 0;
		for (int n : nums1) {
			if (n % 2 == 1) {
				tmp[i++] = n;
			}
		}
		for (int n : nums2) {
			if (n % 2 == 1) {
				tmp[i++] = n;
			}
		}

		int[] result = new int[i];
		for (int j = 0; j < result.length; j++) {
			result[j] = tmp[j];
		}

		return result;

		// Student code ends here
	}

	public void printMergedArrays(int[] nums1, int[] nums2) {
		System.out.println(Arrays.toString(merge(nums1, nums2)));
	}

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required.");
			return;
		}

		try {
			String[] ar1 = args[0].equals("null") ? null : args[0].split(",");
			String[] ar2 = args[1].equals("null") ? null : args[1].split(",");

			int[] nums1 = ar1 == null ? null : new int[ar1.length];
			int[] nums2 = ar2 == null ? null : new int[ar2.length];

			if (ar1 != null) {
				for (int i = 0; i < ar1.length; i++) {
					nums1[i] = Integer.parseInt(ar1[i].trim());
				}
			}
			if (ar2 != null) {
				for (int i = 0; i < ar2.length; i++) {
					nums2[i] = Integer.parseInt(ar2[i].trim());
				}
			}
			ArrayMerging obj = new ArrayMerging();
			obj.printMergedArrays(nums1, nums2);
		} catch (NumberFormatException e) {
			System.out
					.println("2 Strings containing comma separated integers required.");
		}
	}
}
