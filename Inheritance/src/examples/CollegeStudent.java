package examples;

public class CollegeStudent extends Student {

	public String major;
	private int year;

	public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
		super(name, age, gender, idNum, gpa);
		setMajor(major);
		setYear(year);
	}

	public String getMajor() {
		return major;
	}

	public int getYear() {
		return year;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() + " major: " + major + " year: " + year;
	}

}
