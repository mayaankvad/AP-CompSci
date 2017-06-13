package examples;

public class GradStudent extends CollegeStudent {

	public GradStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
		super(name, age, gender, idNum, gpa, year, major);
	}

	@Override
	public String distinction() {
		return "";
	}

}
