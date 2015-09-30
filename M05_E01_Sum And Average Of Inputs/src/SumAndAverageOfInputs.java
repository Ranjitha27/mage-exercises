public class SumAndAverageOfInputs {

	public static void main(String[] args) {

		// STUDENT CODE BEGINS HERE
		
		if (args.length == 0) {
			System.out.print("NO INPUT\n");
			return;
		}
		try {
			int size = Integer.parseInt(args[0]);
			if (size < 0) {
				System.out.print("FIRST ARGUMENT SHOULD BE >0\n");
			} else if (args.length < size + 1) {
				System.out.print("INSUFFICIENT INPUTS\n");
			} else {
				double sum = 0, avg = 0;
				int ni = 0, nni = 0;

				for (int i = 1; i <= size; i++) {
					try {
						sum += Double.parseDouble(args[i]);
						ni++;
					} catch (NumberFormatException e) {
						nni++;
					}
				}
				avg = sum / ni;

				System.out.print("THE SUM IS " + sum + "\n");
				System.out.print("THE AVERAGE IS " + avg+ "\n");
				System.out.print("NUMERICAL INPUTS " + ni+ "\n");
				System.out.print("NON NUMERICAL INPUTS " + nni+ "\n");
			}
		} catch (NumberFormatException e) {
			System.out.println("FIRST ARGUMENT SHOULD BE INT");
		}

		// STUDENT CODE ENDS HERE
	}
}
