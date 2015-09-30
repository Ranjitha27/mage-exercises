import java.util.Map;
import java.util.TreeMap;

public class WordCount {

	public Map<String, Integer> countWords(String input) {

		// Student code starts here

		Map<String, Integer> map = new TreeMap<String, Integer>();

		if (input == null) {
			return map;
		}

		input = input.toLowerCase();
		input = input.replaceAll("[^a-z0-9]", " ");

		String[] words = input.split("\\s");
		for (String word : words) {
			if (word.trim().length() == 0) {
				continue;
			}

			Integer count = 1;
			if (map.containsKey(word)) {
				count = map.get(word) + 1;
			}
			map.put(word, count);
		}

		return map;

		// Student code ends here
	}

	public static void main(String[] args) {

		WordCount wc = new WordCount();
		String words = "";

		if (args.length == 0) {
			words = null;
		} else if (args.length == 1 && args[0].equals("null")) {
			words = null;
		} else {
			for (String arg : args) {
				words += arg + " ";
			}
		}

		Map<String, Integer> map = wc.countWords(words);
		System.out.println(map);

	}
}
