package colorMorphs;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ColoredRectRunner extends JFrame {

	public static ArrayList<ColoredRectangle> generateTiles(Graphics g, int size, int gap, int Xbound, int Ybound,
			int red, int blue, int green, int rc, int gc, int bc) {
		ArrayList<ColoredRectangle> tiles = new ArrayList<ColoredRectangle>();

		for (int col = 30; col <= Ybound; col += size + gap) {
			for (int row = 30; row <= Xbound; row += size + gap) {

				Random rdn = new Random(new Random().nextInt(new Random().nextInt(9999999)));
				tiles.add(new ColoredRectangle(rdn.nextInt(red), rdn.nextInt(blue), rdn.nextInt(green), rdn.nextInt(rc),
						rdn.nextInt(gc), rdn.nextInt(bc), g, row, col, size, size));

			}
		}

		return tiles;
	}

	public static void main(String[] args) {
		new ColoredRectRunner();
	}

	public static void pause(int milliseconds) {
		try {
			Thread.currentThread();
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void startDraw(ArrayList<ColoredRectangle> rects) {
		for (ColoredRectangle r : rects) {
			r.draw();
		}
	}

	public ColoredRectRunner() {
		super("Colored Tiles");
		setSize(2500, 1000);
		setVisible(true);
		repaint();
	}

	@Override
	public void paint(Graphics g) {

		int rb = 75;
		int gb = 75;
		int bb = 150;

		int rc = 7;
		int gc = 6;
		int bc = 15;

		int size = 50;
		int gap = 5;

		int pause = 10;

		super.paint(g);
		g.fillRect(0, 0, getWidth(), getHeight());

		ArrayList<ColoredRectangle> rref = generateTiles(g, size, gap, getWidth(), getHeight(), rb, gb, bb, rc, gc, bc);

		for (; true;) {
			startDraw(rref);
			pause(pause);
			// if(i % 102468 == 0)
			rref = generateTiles(g, size, gap, getWidth(), getHeight(), rb, gb, bb, rc, gc, bc);
		}

	}

}
