package triangle;

import java.text.DecimalFormat;

public class Triangle {

	// Triangle Tester Method
	public static void main(String[] args) {
		Coordinate one = new Coordinate(4, 2);
		Coordinate two = new Coordinate(8, 0);
		Coordinate three = new Coordinate(5, 10);

		Triangle t = new Triangle(one, two, three);
		System.out.println(t.median(one, two, three).xcoeff);
		System.out.println(t.median(one, two, three).ycoeff);
		System.out.println(t.median(one, two, three).constant);

		System.out.println(t.getCentroid());
		System.out.println();

		System.out.println(t.perpendicularBisector(one, two, three).xcoeff);
		System.out.println(t.perpendicularBisector(one, two, three).ycoeff);
		System.out.println(t.perpendicularBisector(one, two, three).constant);

		System.out.println(t.getCircumcenter());
		System.out.println();

		System.out.println(t.altitude(one, two, three).xcoeff);
		System.out.println(t.altitude(one, two, three).ycoeff);
		System.out.println(t.altitude(one, two, three).constant);

		System.out.println(t.getOrthocenter());

		System.out.println();
		System.out.println(t);

	}

	public static double round(double num) {
		DecimalFormat df = new DecimalFormat("##.00");
		String f = df.format(num);
		return Double.parseDouble(f);
	}

	private Coordinate a, b, c;

	public Triangle() {
		a = new Coordinate(4, 2);
		b = new Coordinate(8, 0);
		c = new Coordinate(5, 10);
	}

	public Triangle(Coordinate a, Coordinate b, Coordinate c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public LinearEQ altitude(Coordinate a, Coordinate b, Coordinate c) {
		double sl = Coordinate.getPerpendicularSlope(b, c);
		double inter = Coordinate.getPerpendicularIntercept(b, c, a);
		if (a.getY() == b.getY()) {
			return new LinearEQ(sl, 0, inter);
		}
		return new LinearEQ(sl, 1, inter);
	}

	public double[] getAngleMeasures() {
		double[] angles = {
				(Math.acos((Math.pow(getSideLengths()[2], 2) - Math.pow(getSideLengths()[1], 2)
						- Math.pow(getSideLengths()[0], 2)) / (-2 * getSideLengths()[1] * getSideLengths()[0]))
						* (180 / Math.PI)),
				(Math.acos((Math.pow(getSideLengths()[0], 2) - Math.pow(getSideLengths()[1], 2)
						- Math.pow(getSideLengths()[2], 2)) / (-2 * getSideLengths()[1] * getSideLengths()[2])))
						* (180 / Math.PI),
				(Math.acos((Math.pow(getSideLengths()[1], 2) - Math.pow(getSideLengths()[0], 2)
						- Math.pow(getSideLengths()[2], 2)) / (-2 * getSideLengths()[0] * getSideLengths()[2])))
						* (180 / Math.PI) };
		return angles;
	}

	public double getArea() {
		double s = getPerimeter() / 2;
		return Math.sqrt(s * (s - getSideLengths()[0]) * (s - getSideLengths()[1]) * (s - getSideLengths()[2]));
	}

	public Coordinate getCentroid() {
		LinearEQ one = median(a, b, c);
		LinearEQ two = median(c, a, b);

		return new Coordinate(round(one.XCramers(two)), round(one.YCramers(two)));
	}

	public Coordinate getCircumcenter() {
		LinearEQ one = perpendicularBisector(a, b, c);
		LinearEQ two = perpendicularBisector(c, a, b);

		return new Coordinate(round(one.XCramers(two)), round(one.YCramers(two)));
	}

	public Coordinate getOrthocenter() {
		LinearEQ one = altitude(a, b, c);
		LinearEQ two = altitude(c, a, b);

		double x = round(one.XCramers(two));
		double y = round(one.YCramers(two));
		return new Coordinate(x, y);
	}

	public double getPerimeter() {
		return getSideLengths()[0] + getSideLengths()[1] + getSideLengths()[2];
	}

	public double[] getSideLengths() {
		double[] l = { Coordinate.segmentLength(this.a, this.b), Coordinate.segmentLength(this.b, this.c),
				Coordinate.segmentLength(this.a, this.c) };
		return l;
	}

	public boolean isIsosceles() {
		if (this.getSideLengths()[0] == this.getSideLengths()[1]) {
			return true;
		}
		if (this.getSideLengths()[1] == this.getSideLengths()[2]) {
			return true;
		}
		if (this.getSideLengths()[2] == this.getSideLengths()[0]) {
			return true;
		}
		return false;
	}

	public boolean isRight() {
		if (round(this.getAngleMeasures()[0]) == 90.0) {
			return true;
		}
		if (round(this.getAngleMeasures()[1]) == 90.0) {
			return true;
		}
		if (round(this.getAngleMeasures()[2]) == 90.0) {
			return true;
		}
		return false;
	}

	public LinearEQ median(Coordinate a, Coordinate b, Coordinate c) {
		Coordinate mid = Coordinate.getMidpoint(a, b);
		double slope = Coordinate.getSlope(mid, c);
		double intercept = Coordinate.getIntercept(mid, c);

		return new LinearEQ(slope, 1, intercept);
	}

	public LinearEQ perpendicularBisector(Coordinate a, Coordinate b, Coordinate c) {
		Coordinate mid = Coordinate.getMidpoint(a, b);
		double sl = Coordinate.getPerpendicularSlope(a, b);
		double intercept = Coordinate.getPerpendicularIntercept(mid, b, mid);
		if (a.getY() == b.getY()) {
			return new LinearEQ(sl, 0, intercept);
		}
		return new LinearEQ(sl, 1, intercept);
	}

	@Override
	public String toString() {
		String right = (isRight() ? "" : "not ");
		String iso = (isIsosceles() ? "" : "not ");

		return ("\n\n----------------------------------------------------\n" + "Triangle Info: \n\n" +

				"Coordinates: \n" + "Coordinate a: " + this.a + "\n" + "Coordinate b: " + this.b + "\n"
				+ "Coordinate c: " + this.c + "\n\n" +

				"Side Lengths & Perimeter & area: \n" + "Side Length ab: " + round(this.getSideLengths()[0])
				+ " units \n" + "Side Length bc: " + round(this.getSideLengths()[1]) + " units \n" + "Side Length ac: "
				+ round(this.getSideLengths()[2]) + " units \n" + "Perimeter: " + round(this.getPerimeter())
				+ " units \n" + "Area: " + round(this.getArea()) + " units squared \n\n" +

				"Angle measures: \n" + "Angle abc: " + round(this.getAngleMeasures()[0]) + " Degrees \n" + "Angle bca: "
				+ round(this.getAngleMeasures()[1]) + " Degrees \n" + "Angle cba: " + round(this.getAngleMeasures()[2])
				+ " Degrees \n\n" +

				"Triangle Centers: \n" + "Circumcenter: " + this.getCircumcenter() + "\n" + "Centroid: "
				+ this.getCentroid() + "\n" + "Orthocenter: " + this.getOrthocenter() + "\n\n" +

				"This is " + right + "a right triangle. \n" + "This is " + iso + "an isosceles triangle. \n"
				+ "----------------------------------------------------\n\n");
	}

}
