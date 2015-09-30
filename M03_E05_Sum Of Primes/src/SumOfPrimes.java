public class SumOfPrimes {

	boolean isPrime(int input) {
		if (input <= 1) {
			return false;
		}
		for (int i = 2, j = input / 2; i <= j; i++) {
			if (input % i == 0) {
				return false;
			}
		}
		return true;
	}

	int findSumOfPrimesBetween(int from, int to) {
		// Student code begins here
		int sum = 0;

		if (from > to) {
			int temp = from;
			from = to;
			to = temp;
		}

		for (int i = from; i <= to; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}
		return sum;
		
		// Student code ends here
	}

	void printSumOfPrimes(int from, int to) {
		System.out.println(findSumOfPrimesBetween(from, to));
	}

	public static void main(String[] args) {

		if(args.length!=2){
			System.out.println("Exactly 2 inputs required.");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			
			SumOfPrimes obj = new SumOfPrimes();
			obj.printSumOfPrimes(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		
	}
}
