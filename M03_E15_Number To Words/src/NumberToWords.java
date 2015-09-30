
public class NumberToWords {

	public String convertNumberToWords(int input) {
		
		// Student code begins here
		
		input = Math.abs(input);
		if(input==0){
			return "";
		}
		
		String[] s1 = { "", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen", "twenty" };
		String[] s2 = { "", "", "", "thirty", "forty", "fifty", "sixty", "seventy",
				"eighty", "ninty" };

		String[] s3 = { "", "hundred", "thusand", "lakh", "crore" };
		int[] units = { -1, -1, -1, -1, -1 };
		int index = 0;
		while (input > 0) {
			if (index == 1) {
				units[index] = input % 10;
				input /= 10;
			} else {
				units[index] = input % 100;
				input /= 100;
			}
			index++;
		}
		index--;
		String output = "";
		while (index >= 0) {
			int num = units[index];
			if (num > 0) {
				if (num > 20) {
					int num1 = num / 10;
					int num2 = num % 10;
					output += s2[num1] + " " + s1[num2];
				} else {
					output += s1[num];
				}
				output += " " + s3[index] + " ";

			}
			index--;
		}
		output = output.trim();
		return output;
		
		// Student code ends here
	}

	public void printNumberToWords(int input) {
		System.out.println(convertNumberToWords(input));
	}

	public static void main(String[] args) {
		int[] nums = { 123456789, 100000001, 10101010, 101010101, 1001, 1, 100, 10000,
				98765, 98007, 0, -87000, 101010 };
		NumberToWords obj = new NumberToWords();

		for (int num : nums) {
			System.out.print(num + " => ");
			obj.printNumberToWords(num);
		}
	}

	public static void main1(String[] args) {
		if (args.length != 1) {
			System.out.println("Exactly 1 input is required.");
			return;
		}

		try {
			int input = Integer.parseInt(args[0]);
			

			NumberToWords obj = new NumberToWords();
			obj.printNumberToWords(input);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Input must be a number");
		}
	}
}
