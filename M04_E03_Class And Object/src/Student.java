public class Student {
	// STUDENT CODE BEGINS HERE
	
	private int rollNumber;
	private String name;
	private final MarksData[] marksData = new MarksData[3];

	public Student() {
	}

	public Student(int rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MarksData[] getMarksData() {
		return marksData;
	}


	public String getGrade() {

		if (marksData != null && marksData.length > 0) {
			double sum = 0;
			for (MarksData md : marksData) {
				sum += md.getMarks();
			}
			double avg = sum / marksData.length;
			if (avg > 80) {
				return "A+";
			} else if (avg > 60) {
				return "A";
			} else if (avg > 50) {
				return "B+";
			} else if (avg > 50) {
				return "B";
			} else if (avg > 40) {
				return "C";
			} else {
				return "D";
			}
		}

		return null;
	}

	// STUDENT CODE ENDS HERE
}
