
public class Student extends User{
	private String studentName;
	private String homeWork;
	
	public Student(int id, String firstName, String lastName, String user, int password, String studentName,
			String homeWork) {
		super(id, firstName, lastName, user, password);
		this.studentName = studentName;
		this.homeWork = homeWork;
	}
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}

	
}
