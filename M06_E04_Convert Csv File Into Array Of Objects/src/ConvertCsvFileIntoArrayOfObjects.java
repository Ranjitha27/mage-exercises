import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ConvertCsvFileIntoArrayOfObjects {

	public static Object[][] convert(String filename) {

		// STUDENT CODE BEGINS HERE

		if (filename == null || filename.trim().length() == 0) {
			return null;
		}
		List<Object[]> list = new ArrayList<Object[]>();
		try {
			FileReader reader = new FileReader(filename);
			BufferedReader in = new BufferedReader(reader);
			String curr = null;

			while ((curr = in.readLine()) != null) {
				Object[] data = getArray(curr);
				list.add(data);
			}
			in.close();
			reader.close();
		} catch (FileNotFoundException e) {
			return null;
		} catch (Exception e) {
			return null;
		}

		Object[][] ret = new Object[list.size()][];
		int i = 0;
		for (Object[] item : list) {
			ret[i++] = item;
		}

		return ret;

		// STUDENT CODE ENDS HERE
	}

	// STUDENT CODE BEGINS HERE

	private static Object[] getArray(String curr) {
		String[] values = curr.split(",");
		Object[] ret = new Object[values.length];
		for (int i = 0; i < values.length; i++) {
			String value = values[i].trim();
			try {
				ret[i] = Integer.parseInt(value);
			} catch (NumberFormatException e) {
				try {
					ret[i] = Double.parseDouble(value);
				} catch (Exception e2) {
					ret[i] = value;
				}
			}
		}
		return ret;
	}
	
	// STUDENT CODE ENDS HERE


	static void printConverted(String filename) {
		Object[][] converted = convert(filename);
		if (converted == null) {
			System.out.println("null");
		} else if (converted.length == 0) {
			System.out.println("Empty file!");
		} else {
			for (Object[] row : converted) {
				for (Object item : row) {
					System.out.println(item.getClass().getName() + ":" + item);
				}
				System.out.println("EOL-----------------");
			}
		}
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			args = new String[] { null };
		}
		printConverted(args[0]);
	}

}
