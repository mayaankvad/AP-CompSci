import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Spiral extends JFrame {

	public static void main(String[] args) {
		new Spiral();

	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Spiral() {
		super("tests");
		setSize(800, 800);
		setVisible(true);
		repaint();
	}

	public void drawSpiral(Graphics g, int centerX, int centerY, int space, int size, int pause) {

		int r1 = 10;
		int g1 = 100;
		int b1 = 200;
		int rChange = 20;
		int gChange = -20;
		int bChange = -20;

		Color color;
		while (true) {

			if (((r1 + rChange) > 255) || ((r1 + rChange) < 0)) {
				rChange = -rChange;
			}
			if (((g1 + gChange) > 255) || ((g1 + gChange) < 0)) {
				gChange = -gChange;
			}
			if (((b1 + bChange) > 255) || ((b1 + bChange) < 0)) {
				bChange = -bChange;
			}

			r1 += rChange;
			g1 += gChange;
			b1 += bChange;

			color = new Color(r1, g1, b1);
			g.setColor(color);
			((Graphics2D) g).setStroke(new BasicStroke(2));

			int x1 = centerX;
			int y1 = centerY;
			int x2 = x1;
			int y2 = y1;
			int gap = space;

			for (int i = 1; i <= size; i++) {

				g.drawLine(x1, y1, x2, y2);

				x1 = x2;
				y1 = y2;

				if ((i % 4) == 0) {
					x2 += gap;
				} else if ((i % 4) == 1) {
					y2 -= gap;
				} else if ((i % 4) == 2) {
					x2 -= gap;
				} else if ((i % 4) == 3) {
					y2 += gap;
				}

				gap += 5;
				pause(pause);

			}
			// pause(pause);
		}

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(0, 0, 800, 800);
		drawSpiral(g, 400, 400, 5, 100, 100);
	}

}
