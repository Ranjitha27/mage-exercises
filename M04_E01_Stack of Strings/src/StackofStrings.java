
public class StackofStrings {

	public static void main(String[] args) {

		StringStack obj = new StringStack();

		for (String arg : args) {
			obj.push(arg);
		}

		String data, output = "";
		while ((data = obj.pop()) != null) {
			output += data + " ";
		}
		System.out.println(output.trim());

	}
}
