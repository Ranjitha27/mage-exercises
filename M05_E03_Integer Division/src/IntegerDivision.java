public class IntegerDivision {

	public static void main(String[] args) {
		// STUDENT CODE BEGINS HERE
		
		try {
			int n = Integer.parseInt(args[0]);
			int d = Integer.parseInt(args[1]);
			int q = n / d;
			System.out.print("Quotient=" + q);
		} catch (NumberFormatException e) {
			System.out.print("A non-integer input was given");
		} catch (ArithmeticException e) {
			System.out.print("Attempted to divide by zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("2 inputs were not supplied");
		}
		
		// STUDENT CODE ENDS HERE
	}
}
