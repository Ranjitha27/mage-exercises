import java.util.ArrayList;
import java.util.List;

public class SumOfListElements {
	public List<Integer> getSumOfListElements(List<Integer> list1,
			List<Integer> list2) {

		// Student code begins here
		
		if (list1 == null) {
			list1 = new ArrayList<Integer>();
		}
		if (list2 == null) {
			list2 = new ArrayList<Integer>();
		}

		List<Integer> small = list1.size() < list2.size() ? list1 : list2;
		List<Integer> big = list1.size() < list2.size() ? list2 : list1;

		List<Integer> ret = new ArrayList<Integer>();

		for (int i = 0, j = small.size(); i < j; i++) {
			ret.add(small.get(i) + big.get(i));
		}

		for (int i = small.size(), j = big.size(); i < j; i++) {
			ret.add(big.get(i));
		}
		return ret;
		
		// Student code ends here
		
	}

	public void printSumOfListElements(List<Integer> list1, List<Integer> list2) {
		System.out.println(getSumOfListElements(list1, list2));
	}

	public static void main(String[] args) {
		List<Integer> list1 = null;
		List<Integer> list2 = null;

		String input1 = "", input2 = "";
		if (args.length == 1) {
			list1 = new ArrayList<Integer>();
			input1 = args[0];
		} else if (args.length == 2) {
			list1 = new ArrayList<Integer>();
			list2 = new ArrayList<Integer>();
			input1 = args[0];
			input2 = args[1];
		}

		try {
			String[] ar1 = input1.split(",");
			String[] ar2 = input2.split(",");

			if (!input1.trim().equals("")) {
				for (String s : ar1) {
					list1.add(new Integer(s.trim()));
				}
			}
			if (!input2.trim().equals("")) {
				for (String s : ar2) {
					list2.add(new Integer(s.trim()));
				}
			}

			SumOfListElements obj = new SumOfListElements();
			obj.printSumOfListElements(list1, list2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Invalid input/s.");
		}
	}
}
