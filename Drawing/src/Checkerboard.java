import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Checkerboard extends JFrame {

	public static void drawCheckerboard(Graphics g, int centerX, int centerY, int size, Color color1, Color color2) {
		for (int y = centerY - (4 * size), row = 1; row <= 8; row++, y += size) {

			for (int x = centerX - (4 * size), col = 1; col <= 8; col++, x += size) {
				Color color = (((row % 2) == 0) ? (((col % 2) == 0) ? color1 : color2)
						: (((col % 2) == 0) ? color2 : color1));

				g.setColor(color);
				g.fillRect(x, y, size, size);

			}

		}

	}

	public static void main(String[] args) {
		new Checkerboard();
	}

	public Checkerboard() {
		super("Checkerboard");
		setSize(800, 800);
		setVisible(true);
		setResizable(true);
		repaint();
	}

	public void onResize() {

	}

	@Override
	public void paint(Graphics g) {
		drawCheckerboard(g, getWidth() / 2, getHeight() / 2, 40, Color.BLACK, Color.RED);
	}

}
