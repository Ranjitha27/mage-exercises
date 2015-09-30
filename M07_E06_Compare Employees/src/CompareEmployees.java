public class CompareEmployees {

	public static boolean compare(String args[]) throws NumberFormatException,
			ArrayIndexOutOfBoundsException, InvalidParameterException {
		Employee e1 = new Employee();
		e1.setId(Integer.parseInt(args[0]));
		e1.setName(args[1]);
		e1.setSalary(Double.parseDouble(args[2]));
		e1.setCommission(Double.parseDouble(args[3]));

		Employee e2 = new Employee();
		e2.setId(Integer.parseInt(args[4]));
		e2.setName(args[5]);
		e2.setSalary(Double.parseDouble(args[6]));
		e2.setCommission(Double.parseDouble(args[7]));

		String field = args[8];
		String operator = args[9];

		return Employee.compare(field, e1, operator, e2);
		
	}

	public static void main(String[] args) {
		try {
			System.out.println(compare(args));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Not enough arguments");
		} catch (NumberFormatException e) {
			System.out.println("Invalid data");
		} catch (InvalidParameterException e) {
			System.out.println("InvalidParameterException");
		}
	}
}
