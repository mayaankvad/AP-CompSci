package polygon;

public class RegularNgon extends Polygon {

	private double sideLength;

	public RegularNgon() {

	}

	public RegularNgon(int mySides, double sideLen) {
		super(mySides, "regular polygon");
		sideLength = sideLen;

	}

	@Override
	double getArea() {
		// (a X p ) / 2
		// a = s / (2* tan(180/n) )
		double a = sideLength / (2 * Math.tan((180 / getSides())));
		return (a * getPerimeter()) / 2;
	}

	@Override
	double getPerimeter() {
		return sideLength * getSides();
	}

}
