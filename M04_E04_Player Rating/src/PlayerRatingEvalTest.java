import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerRatingEvalTest {

	@Test
	public void UTC_01() {
		Player p = new FootballPlayer("John", "Doe", 50);
		assertEquals(5, p.getRating());
	}

	@Test
	public void UTC_02() {
		Player p = new CricketPlayer("John", "Doe", 23);
		assertEquals(2, p.getRating());
	}

	@Test
	public void UTC_03() {
		Player p = new FootballPlayer("John", "Doe", 10);
		assertEquals(2, p.getRating());
	}

	@Test
	public void UTC_04() {
		Player p = new CricketPlayer("John", "Doe", 56.4);
		assertEquals(7, p.getRating());
	}

	@Test
	public void UTC_05() {
		Player p = new CricketPlayer("John", "Doe", 56.4);
		assertEquals("John Doe", p.getName());
	}

	@Test
	public void UTC_06() {
		Player p = new FootballPlayer("John", "Doe", 5);
		assertEquals("John Doe", p.getName());
	}
}
