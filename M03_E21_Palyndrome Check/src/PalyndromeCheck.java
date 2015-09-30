public class PalyndromeCheck {

	public boolean isPalyndrome(String input) {
		// Student code begins here
		
		if (input == null) {
			return false;
		}
		if (input.trim().equals("")) {
			return true;
		}

		for (int i = 0, j = input.length()-1; i < j; i++, j--) {
			if (input.charAt(i) != input.charAt(j)) {
				return false;
			}
		}
		return true;
		
		// Student code ends here
	}

	public void printIsPalyndrome(String input) {
		System.out.println(isPalyndrome(input));
	}

	public static void main(String[] args) {

		String input = null;
		if (args.length > 0) {
			input = "";
			for (String arg : args) {
				input += arg + " ";
			}
			input = input.trim();
		}

		PalyndromeCheck obj = new PalyndromeCheck();
		obj.printIsPalyndrome(input);
	}
}
