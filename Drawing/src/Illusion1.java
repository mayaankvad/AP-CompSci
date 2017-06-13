import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Illusion1 extends JFrame {

	public static void main(String[] args) {
		new Illusion1();
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Illusion1() {
		super("Drawing Lines");
		setSize(800, 800);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 800, 800);

		g.setColor(Color.WHITE);
		for (int i = 0; i <= getWidth(); i += 40) {
			g.fillRect(0, i, getWidth(), 10);
			g.fillRect(i, 0, 10, getWidth());
			pause(50);
		}

	}

}
