import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerEvalTest {

	@Test
	public void UTC_01() {
		Customer c1 = new Customer();
		assertNull(c1.getName());
	}

	@Test
	public void UTC_02() {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		assertTrue(c1.hashCode() == c2.hashCode());
	}

	@Test
	public void UTC_03() {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		assertTrue(c1.hashCode() == c2.hashCode());

		c1.setId(1234);
		c1.setName("Smith");
		assertFalse(c1.hashCode() == c2.hashCode());

		c2.setId(1234);
		c2.setName("Smith");
		assertTrue(c1.hashCode() == c2.hashCode());

	}

	@Test
	public void UTC_04() {
		Customer c1 = new Customer();
		c1.setBirthDate("22-22-2000");
		assertNull(c1.getBirthDate());
	}

	@Test
	public void UTC_05() {
		Customer c1 = new Customer();
		Integer hc1 = c1.hashCode();

		c1.setBirthDate("22-22-2000");
		Integer hc2 = c1.hashCode();

		assertEquals(hc1, hc2);
	}
}
