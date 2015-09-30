import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

	// STUDENT CODE BEGINS HERE
	
	public static Date stringToDate(String birthDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);

		try {
			return sdf.parse(birthDate);
		} catch (ParseException e) {
			return null;
		}
	}

	// STUDENT CODE ENDS HERE
}
