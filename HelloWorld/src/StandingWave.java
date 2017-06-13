import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class StandingWave extends JFrame {
	// g2.drawOval( 50 + i, 50 + i, 700 - i, 700 - i );
	// g2.drawRect( 152 + i, 152 + i, 495 - i, 495 - i );
	// g2.drawLine( 60, 60, 80, 90);

	public static void main(String[] args) {
		StandingWave application = new StandingWave();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public StandingWave() {
		super("StandingWave");
		setSize(800, 800);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(1));

		double wavelength = 50.0;
		int modifier = 1;
		int multiplier = 0;
		int max = 100;

		while (true) {
			for (int i = 0; i <= 800; i += 1) {
				g2.setColor(new Color((int) ((Math.sin(i / wavelength) * multiplier) + max),
						(int) ((Math.sin(i / wavelength) * multiplier) + max),
						(int) ((Math.sin(i / wavelength) * multiplier) + max)));

				g2.drawLine(i, 0, i, 800);
			}

			try {
				Thread.currentThread();
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			if ((multiplier == -max) || (multiplier == max)) {
				modifier = -modifier;
			}

			multiplier += modifier;
		}
	}
}