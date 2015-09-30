public class ReverseOfNumber {

	public long reverse(long input) {
		long output = 0;

		// Student code begins here
		int sign = 1;
		if (input < 0) {
			sign = -1;
			input = -input;
		}
		long rem;
		while (input > 0) {
			rem = input % 10;
			input /= 10;
			output = output * 10 + rem;
		}
		// Student code ends here

		return sign * output;
	}

	private void printInReverse(long input) {
		System.out.println(reverse(input));
	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}

		try {
			if (args[0].toUpperCase().endsWith("L")) {
				args[0] = args[0].substring(0, args[0].length() - 1);
			}
			long input = Long.parseLong(args[0]);
			ReverseOfNumber obj = new ReverseOfNumber();
			obj.printInReverse(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
