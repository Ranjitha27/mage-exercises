public class FibonacciNumber {

	public long getFibonacciElementAt(int index) {
		// Student code begins here
		
		if (index <= 0) {
			return -1;
		}
		if (index >= 100) {
			return -2;
		}

		long a = -1, b = 1, c = 0;
		for (int i = 0; i < index; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
		
		// Student code ends here
	}

	public void printFibonacciElementAt(int index) {
		System.out.println(getFibonacciElementAt(index));
	}

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Exactly 1 inputs required.");
			return;
		}

		try {
			int num = Integer.parseInt(args[0]);
			FibonacciNumber obj = new FibonacciNumber();

			obj.printFibonacciElementAt(num);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
