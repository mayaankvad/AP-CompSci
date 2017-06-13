package polygonArea;

import java.awt.Point;
import java.util.ArrayList;

public class PolygonArea {

	public static double distance(Point a, Point b) {
		return Math.sqrt((Math.pow((b.getX() - a.getX()), 2) + Math.pow((b.getY() - a.getY()), 2)));
	}

	public static double heronsFormula(Point a, Point b, Point c) {
		double distA = distance(a, b);
		double distB = distance(b, c);
		double distC = distance(a, c);
		double s = (distA + distB + distC) / 2.0;
		return Math.sqrt((s * (s - distA) * (s - distB) * (s - distC)));
	}

	private ArrayList<Point> coordinates; // values will be removed after
											// construction.

	private double area;

	int x = 2;

	public PolygonArea(ArrayList<Point> coordinates) {
		this.coordinates = coordinates;

		if (coordinates.size() == 3) {
			this.area = heronsFormula(coordinates.get(0), coordinates.get(1), coordinates.get(2));
		} else {
			this.area = calcArea();
		}
	}

	private double calcArea() {
		if (coordinates.size() < 4) {
			return 0;
		}

		return heronsFormula(coordinates.get(0), coordinates.remove(1), coordinates.get(2)) + calcArea();
	}

	public double getArea() {
		return (double) Math.round(this.area * 10) / 10;
	}

}
