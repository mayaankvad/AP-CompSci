package employee_pairedProgramming;

import javax.swing.JOptionPane;

public class Tester {

	public static Employee createEmployee() {
		if (JOptionPane.showConfirmDialog(null, "Make A New Employee? ", null,
				JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			String fname = JOptionPane.showInputDialog(null, "Enter First Name of Employee: ");
			String lname = JOptionPane.showInputDialog(null, "Enter Last Name of Employee: ");
			String emp = JOptionPane.showInputDialog(null, "Enter The Employer of Employee: ");
			String address = JOptionPane.showInputDialog(null, "Enter Address of the Employee: ");
			String jobEx = JOptionPane.showInputDialog(null, "Enter the Job Experience (in years) of Employee: ");
			String sal = JOptionPane.showInputDialog(null, "Enter the salary of Employee: ");
			String age = JOptionPane.showInputDialog(null, "Enter Age of Employee: ");
			String num = JOptionPane.showInputDialog(null, "Enter Phone Number of Employee: ");

			Employee temp = new Employee(fname, lname, emp, address, jobEx, sal, age, num);
			JOptionPane.showMessageDialog(null, temp);
			return temp;

		} else {
			return null;
		}
	}

	public static void main(String[] args) {

		Employee one = new Employee("Stanley", "W", "Apple", "12 Minster rd", "5", "1000000", "16", "770-309-3888");
		System.out.println(one);

		@SuppressWarnings("unused")
		Employee x = createEmployee();

	}

}
