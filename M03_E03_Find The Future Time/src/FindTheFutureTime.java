public class FindTheFutureTime {
	public void addTime(int h, int m, int s, int n) {

		// Student code begins here:

		if (h > 23 || m > 59 || s > 59 || h < 0 || m < 0 || s < 0) {
			System.out.printf("Invalid time input\n");
			return;
		}

		n = Math.abs(n);
		s += n;
		if (s >= 60) {
			m += s / 60;
			s %= 60;

			if (m >= 60) {
				h += m / 60;
				m %= 60;
			}

			if (h >= 24) {
				h %= 24;
			}
		}

		// Student code ends here.

		System.out.printf("%02d:%02d:%02d\n", h, m, s);
	}

	public static void main(String[] args) {
		
		if(args.length!=4){
			System.out.println("Exactly 4 inputs required");
			return;
		}

		try {
			int h, m, s, n;
			h = Integer.parseInt(args[0]);
			m = Integer.parseInt(args[1]);
			s = Integer.parseInt(args[2]);
			n = Integer.parseInt(args[3]);
			
			FindTheFutureTime obj = new FindTheFutureTime();
			obj.addTime(h, m, s, n);
		} catch (NumberFormatException e) {
			System.out.println("Only integers allowed.");
		}

	}
}
