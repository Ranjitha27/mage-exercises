public class DaysInMonthAndYear {
	public int getMaxDays(int month, int year) {
		// Student code begins here
		
		if (month < 1 || month > 12) {
			return -1;
		}
		if (year < 1) {
			return -2;
		}

		switch (month) {
		case 2:
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				return 29;
			}
			return 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		}
		return 31;
		
		// Student code ends here
	}

	public void printMaxDays(int month, int year) {
		System.out.print(getMaxDays(month, year));
	}

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Exactly 2 inputs required");
			return;
		}

		try {
			int num1, num2;
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
			DaysInMonthAndYear obj = new DaysInMonthAndYear();
			obj.printMaxDays(num1, num2);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}
		

	}
}
