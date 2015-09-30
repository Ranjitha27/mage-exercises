public class PalyndromeArray {

	public boolean isPalyndromeArray(int[] input) {
		// Student code begins here
		
		if (input == null || input.length <= 1) {
			return true;
		}

		for (int i = 0, j = input.length - 1; i < j; i++, j--) {
			if (input[i] != input[j]) {
				return false;
			}
		}
		return true;
		
		// Student code ends here
	}

	public void printIsPalyndromeArray(int[] input) {
		System.out.println(isPalyndromeArray(input));
	}

	public static void main(String[] args) {
		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			PalyndromeArray obj = new PalyndromeArray();
			obj.printIsPalyndromeArray(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}
	}
}
