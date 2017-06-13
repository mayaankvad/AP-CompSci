import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class LineArt extends JFrame {

	public static void main(String[] args) {
		LineArt application = new LineArt();
		application.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public LineArt() {
		super("LineArt2");
		setSize(800, 800);
		getContentPane().setBackground(Color.black);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;

		int numLines = 50;
		int gap = 15;

		int r1 = 150;
		int g1 = 10;
		int b1 = 200;
		int rChange = 10;
		int gChange = -10;
		int bChange = -10;
		int aModifier = 0;
		int bModifier = 0;

		while (true) {
			for (int i = 0; i < 4; i++) {
				for (int l = 0; l <= (gap * numLines); l += gap) {
					switch (i) {
					case 0:
						aModifier = l - (gap * numLines);
						bModifier = l;
						break;
					case 1:
						aModifier = l;
						bModifier = (gap * numLines) - l;
						break;
					case 2:
						aModifier = (gap * numLines) - l;
						bModifier = -l;
						break;
					case 3:
						aModifier = -l;
						bModifier = l - (gap * numLines);
						break;
					}

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

					g2.setColor(new Color(r1, g1, b1));
					g2.drawLine(400, 400 + aModifier, 400 + bModifier, 400);
				}
			}

			try {
				Thread.currentThread();
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}