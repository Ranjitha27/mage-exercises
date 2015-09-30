import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

	@Test
	public void UTC_01() {
		Customer customer = new Customer(1122, "Scott", "20-03-1767", "Dallas");
		assertNotNull(customer.getBirthDate());
		assertEquals("Scott", customer.getName());
		assertEquals("Dallas", customer.getCity());
	}

	@Test
	public void UTC_02() {
		Customer c1 = new Customer(1122, "Scott", "20-03-1767", "Dallas");
		Customer c2 = new Customer(1122, "Scott", "20-03-1767", "Dallas");

		assertEquals(true, c1.hashCode() == c2.hashCode());
	}
}
