import java.util.Date;

public class Customer {

	// STUDENT CODE BEGINS HERE

	private int id;
	private String name;
	private Date birthDate;
	private String city;

	public Customer() {
	}

	public Customer(int id, String name, String birthDate, String city) {
		this.id = id;
		this.name = name;
		this.birthDate = Utilities.stringToDate(birthDate);
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = Utilities.stringToDate(birthDate);
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// STUDENT CODE ENDS HERE
}
