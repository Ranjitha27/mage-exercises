import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerRatingTest {

	@Test
	public void UTC_01() {
		Player p = new FootballPlayer("John", "Doe", 23);
		assertEquals(5, p.getRating());
	}

	@Test
	public void UTC_02() {
		Player p = new CricketPlayer("John", "Doe", 23);
		assertEquals(2, p.getRating());
	}
}
