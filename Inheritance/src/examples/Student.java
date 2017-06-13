package examples;

public class Student extends Person {

	public String myIdNum;
	public double myGPA;

	public Student(String name, int age, String gender, String idNum, double gpa) {
		super(name, age, gender);
		setMyIdNum(idNum);
		setMyGPA(gpa);
	}

	public String distinction() {
		return "";
	}

	public double getMyGPA() {
		return myGPA;
	}

	public String getMyIdNum() {
		return myIdNum;
	}

	public void setMyGPA(double myGPA) {
		this.myGPA = myGPA;
	}

	public void setMyIdNum(String myIdNum) {
		this.myIdNum = myIdNum;
	}

	@Override
	public String toString() {
		return super.toString() + " id: " + myIdNum + " GPA: " + myGPA;

	}

}
