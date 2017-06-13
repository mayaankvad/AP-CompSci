import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PointsAndLines extends JFrame {

	public static void main(String[] args) {
		new PointsAndLines();

	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public PointsAndLines() {
		super("Points And Lines");
		setSize(650, 650);
		setVisible(true);
	}

	public void drawLines(Graphics g, int seed, Color... colors) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		((Graphics2D) g).setStroke(new BasicStroke(5));

		Point2D.Double one = new Point2D.Double(0, 0);
		Point2D.Double two = new Point2D.Double(0, 0);

		// DRAW
		Random col = new Random();
		Random rdn = new Random(seed);
		for (int i = 0; i <= 10; i++) {
			g.setColor(colors[col.nextInt(colors.length)]);
			if ((i % 2) == 0) {
				two.setLocation(rdn.nextInt(getWidth()), rdn.nextInt(getHeight()));
			} else {
				one.setLocation(rdn.nextInt(getWidth()), rdn.nextInt(getHeight()));
			}

			g.drawLine((int) one.getX(), (int) one.getY(), (int) two.getX(), (int) two.getY());
			pause(250);

		}

		// ERASE
		g.setColor(Color.BLACK);
		rdn = new Random(seed);
		one = new Point2D.Double(0, 0);
		two = new Point2D.Double(0, 0);
		for (int i = 0; i <= 10; i++) {

			if ((i % 2) == 0) {
				two.setLocation(rdn.nextInt(getWidth()), rdn.nextInt(getHeight()));
			} else {
				one.setLocation(rdn.nextInt(getWidth()), rdn.nextInt(getHeight()));
			}

			g.drawLine((int) one.getX(), (int) one.getY(), (int) two.getX(), (int) two.getY());
			pause(250);

		}
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Random rdn = new Random(02062001); // hardcoded seed
		for (int i = 0; i <= 4; i++) {
			drawLines(g, rdn.nextInt(999999999), Color.WHITE, Color.BLUE, Color.CYAN, Color.PINK, Color.ORANGE,
					Color.MAGENTA, Color.GREEN);
		}

	}

}