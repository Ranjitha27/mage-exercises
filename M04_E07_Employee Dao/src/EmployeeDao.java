public interface EmployeeDao {
	public boolean addEmployee(Employee employee);

	public Employee getEmployee(int id);

	public boolean updateEmployee(int id, Employee employee);

	public boolean deleteEmployee(int id);
}
