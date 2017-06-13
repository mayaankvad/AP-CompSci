import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Illusion2 extends JFrame {

	public static void main(String[] args) {
		new Illusion2();
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Illusion2() {
		super("Drawing Lines");
		setSize(800, 800);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(Color.BLACK);
		for (int y = 20; y <= getHeight(); y += 50) {
			for (int x = 20; x <= getWidth(); x += 50) {
				g.fillRect(x, y, 40, 40);
				pause(10);
			}
		}
	}

}
