public class FootballPlayer extends Player {

	// STUDENT CODE BEGINS HERE

	private int goals;

	public FootballPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		this.goals = goals;
	}

	@Override
	public int getRating() {
		if (goals > 20) {
			return 5;
		} else if (goals > 15) {
			return 4;
		} else if (goals > 10) {
			return 3;
		} else if (goals > 5) {
			return 2;
		} else {
			return 1;
		}
	}

	// STUDENT CODE ENDS HERE
}
