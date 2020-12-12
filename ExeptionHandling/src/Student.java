
public class Student {

	
	String name;
	String email;
	String mobileNumber;
	Grades []grades;
	public Student(String name, String email, String mobileNumber, Grades[] grades) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
		this.grades = grades;
	}
	public Student(String name, String email, String mobileNumber) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Grades[] getGrades() {
		return grades;
	}
	public void setGrades(Grades[] grades) {
		this.grades = grades;
	}
	
}
