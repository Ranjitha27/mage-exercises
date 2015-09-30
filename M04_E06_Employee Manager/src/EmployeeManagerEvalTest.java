import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class EmployeeManagerEvalTest {
	@Test
	public void UTC_01() {
		Manager manager = new Manager();

		manager.setId(1122);
		manager.setName("Scott");
		manager.setCurrentProject("ACME");
		manager.setSalary(2300.0);
		manager.setProjectStartDate("20-01-2014");

		assertEquals(1122, manager.getId());
		assertEquals("Scott", manager.getName());
		assertEquals((Double) 2300.0, (Double) manager.getSalary());
		assertEquals("ACME", manager.getCurrentProject());
		assertEquals(Utilities.stringToDate("20-01-2014"),
				manager.getProjectStartDate());

	}

	@Test
	public void UTC_02() {
		Employee employee = new Manager();

		employee.setId(1122);
		employee.setName("Scott");
		employee.setSalary(2300.0);

		assertEquals(1122, employee.getId());
		assertEquals("Scott", employee.getName());
		assertEquals((Double) 2300.0, (Double) employee.getSalary());

	}

	@Test
	public void UTC_03() {
		Manager manager = new Manager(1122, "Scott", 2300.0, "ACME",
				"20-01-2014");

		manager.setProjectStartDate("22-22-2014");

		assertEquals(1122, manager.getId());
		assertEquals("Scott", manager.getName());
		assertEquals((Double) 2300.0, (Double) manager.getSalary());
		assertEquals("ACME", manager.getCurrentProject());
		assertNull(manager.getProjectStartDate());

	}

	@Test
	public void UTC_04() {
		Manager manager = new Manager(1122, "Scott", 2300.0, "ACME",
				"20-01-2014");

		manager.setProjectStartDate("22-22-2014");
		
		Employee employee = (Employee) manager;
		employee.setId(2233);
		employee.setName("Miller");
		employee.setSalary(3499.0);


		assertEquals(2233, manager.getId());
		assertEquals("Miller", manager.getName());
		assertEquals((Double) 3499.0, (Double) manager.getSalary());
		assertEquals("ACME", ((Manager)employee).getCurrentProject());
		assertNull(((Manager)employee).getProjectStartDate());

	}
}
