import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {

	// STUDENT CODE BEGINS HERE

	private int id;
	private String name;
	private double salary;
	private double commission;

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public static boolean compare(final String field, Employee first,
			String operator, Employee second) throws InvalidParameterException {
		List<String> fields = Arrays.asList("id", "name", "salary",
				"commission");
		if (!fields.contains(field)) {
			throw new InvalidParameterException();
		}
		List<String> operators = Arrays
				.asList("<", "<=", ">", ">=", "==", "!=");
		if (!operators.contains(operator)) {
			throw new InvalidParameterException();
		}

		int status = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				if (field.equals("id")) {
					return Integer.compare(e1.getId(), e2.getId());
				} else if (field.equals("name")) {
					return e1.getName().compareTo(e2.getName());
				} else if (field.equals("salary")) {
					return Double.compare(e1.getSalary(), e2.getSalary());
				} else if (field.equals("commission")) {
					return Double.compare(e1.getCommission(),
							e2.getCommission());
				}
				return 0;
			}
		}.compare(first, second);

		if (operator.equals("<")) {
			return status < 0;
		} else if (operator.equals("<=")) {
			return status <= 0;
		} else if (operator.equals(">")) {
			return status > 0;
		} else if (operator.equals(">=")) {
			return status >= 0;
		} else if (operator.equals("==")) {
			return status == 0;
		} else if (operator.equals("!=")) {
			return status != 0;
		}
		return false;
	}

	// STUDENT CODE ENDS HERE
}
