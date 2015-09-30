public class RotateString {

	public String rotate(String input) {
		int index = input.lastIndexOf(" ");
		if (index != -1) {
			String part1 = input.substring(0, index);
			String part2 = input.substring(index + 1);
			return part2 + " " + part1;
		}

		return input;
	}

	public String rotate(String input, int n) {
		// Student code begins here
		
		if (input == null) {
			return null;
		}
		if (input.trim().equals("")) {
			return input;
		}

		n = Math.abs(n);
		for (int i = 0; i < n; i++) {
			input = rotate(input);
		}
		return input.trim();
		
		// Student code ends here
	}

	public void printRotated(String input, int n) {
		System.out.println(rotate(input, n));
	}

	public static void main(String[] args) {

		try {
			String input = "";
			for (int i = 0; i < args.length - 1; i++) {
				input += args[i] + " ";
			}

			input = input.trim();

			int count = Integer.parseInt(args[args.length - 1]);

			RotateString obj = new RotateString();
			obj.printRotated(input, count);
		} catch (NumberFormatException e) {
			System.out.println("The last argument must be an integer.");
		}
	}
}
