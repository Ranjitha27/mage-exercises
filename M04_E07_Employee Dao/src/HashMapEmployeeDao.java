import java.util.HashMap;
import java.util.Map;

public class HashMapEmployeeDao implements EmployeeDao {

	private final Map<Integer, Employee> emps = new HashMap<Integer, Employee>();

	@Override
	public boolean addEmployee(Employee employee) {
		if (employee != null && !emps.containsKey(employee.getId())) {
			emps.put(employee.getId(), employee);
			return true;
		}
		return false;
	}

	@Override
	public Employee getEmployee(int id) {
		if (emps.containsKey(id)) {
			return emps.get(id);
		}
		return null;
	}

	@Override
	public boolean updateEmployee(int id, Employee employee) {
		if (employee != null && emps.containsKey(id)) {
			Employee e = emps.get(id);
			e.setName(employee.getName());
			e.setSalary(employee.getSalary());
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployee(int id) {
		if (emps.containsKey(id)) {
			emps.remove(id);
			return true;
		}
		return false;
	}

}
