import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FetchUniqueWordsFromParagraph {
	public List<String> fetchUniqueWords(String paragraph, int mode) {
		
		// STUDENT CODE BEGINS HERE
		
		if (mode != 1 && mode != 2) {
			return null;
		}
		if (paragraph == null) {
			return null;
		}

		paragraph = paragraph.replaceAll("[^a-zA-Z0-9]", " ");
		paragraph = paragraph.replace("\\s", " ");
		String[] words = paragraph.split(" ");
		Set<String> wordSet = new HashSet<String>();
		wordSet.addAll(Arrays.asList(words));
		wordSet.remove("");

		List<String> list = new ArrayList<String>();
		list.addAll(wordSet);

		if (mode == 1) {
			Collections.sort(list);
		} else if (mode == 2) {
			Collections.sort(list, new Comparator<String>() {

				@Override
				public int compare(String word1, String word2) {
					int ret = word1.length() - word2.length();
					if (ret == 0) {
						ret = word1.compareTo(word2);
					}
					return ret;
				}
			});
		}

		return list;
		
		// STUDENT CODE ENDS HERE
	}

	public static void printResult(String paragraph, int mode) {

		FetchUniqueWordsFromParagraph obj = new FetchUniqueWordsFromParagraph();
		System.out.println(obj.fetchUniqueWords(paragraph, mode));

	}

	public static void main(String[] args) {

		try {
			String paragraph = args[0];
			int mode = Integer.parseInt(args[1]);

			printResult(paragraph, mode);
		} catch (NumberFormatException e) {
			System.out.println("Invalid mode. Expecting an int");
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid number of arguments. Expecting a string and a number");
		}
	}
}
