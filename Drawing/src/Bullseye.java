import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Bullseye extends JFrame {

	public static void createBullseye(Graphics g, int centerX, int centerY, int count, int radius, Color color1,
			Color color2) {

		for (int i = 0, y = centerY - (radius / 2), x = centerX - (radius / 2); i <= 30; i++, radius -= 25, y = centerY
				- (radius / 2), x = centerX - (radius / 2)) {
			g.setColor(((i % 2) == 0) ? color1 : color2);
			pause(100);
			g.fillOval(x, y, radius, radius);
		}

	}

	public static void main(String[] args) {
		new Bullseye().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Bullseye() {
		super("Bullseye");
		setSize(800, 800);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		createBullseye(g, 400, 400, 0, 500, Color.BLACK, Color.RED);
	}

}
