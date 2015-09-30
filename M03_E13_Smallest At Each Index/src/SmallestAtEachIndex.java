public class SmallestAtEachIndex {

	public int[] findSmallestAtEachIndex(int[] nums1, int[] nums2) {
		// STUDENT CODE BEGINS HERE
		
		if (nums1 == null) {
			nums1 = new int[0];
		}
		if (nums2 == null) {
			nums2 = new int[0];
		}

		int len1, len2;
		len1 = nums1.length;
		len2 = nums2.length;

		int[] largeArray = null;
		int[] shortArray = null;
		if (len1 > len2) {
			largeArray = nums1;
			shortArray = nums2;
		} else {
			largeArray = nums2;
			shortArray = nums1;
		}

		int[] result = new int[largeArray.length];
		for (int i = 0; i < shortArray.length; i++) {
			result[i] = nums1[i] < nums2[i] ? nums1[i] : nums2[i];
		}

		for (int i = shortArray.length; i < largeArray.length; i++) {
			result[i] = largeArray[i];
		}
		return result;
		
		// STUDENT CODE ENDS HERE
	}

	public void printSmallestAtEachIndex(int[] nums1, int[] nums2) {
		findSmallestAtEachIndex(nums1, nums2);
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

			SmallestAtEachIndex obj = new SmallestAtEachIndex();
			obj.printSmallestAtEachIndex(nums1, nums2);
		} catch (NumberFormatException e) {
			System.out
					.println("Only Strings containing comma separated integers are required.");
		}
	}
}
