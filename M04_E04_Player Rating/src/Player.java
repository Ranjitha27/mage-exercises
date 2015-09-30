public abstract class Player {

	// STUDENT CODE BEGINS HERE

	private String firstName;
	private String lastName;

	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public abstract int getRating();

	// STUDENT CODE ENDS HERE
}
