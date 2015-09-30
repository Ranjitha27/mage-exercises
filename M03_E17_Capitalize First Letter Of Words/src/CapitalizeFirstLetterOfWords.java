public class CapitalizeFirstLetterOfWords {
	public String capitalize(String input) {
		// Student code begins here
		
		String output = "";

		input = input.toLowerCase();
		char prev = ' ';
		for (int i = 0, j = input.length(); i < j; i++) {
			char curr = input.charAt(i);
			if (prev == ' ' && curr != ' ') {
				curr = Character.toUpperCase(curr);
			}
			prev = curr;
			output += curr;
		}

		return output;
		
		// Student code ends here
	}

	public void printCapitalized(String input) {
		System.out.println(capitalize(input));
	}

	public static void main(String[] args) {
		String input = "";
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}

		input = input.trim();
		CapitalizeFirstLetterOfWords obj = new CapitalizeFirstLetterOfWords();

		obj.printCapitalized(input);
	}
}
