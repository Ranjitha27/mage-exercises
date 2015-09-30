import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTheList {

	public List<String> sort(String input) {
		// Student code begins here
		
		if (input == null || input.equals("")) {
			return new ArrayList<String>();
		}
		List<String> list = Arrays.asList(input.split("[\\s]"));

		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				int ret = Integer.compare(s1.length(), s2.length());
				if (ret == 0) {
					ret = s1.compareTo(s2);
				}
				return ret;
			}
		});

		List<String> list1 = new ArrayList<String>();
		for (String s : list) {
			s = s.trim();
			if (s.equals("")) {
				continue;
			}
			list1.add(s.trim());
		}
		return list1;
		
		// Student code ends here
		
	}

	public void printSorted(String input) {
		System.out.println(sort(input));
	}

	public static void main(String[] args) {
		String input = "";
		
		for (int i = 0; i < args.length; i++) {
			input += args[i] + " ";
		}
		input = input.trim();
		
		if(input.equals("null")){
			input = null;
		}
		SortTheList obj = new SortTheList();
		System.out.print(input + ";");
		obj.printSorted(input);
	}
}
