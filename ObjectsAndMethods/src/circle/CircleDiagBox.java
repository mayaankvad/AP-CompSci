package circle;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class CircleDiagBox {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(new JFrame(), "Instanciate a Circle? ", "JOptionPane Examples",
				JOptionPane.INFORMATION_MESSAGE);

		// Changes color
		UIManager.put("OptionPane.background", Color.red);
		UIManager.put("Panel.background", Color.green);

		String radText = JOptionPane.showInputDialog("What is the radius of your circle? ");

		double radDouble = Double.parseDouble(radText);

		Circle c = new Circle(radDouble);

		JOptionPane.showMessageDialog(null, c);

	}

}
