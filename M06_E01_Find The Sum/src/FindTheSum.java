import java.io.FileInputStream;
import java.io.IOException;

public class FindTheSum {

	public double findSum(String filename) {

		// Student code begins here

		if (filename == null || filename.trim().length() == 0) {
			throw new InvalidParameterException();
		}

		try {
			FileInputStream in = new FileInputStream(filename);
			byte[] bytes = new byte[in.available()];
			String content = "";
			while (in.read(bytes) != -1) {
				content += new String(bytes);
			}
			content = content.replaceAll("-", " -");
			content = content.replaceAll("[^0-9.-]", " ");
			String[] ar = content.split("\\s");

			double sum = 0;

			for (String a : ar) {
				try {
					sum += Double.parseDouble(a);
				} catch (NumberFormatException e) {
				}
			}
			in.close();

			return sum;
		} catch (IOException e) {
			throw new InvalidParameterException();
		}

		// Student code ends here

	}

	public static void main(String[] args) {
		try {
			FindTheSum obj = new FindTheSum();
			System.out.println(obj.findSum(args[0]));
		} catch (InvalidParameterException e) {
			System.out.println("InvalidParameterException");
		}
	}
}
