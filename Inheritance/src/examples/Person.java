package examples;

public class Person {

	private String myName;
	private int myAge;
	private String myGender; // "M" or "F"

	public Person(String name, int age, String gender) {
		setMyName(name);
		setMyAge(age);
		setMyGender(gender);
	}

	public int getMyAge() {
		return myAge;
	}

	public String getMyGender() {
		return myGender;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}

	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	@Override
	public String toString() {
		return myName + " age: " + myAge + " gender: " + myGender;
	}

}
