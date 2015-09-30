
public class StringStack {

	// STUDENT CODE BEGINS HERE
	
	private String[] strings;
	private int topIndex = -1;

	public StringStack() {
		this(5);
	}

	public StringStack(int size) {
		size = Math.abs(size);
		strings = new String[size];
	}

	public boolean push(String string) {
		if (topIndex == strings.length - 1) {
			return false;
		}
		if (string != null && string.trim().equals("") == false) {
			strings[++topIndex] = string;
			return true;
		}
		return false;
	}

	public String pop() {
		if (topIndex != -1) {
			return strings[topIndex--];
		}
		return null;
	}
	
	// STUDENT CODE ENDS HERE

}
