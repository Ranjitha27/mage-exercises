public class Encrypt {

	public String encrypt(String input, String chars, String code) {
		// Student code begins here

		if(input==null){
			return null;
		}
		
		if (chars.length() != code.length()) {
			return input;
		}

		for (int i = 0, j = chars.length(); i < j; i++) {
			char c1 = chars.charAt(i);
			char c2 = code.charAt(i);
			input = input.replaceAll(String.valueOf(c1), String.valueOf(c2));
		}

		return input;
		
		// Student code ends here
	}

	public void printEncrypted(String input, String chars, String code) {
		System.out.println(encrypt(input, chars, code));
	}

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Exactly 3 inputs required.");
			return;
		}
		String input = args[0];
		String chars = args[1];
		String code = args[2];

		Encrypt obj = new Encrypt();
		obj.printEncrypted(input, chars, code);
	}
}
