import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class EmployeeDaoAppEvalTest {
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
		assertFalse(dao.addEmployee(new Employee(1234, "Jane", 3300.0)));
	}

	@Test
	public void UTC_02() {
		assertTrue(dao.updateEmployee(7788, new Employee(2233, "Jane", 3500.0)));
		assertNull(dao.getEmployee(2233));
	}

	@Test
	public void UTC_03() {
		assertTrue(dao.deleteEmployee(7788));
		assertFalse(dao.deleteEmployee(7788));
	}

	@Test
	public void UTC_04() {
		Employee e = dao.getEmployee(7788);

		assertEquals(e.getId(), 7788);
		assertEquals(e.getName(), "Scott");
		assertEquals((Double)e.getSalary(), (Double)3300.0);

	}
}
