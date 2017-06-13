
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LineArt extends JFrame {

	public static void main(String[] args) {

		LineArt app = new LineArt();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public LineArt() {
		super("Line Art");
		setSize(800, 800);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.fillRect(0, 0, getWidth(), getHeight());
		Graphics2D g2 = (Graphics2D) g;

		int numLines = 32;
		int gap = 20;

		int aModifier = 0;
		int bModifier = 0;

		Color color = Color.BLACK;

		while (true) {
			for (int i = 0; i < 4; i++) {
				for (int l = 0; l <= (gap * numLines); l += gap) {

					switch (i) {
					case 0:
						aModifier = l - (gap * numLines);
						bModifier = l;
						color = Color.RED;
						break;
					case 1:
						aModifier = l;
						bModifier = (gap * numLines) - l;
						color = Color.GREEN;
						break;
					case 2:
						aModifier = (gap * numLines) - l;
						bModifier = -l;
						color = Color.BLUE;
						break;
					case 3:
						aModifier = -l;
						bModifier = l - (gap * numLines);
						color = Color.YELLOW;
						break;
					default:
						color = Color.BLACK;
						break;
					}

					g2.setColor(color);
					g2.drawLine(400, 400 + aModifier, 400 + bModifier, 400);
					pause(100);

				}
			}

		}

	}

}
