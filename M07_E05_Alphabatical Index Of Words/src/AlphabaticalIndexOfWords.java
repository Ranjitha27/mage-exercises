import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class AlphabaticalIndexOfWords {

	public Map<String, Set<String>> getIndex(String input) {

		if (input == null) {
			return null;
		} else if (input.trim().length() == 0) {
			return null;
		}

		input = input.replaceAll("[^a-zA-Z0-9]", " ");
		input = input.replaceAll("\\s", " ");
		String[] args = input.split(" ");

		Map<String, Set<String>> map = new TreeMap<String, Set<String>>();
		for (String arg : args) {
			String firstChar = String.valueOf(arg.charAt(0));
			Set<String> set;
			if (map.containsKey(firstChar)) {
				set = map.get(firstChar);
			} else {
				set = new TreeSet<String>();
			}
			set.add(arg);
			map.put(firstChar, set);
		}

		return map;
	}

	public static void printResult(String input) {
		AlphabaticalIndexOfWords obj = new AlphabaticalIndexOfWords();
		System.out.println(obj.getIndex(input));
	}
	
	public String getResult(String input) {
		AlphabaticalIndexOfWords obj = new AlphabaticalIndexOfWords();
		return String.format("%s", obj.getIndex(input));
	}

	public static void main(String[] args) {

		String input = args.length == 0 ? "null" : args[0];
		if (input.equals("null")) {
			input = null;
		}
		printResult(input);
	}
}
