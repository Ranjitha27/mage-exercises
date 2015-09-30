public class BinaryToDecimal {

	public long convert(long binary) {
		// Student code begins here

		long decimal = 0;
		long rem;

		int i = 0;
		while (binary > 0) {
			rem = binary % 10;

			if (rem != 0 && rem != 1) {
				return -1;
			}

			binary /= 10;
			if (rem == 1) {
				decimal += Math.pow(2, i);
			}
			i++;
		}
		return decimal;

		// Student code ends here.
	}

	public void printDecimal(long binary) {
		System.out.println(convert(binary));
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}

		try {
			long input = Long.parseLong(args[0]);
			BinaryToDecimal obj = new BinaryToDecimal();
			obj.printDecimal(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}

}
