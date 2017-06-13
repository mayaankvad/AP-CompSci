/**
 * Created by 19mv0714 on 9/15/2016.
 */

public class Student {
	private String name;
	private String id;
	private int credits;

	// Create a new student with default values
	public Student() {
		this.name = "DEFAULT CONSTRUCTOR";
		this.id = "000000";
		this.credits = 0;
	}

	// Create a student with given name and id
	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void addCerdits(int credits) {
		this.credits += credits;
	}

	public int getCredits() {
		return this.credits;
	}

	// Return id
	public String getId() {
		return id;
	}

	// Return the name of this student
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student \n name: " + getName() + "\n id: " + getId() + "\n Credits: " + getCredits();
	}

}
