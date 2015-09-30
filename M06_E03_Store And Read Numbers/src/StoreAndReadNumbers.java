import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreAndReadNumbers {
	public void store(Object[] args) {
		// STUDENT CODE STARTS HERE

		String filename = args[0].toString();
		try {
			FileOutputStream file = new FileOutputStream(filename);
			DataOutputStream out = new DataOutputStream(file);

			for (int i = 1; i < args.length; i++) {
				if (args[i] instanceof Double) {
					out.writeDouble((Double) args[i]);
				}
			}
			out.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// STUDENT CODE ENDS HERE
	}

	public Double[] read(String filename) {

		// STUDENT CODE STARTS HERE
		try {
			FileInputStream file = new FileInputStream(filename);
			DataInputStream in = new DataInputStream(file);
			List<Double> list = new ArrayList<Double>();
			while(true){
				try {
					double d = in.readDouble();
					list.add(d);
				} catch (EOFException e) {
					break;
				}
			}
			in.close();
			file.close();
			
			return list.toArray(new Double[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

		// STUDENT CODE ENDS HERE
	}

	public static void main(String[] args) {

		String filename = "numbers.dat";
		List<Object> list = new ArrayList<Object>();
		for (String arg : args) {
			try {
				Double d = new Double(arg);
				list.add(d);
			} catch (NumberFormatException e) {
				list.add(arg);
			}
		}
		list.add(0, filename);

		StoreAndReadNumbers obj = new StoreAndReadNumbers();
		obj.store(list.toArray());
		Double[] data = obj.read(filename);
		System.out.print(Arrays.toString(data));
		System.out.print("\n");

	}
}
