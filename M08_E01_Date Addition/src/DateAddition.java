import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAddition {

	public String addDate(String date, int units, char what) {
		// Student code begins here
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		sdf.setLenient(false);

		try {
			Date dt = sdf.parse(date);
			Calendar cal = Calendar.getInstance();
			cal.setTime(dt);

			switch (what) {
			case 'D':
				cal.add(Calendar.DATE, units);
				break;
			case 'M':
				cal.add(Calendar.MONTH, units);
				break;
			case 'Y':
				cal.add(Calendar.YEAR, units);
				break;
			default:
				throw new InvalidParameterException();
			}

			dt.setTime(cal.getTimeInMillis());

			sdf = new SimpleDateFormat("yyyy-MM-dd");
			return sdf.format(dt);

		} catch (ParseException e) {
			throw new InvalidParameterException();
		}
		
		// Student code ends here
	}

	public static void main(String[] args) {

		if (args.length != 3) {
			System.out.println("Exactly 3 inputs required.");
			return;
		}

		DateAddition obj = new DateAddition();

		try {
			String date = args[0];
			int units = Integer.parseInt(args[1]);
			if (args[2].length() > 1) {
				throw new Exception();
			}
			char what = args[2].charAt(0);

			System.out.println(obj.addDate(date, units, what));
		} catch (InvalidParameterException e) {
			System.out.println("InvalidParameterException");
		} catch (Exception e) {
			System.out.println("One or more of the inputs were wrong!");
		}
	}
}
