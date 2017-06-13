package employee_pairedProgramming;

public class Employee {
	private static final double taxRate = 0.18;
	private String firstName;

	private String lastName;
	private String salary;

	private String employer;
	private String address;
	private String jobEx;
	private String phoneNum;

	private String age;

	public Employee() {
		this.firstName = "DEFAULT";
		this.lastName = "DEFAULT";
		this.employer = "DEFAULT";
		this.address = "DEFAULT";
		this.jobEx = "0";
		this.salary = "0";
		this.age = "0";
		this.phoneNum = "DEFAULT";
	}

	public Employee(String firstName, String lastName, String employer, String address, String jobEx, String salary,
			String age, String phoneNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.employer = employer;
		this.address = address;
		this.jobEx = jobEx;
		this.salary = salary;
		this.age = age;
		this.phoneNum = phoneNum;
	}

	public String getInfo(String property) {
		if (property.equalsIgnoreCase("firstName")) {
			return this.firstName;
		} else if (property.equalsIgnoreCase("lastName")) {
			return this.lastName;
		} else if (property.equalsIgnoreCase("age")) {
			return this.age;
		} else if (property.equalsIgnoreCase("phoneNum")) {
			return this.phoneNum;
		} else if (property.equalsIgnoreCase("salary")) {
			return this.salary;
		} else if (property.equalsIgnoreCase("employer")) {
			return this.employer;
		} else if (property.equalsIgnoreCase("address")) {
			return this.address;
		} else if (property.equalsIgnoreCase("jobEx")) {
			return this.jobEx;
		}
		return null;
	}

	public double getPay() {
		return Double.valueOf(salary) - (Double.valueOf(salary) * taxRate);
	}

	public void setInfo(String property, String value) {
		if (property.equalsIgnoreCase("firstName")) {
			this.firstName = value;
		} else if (property.equalsIgnoreCase("lastName")) {
			this.lastName = value;
		} else if (property.equalsIgnoreCase("age")) {
			this.age = value;
		} else if (property.equalsIgnoreCase("phoneNum")) {
			this.phoneNum = value;
		} else if (property.equalsIgnoreCase("salary")) {
			this.salary = value;
		} else if (property.equalsIgnoreCase("employer")) {
			this.employer = value;
		} else if (property.equalsIgnoreCase("address")) {
			this.address = value;
		} else if (property.equalsIgnoreCase("jobEx")) {
			this.jobEx = value;
		}
	}

	@Override
	public String toString() {
		return "\nEmployee Information: \nFull Name: " + getInfo("firstName") + " " + getInfo("lastName")
				+ "\nEmployer: " + getInfo("employer") + "\nAddress: " + getInfo("address") + "\nAge: " + getInfo("age")
				+ " years" + "\nPhone Number: " + getInfo("phoneNum") + "\nJob Experience: " + getInfo("jobEx")
				+ " years" + "\nSalary: $" + getInfo("salary") + "\nAnnual Pay after tax: " + getPay();
	}

}
