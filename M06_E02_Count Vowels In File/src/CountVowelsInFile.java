import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountVowelsInFile {

	public static void main(String[] args) {

		// STUDENT CODE BEGINS HERE

		if (args.length != 1) {
			System.out.print("Exactly one argument expected\n");
			return;
		}

		try {
			int v = 0;
			FileReader reader = new FileReader(args[0]);
			while (true) {
				int ch = reader.read();
				if (ch == -1) {
					break;
				}
				if ("aeiouAEIOU".indexOf((char) ch) >= 0) {
					v++;
				}
			}
			System.out.print(v);
			System.out.print("\n");
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.print("Input file does not exist\n");
		} catch (Exception e) {
			System.out.println(e.getClass().getName());
		}

		// STUDENT CODE ENDS HERE
	}
}
