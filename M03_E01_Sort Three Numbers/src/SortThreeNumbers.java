public class SortThreeNumbers {
	public static void sort(int a, int b, int c) {
		// Student code starts here.
		int t;

		if (!(a < b && a < c)) {
			// make a as smallest
			if (b < a && b < c) {
				// b is smallest; interchange a and b
				t = a;
				a = b;
				b = t;
			} else {
				// c is smallest; interchange a and c
				t = a;
				a = c;
				c = t;
			}
		}

		// a is smallest; re-arrange b and c
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}

		// Student code ends here.
		System.out.print(a + " " + b + " " + c);
	}

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Exactly 3 inputs required");
			return;
		}
		try {
			int a, b, c;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c = Integer.parseInt(args[2]);

			sort(a, b, c);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
	}
}
