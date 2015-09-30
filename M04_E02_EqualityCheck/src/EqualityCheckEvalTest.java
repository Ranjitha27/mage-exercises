import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EqualityCheckEvalTest {
	@Test
	public void UTC_01() {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null, null);
		assertFalse(c1.equals("A String"));
	}

	@Test
	public void UTC_02() {
		Customer c1 = new Customer();
		Customer c2 = new Customer();

		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));

		c1.setName("Vinod");
		assertFalse(c1.equals(c2));
		assertFalse(c2.equals(c1));

		c2.setName("Vinod");

		assertTrue(c1.equals(c2));
		assertTrue(c2.equals(c1));

	}

	@Test
	public void UTC_03() {
		Customer c1 = new Customer(1, "Vinod", "Bangalore", null,
				"vinod@mailinator.com");
		assertEquals("Vinod", c1.getName());
		assertEquals("Bangalore", c1.getCity());
		assertNull(c1.getPhone());
		assertNotNull(c1.getEmail());
	}
}
