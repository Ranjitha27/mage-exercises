import org.junit.Test;
import static org.junit.Assert.*;

public class EmployeeManagerTest {

	@Test
	public void UTC_01() {
		Manager manager = new Manager(1122, "Scott", 2300.0, "ACME", "20-01-2014");

		assertEquals(1122, manager.getId());
		assertEquals("Scott", manager.getName());
		assertEquals((Double) 2300.0, (Double) manager.getSalary());
		assertEquals("ACME", manager.getCurrentProject());
		assertEquals(Utilities.stringToDate("20-01-2014"),
				manager.getProjectStartDate());

	}
	
	@Test
	public void UTC_02() {
		Employee employee = new Manager(1122, "Scott", 2300.0, "ACME", "20-01-2014");

		assertEquals(1122, employee.getId());
		assertEquals("Scott", employee.getName());
		assertEquals((Double) 2300.0, (Double) employee.getSalary());

	}
}
