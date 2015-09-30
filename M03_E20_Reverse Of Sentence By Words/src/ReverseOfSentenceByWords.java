
public class ReverseOfSentenceByWords {

	public String reverseByWords(String input) {
		
		// Student code begins here
		
		if (input == null) {
			return null;
		}
		if (input.trim().equals("")) {
			return input;
		}

		String output = "";
		input = new StringBuffer(input).reverse().toString() + " ";

		char prev = ' ';
		for (int i = 0, j = input.length(); i < j; i++) {
			char curr = input.charAt(i);
			if (prev == ' ' && curr != ' ') {
				int start = i, end = i;
				for (; i < j; i++) {
					curr = input.charAt(i);
					if (curr == ' ') {
						end = i;
						break;
					}
				}
				output += new StringBuffer(input.substring(start, end))
						.reverse().toString() + " ";
			} else {
				output += curr;
			}
			prev = curr;
		}

		return output.trim();
		
		// Student code ends here
	}

	public void printInReverseByWords(String input) {
		System.out.println(reverseByWords(input));
	}

	public static void main(String[] args) {
		String input = "";
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}

		input = input.trim();
		ReverseOfSentenceByWords obj = new ReverseOfSentenceByWords();
		System.out.print(input + ";");
		obj.printInReverseByWords(input);
	}
}
