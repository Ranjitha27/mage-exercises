import java.util.Date;

public class Manager extends Employee {

	// STUDENT CODE BEGINS HERE
	
	private String currentProject;
	private Date projectStartDate;

	public Manager() {
	}

	public Manager(int id, String name, double salary, String currentProject,
			String projectStartDate) {
		super(id, name, salary);
		this.currentProject = currentProject;
		this.projectStartDate = Utilities.stringToDate(projectStartDate);
	}

	public String getCurrentProject() {
		return currentProject;
	}

	public void setCurrentProject(String currentProject) {
		this.currentProject = currentProject;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = Utilities.stringToDate(projectStartDate);
	}

	// STUDENT CODE ENDS HERE
}
