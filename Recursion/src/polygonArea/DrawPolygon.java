package polygonArea;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DrawPolygon extends JFrame {

	int[] xCoordinates;
	int[] yCoordinates;

	public DrawPolygon(ArrayList<Point> points) {
		super("Polygon");
		setSize(800, 800);
		setVisible(true);
		setResizable(true);

		xCoordinates = new int[points.size()];
		yCoordinates = new int[points.size()];

		for (int i = 0; i < points.size(); i++) {
			xCoordinates[i] = (int) points.get(i).getX() + 50;
			yCoordinates[i] = (int) points.get(i).getY() + 50;
		}
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawPolygon(xCoordinates, yCoordinates, xCoordinates.length);
	}

}
