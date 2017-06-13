package guidanceGroup;

public class SatStudent {

	public String name;
	public int math;
	public int verbal;
	public int writing;
	public int grade;

	public SatStudent(String name, int math, int verbal, int writing) {
		this.name = name;
		this.math = math;
		this.verbal = verbal;
		this.writing = writing;
		this.grade = math + verbal + writing;
	}

	@Override
	public String toString() {
		/*
		 * return "{\n\t" + "'name': '" + this.name + "', \n\t" + "'math': '" +
		 * this.math + "', \n\t" + "'verbal': '" + this.verbal + "', \n\t" +
		 * "'writing': '" + this.writing + "', \n\t" + "'grade': '" + this.grade
		 * + "', \n" + "}";
		 */
		return "Name: " + name + "; Math: " + math + "; Verbal: " + verbal + "; writing: " + writing + "; Grade: "
				+ grade + "\n";
	}

}
