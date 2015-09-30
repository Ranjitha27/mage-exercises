import java.util.Arrays;

public class SumOfEvensAndOdds {

	public int[] getSumOfEvensAndOdds(int[] input) {
		// Student code begins here
		
		if (input == null) {
			input = new int[0];
		}

		int[] result = new int[2];
		for (int num : input) {
			if (num % 2 == 0) {
				result[0] += num;
			} else {
				result[1] += num;
			}
		}

		return result;
		
		// Student code ends here
	}

	public void printSumOfEvensAndOdds(int[] input) {
		System.out.println(Arrays.toString(getSumOfEvensAndOdds(input)));
	}

	public static void main(String[] args) {

		try {
			int[] input = new int[args.length];
			for (int i = 0; i < input.length; i++) {
				input[i] = Integer.parseInt(args[i]);
			}

			SumOfEvensAndOdds obj = new SumOfEvensAndOdds();
			obj.printSumOfEvensAndOdds(input);
		} catch (NumberFormatException e) {
			System.out.println("Only numbers are allowed.");
		}

	}
}
