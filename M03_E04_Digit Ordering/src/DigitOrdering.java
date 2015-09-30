public class DigitOrdering {

	private int getSmallestDigit(int input) {
		input = Math.abs(input);

		int shortest = 9;

		while (input > 0) {
			int rem = input % 10;
			input /= 10;

			if (rem < shortest) {
				shortest = rem;
			}
		}

		return shortest;
	}

	private int removeDigit(int input, int digit) {
		int ret = 0;
		boolean found = false;
		int i = 0;
		while (input > 0) {
			int rem = input % 10;
			input /= 10;

			if (rem == digit && !found) {
				found = true;
			} else {
				ret = ret + rem * (int) Math.pow(10, i++);
			}
		}
		return ret;
	}

	public int orderDigits(int input) {
		// Student code begins here
		
		boolean reverse = input < 0 ? true : false;
		input = Math.abs(input);

		int output = 0, i = 0;
		while (input > 0) {
			int smallest = getSmallestDigit(input);
			input = removeDigit(input, smallest);
			if (reverse) {
				output = output + smallest * (int) Math.pow(10, i++);
			} else {
				output = output * 10 + smallest;
			}
		}
		return reverse ? -1 * output : output;
		// Student code ends here
	}

	public void printOrderedDigits(int input) {
		System.out.println(orderDigits(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}
		try {
			int input = Integer.parseInt(args[0]);
			DigitOrdering obj = new DigitOrdering();
			obj.printOrderedDigits(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integer allowed.");
		}
	}
}
