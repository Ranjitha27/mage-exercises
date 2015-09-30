public class CricketPlayer extends Player {

	// STUDENT CODE BEGINS HERE
	
	private double averageRuns;

	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns = averageRuns;
	}

	@Override
	public int getRating() {
		if (averageRuns > 55) {
			return 7;
		} else if (averageRuns > 50) {
			return 6;
		} else if (averageRuns > 40) {
			return 5;

		} else if (averageRuns > 30) {
			return 3;
		} else if (averageRuns > 20) {
			return 2;
		} else {
			return 1;
		}
	}
	
	// STUDENT CODE ENDS HERE
}
