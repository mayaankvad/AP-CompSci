import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ConcicalSquare extends JFrame {

	public static void createSquares(Graphics g, int centerX, int centerY, int count, int radius, Color color1,
			Color color2) {

		for (int i = 0, y = centerY - (radius / 2), x = centerX - (radius / 2); i <= 30; i++, radius -= 25, y = centerY
				- (radius / 2), x = centerX - (radius / 2)) {
			g.setColor(((i % 2) == 0) ? color1 : color2);
			pause(100);
			g.fillRect(x, y, radius, radius);
		}

	}

	public static void main(String[] args) {
		new ConcicalSquare().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public ConcicalSquare() {
		super("Concical Square");
		setSize(800, 800);
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		createSquares(g, 400, 400, 0, 500, Color.BLACK, Color.RED);
	}

}
