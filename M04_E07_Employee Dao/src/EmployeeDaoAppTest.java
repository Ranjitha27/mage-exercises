import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmployeeDaoAppTest {

	EmployeeDao dao;

	@Before
	public void init() {
		dao = new HashMapEmployeeDao();
		dao.addEmployee(new Employee(7788, "Scott", 3300.0));
		dao.addEmployee(new Employee(7654, "Smith", 800.0));
		dao.addEmployee(new Employee(7865, "Miller", 2300.0));
		dao.addEmployee(new Employee(4563, "John", 1200.0));
	}

	@Test
	public void UTC_01() {
		assertTrue(dao.addEmployee(new Employee(1234, "Jane", 3300.0)));
	}

	@Test
	public void UTC_02() {
		assertTrue(dao.updateEmployee(7788, new Employee(1234, "Jane", 3500.0)));
		Employee e = dao.getEmployee(7788);
		assertEquals((Double) e.getSalary(), (Double) 3500.0);

	}
}
