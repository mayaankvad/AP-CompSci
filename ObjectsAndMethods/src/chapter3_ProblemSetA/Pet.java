package chapter3_ProblemSetA;

import javax.swing.JOptionPane;

public class Pet {

	public static void main(String[] args) {

		Pet p = new Pet();

		p.setInfo("name", JOptionPane.showInputDialog("Enter Pet's Name: "));
		p.setInfo("type", JOptionPane.showInputDialog("Enter Pet's Type: "));
		p.setInfo("age", JOptionPane.showInputDialog("Enter Pet's Age: "));

		JOptionPane.showMessageDialog(null, "Information for Pet: \n \t Name: " + p.getInfo("name") + "\n \t Age: "
				+ p.getInfo("age") + "\n \t Type: " + p.getInfo("type"));

	}

	private String name;
	private String type;

	private String age;

	public Pet() {

	}

	public Pet(String name, String type, String age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	public String getInfo(String property) {
		if (property.equalsIgnoreCase("name")) {
			return this.name;
		}
		if (property.equalsIgnoreCase("type")) {
			return this.type;
		}
		if (property.equalsIgnoreCase("age")) {
			return this.age;
		}
		return null;
	}

	public void setInfo(String property, String value) {
		if (property.equalsIgnoreCase("name")) {
			this.name = value;
		} else if (property.equalsIgnoreCase("type")) {
			this.type = value;
		} else if (property.equalsIgnoreCase("age")) {
			this.age = value;
		}
	}

}
