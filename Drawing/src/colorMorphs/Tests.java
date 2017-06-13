package colorMorphs;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Tests extends JFrame {

	public static void main(String[] args) {
		new Tests();

	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	ArrayList<ColoredRectangle> li = new ArrayList<ColoredRectangle>();

	public Tests() {
		super("Colored Tiles");
		setSize(2500, 1000);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {

		while (true) {
			if (li.isEmpty()) {
				li.add(new ColoredRectangle(150, 74, 100, 10, 15, 27, g, 10, 10, getHeight(), getWidth()));
			}

			li.get(0).draw();
			pause(100);
		}

	}

}
