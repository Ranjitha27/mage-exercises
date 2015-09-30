public class JulianDate {
	
	private boolean isLeap(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}

	private int maxDays(int year) {
		return isLeap(year) ? 366 : 365;
	}

	private int maxDays(int month, int year) {
		switch (month) {
		case 2:
			return isLeap(year) ? 29 : 28;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;

		}
		return 31;
	}

	public int getJulianDate(int d, int m, int y) {
		// Student code begins here

		if (y <= 0) {
			return -1;
		}
		if (m < 1 || m > 12) {
			return -2;
		}
		int max = maxDays(m, y);
		if (d < 1 || d > max) {
			return -3;
		}

		int jd = d;

		for (int i = 1900; i < y; i++) {
			jd += maxDays(i);
		}

		for (int i = 1; i < m; i++) {
			jd += maxDays(i, y);
		}

		return jd;

		// Student code ends here
	}

	public void printJulianDate(int d, int m, int y) {
		System.out.println(getJulianDate(d, m, y));
	}

	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("Exactly 3 inputs required");
			return;
		}

		try {
			int d, m, y;
			d = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
			y = Integer.parseInt(args[2]);
			JulianDate obj = new JulianDate();

			obj.printJulianDate(d, m, y);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}

	}
}
