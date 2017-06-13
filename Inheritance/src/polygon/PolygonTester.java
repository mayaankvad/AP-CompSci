package polygon;

public class PolygonTester {

	public static void main(String[] args) {

		// Polygon z = new Polygon(10, &quot;Decagon&quot;);

		// Polygon zz;

		RightTriangle a = new RightTriangle(3, 4);

		System.out.println(a);

		// Polygon bubble = new Rectangle(2,2);

		// System.out.println(bubble.toString());

		// bubble.doubleWidth();

		Rectangle b = new Rectangle(1, 1);

		System.out.println(b.toString());

		// b.doubleWidth();

		Square c = new Square(5);

		System.out.println(c);

		// 5 sided regular polygon

		RegularNgon d = new RegularNgon(5, 8);

		System.out.println(d);

		//

		Polygon[] shapes = new Polygon[4];
		shapes[0] = a;
		shapes[1] = b;
		shapes[2] = c;
		shapes[3] = d;

		//

		double tot = 0;

		//

		System.out.println(b.getArea());

		for (Polygon x : shapes) {
			System.out.println("TYPE: " + x.getType() + " AREA: " + x.getArea());
			tot += x.getArea();
		}

		System.out.println("Total Area: " + tot);

	}

}