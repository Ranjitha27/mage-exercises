public class ConvertInput {

	public static void main(String[] args) {
		// STUDENT CODE BEGINS HERE

		if (args.length == 0 || args[0].trim().length() == 0) {
			System.out.print("null");
			return;
		}

		String input = args[0];
		try {
			Integer i = Integer.parseInt(input);
			System.out.print("int " + i);
		} catch (NumberFormatException e2) {
			try {
				Double d = Double.parseDouble(input);
				System.out.print("double " + d);
			} catch (NumberFormatException e3) {
				input = input.trim();
				if (input.equalsIgnoreCase("true")
						|| input.equalsIgnoreCase("false")) {
					boolean b = Boolean.parseBoolean(input);
					System.out.print("boolean " + b);
				} else {
					System.out.print("String " + input);
				}
			}
		}

		// STUDENT CODE ENDS HERE
	}
}
