public class NearestIntegerSquareRoot {

	public int findNearestIntegerSquareRoot(int input) {
		// student code begins here
		
		if (input <= 0) {
			return -1;
		}
		int i = 2;
		int pass = 0;
		while (i < input) {
			if (i * i > input) {
				break;
			} else {
				pass++;
			}

			i++;
		}

		if (pass == 0) {
			return -2;
		} else {
			return i - 1;
		}
		
		// student code ends here
	}

	void printNearestIntegerSquareRoot(int input) {
		System.out.println(findNearestIntegerSquareRoot(input));
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Exactly 1 input required.");
			return;
		}
		try {
			int input = Integer.parseInt(args[0]);

			NearestIntegerSquareRoot obj = new NearestIntegerSquareRoot();
			obj.printNearestIntegerSquareRoot(input);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}

	}
}
