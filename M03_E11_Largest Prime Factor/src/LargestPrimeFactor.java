public class LargestPrimeFactor {

	private boolean isPrime(int input) {
		for (int i = 2, j = input / 2; i <= j; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int findLargestPrimeFactor(int input) {
		// Student code begins here

		if (input <= 1) {
			return -1;
		}
		if (isPrime(input)) {
			return -2;
		}
		int start = input / 2;

		while (start >= 2) {
			if (input % start == 0) {
				if (isPrime(start)) {
					return start;
				}
			}
			start--;
		}

		return -3;

		// Student code ends here
	}

	public void printLargestPrimeFactor(int input) {
		System.out.println(findLargestPrimeFactor(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input is required.");
			return;
		}

		try {
			int input = Integer.parseInt(args[0]);

			LargestPrimeFactor obj = new LargestPrimeFactor();
			obj.printLargestPrimeFactor(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}

	}
}
