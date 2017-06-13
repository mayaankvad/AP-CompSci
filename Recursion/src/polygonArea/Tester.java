package polygonArea;

import java.awt.Point;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Point> poly1 = new ArrayList<Point>();
		poly1.add(new Point(0, 0));
		poly1.add(new Point(1, 0));
		poly1.add(new Point(0, 1));

		// new DrawPolygon(poly1);
		System.out.println(new PolygonArea(poly1).getArea());
		System.out.println("Expected: 0.5");

		ArrayList<Point> poly2 = new ArrayList<Point>();
		poly2.add(new Point(0, 0));
		poly2.add(new Point(0, 2));
		poly2.add(new Point(1, 4));
		poly2.add(new Point(2, 5));
		poly2.add(new Point(3, 2));
		poly2.add(new Point(1, 1));

		// new DrawPolygon(poly2);
		System.out.println(new PolygonArea(poly2).getArea());
		System.out.println("Expected: 8.5");
	}

}
