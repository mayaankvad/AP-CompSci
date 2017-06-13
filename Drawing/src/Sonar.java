import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Sonar extends JFrame {

	public static int getRandomRange(int min, int max) {
		return new Random(System.currentTimeMillis()).nextInt((max - min) + 1) + min;
	}

	public static void main(String[] args) {
		new Sonar();
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Sonar() {
		super("Sonar");
		setSize(800, 800);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.BLACK);
		startRandomSonars(g, 10);
		// startSonar(g, 400, 400, 30, 10, Color.RED, Color.WHITE, 100);
	}

	public void startRandomSonars(Graphics g, int times) {
		Color[] colors = { Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.MAGENTA,
				Color.ORANGE, Color.RED };
		for (int i = 0; i < times; i++) {
			int x = getRandomRange(30, getWidth());
			int y = getRandomRange(30, getHeight());
			int number = getRandomRange(5, 15);
			int gap = getRandomRange(10, 20);
			Color col = colors[getRandomRange(0, colors.length - 1)];
			int pause = getRandomRange(10, 150);

			startSonar(g, x, y, number, gap, col, Color.BLACK, pause);
		}
	}

	public void startSonar(Graphics g, int centerX, int centerY, int number, int gap, Color color, Color bgColor,
			int pasueMillisec) {
		g.setColor(bgColor);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(color);

		int radius = 10;

		// create
		for (int c = 0; c < number; c++) {
			g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

			radius += gap;
			pause(pasueMillisec);

		}

		// destroy
		g.setColor(bgColor);
		for (int c = 0; c <= number; c++) {
			g.drawOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

			radius -= gap;
			pause(pasueMillisec);

		}

	}

}