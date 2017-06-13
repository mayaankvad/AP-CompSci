package chapter3_ProblemSetA;

public class PersonalInformation {

	public static void main(String[] args) {
		PersonalInformation me = new PersonalInformation("Mayaank Vadlamani", "16", "732-567-4753");
		PersonalInformation yogi = new PersonalInformation("Yogi Patel", "16", "112-233-3444");
		PersonalInformation lizzie = new PersonalInformation("Lizzie Johnson", "16", "556-677-7888");

		System.out.println(me + "\n\n");
		System.out.println(yogi + "\n\n");
		System.out.println(lizzie + "\n\n\n");

		me.setInfo("age", "20");
		yogi.setInfo("name", "Yogi Bear");
		lizzie.setInfo("phoneNo", "001-220-0000");

		System.out.println("---- Some Changes Applied -----\n\n");

		System.out.println(me + "\n\n");
		System.out.println(yogi + "\n\n");
		System.out.println(lizzie + "\n\n");

	}

	private String name;
	private String age;

	private String phoneNo;

	public PersonalInformation(String name, String age, String phoneNo) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	/**
	 *
	 * @param info
	 *            the property to return
	 * @return property requested by info
	 */
	public String getInfo(String info) {
		if (info.equalsIgnoreCase("name")) {
			return this.name;
		}
		if (info.equalsIgnoreCase("age")) {
			return this.age;
		}
		if (info.equalsIgnoreCase("phoneNo")) {
			return this.phoneNo;
		}
		return null;
	}

	/**
	 *
	 * @param info
	 *            the property to set
	 * @param property
	 *            the value to set the property to
	 */
	public void setInfo(String property, String value) {
		if (property.equalsIgnoreCase("name")) {
			this.name = value;
		} else if (property.equalsIgnoreCase("age")) {
			this.age = value;
		} else if (property.equalsIgnoreCase("name")) {
			this.phoneNo = value;
		}
	}

	@Override
	public String toString() {
		return "Information for " + getInfo("name") + ": \n" + "\t Name: " + getInfo("name") + "\n\t Age: "
				+ getInfo("age") + "\n\t Phone Number: " + getInfo("phoneNo");
	}

}
