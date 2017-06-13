package triangle;

public class Coordinate {

	// b = y - mx
	public static double getIntercept(Coordinate a, Coordinate b) {
		if (a.getX() == b.getX()) {
			return a.getY();
		}
		return a.getY() - (getSlope(a, b) * a.getX());
	}

	public static Coordinate getMidpoint(Coordinate a, Coordinate b) {

		return new Coordinate(((a.getX() + b.getX()) / 2), (a.getY() + b.getY()) / 2);
	}

	public static double getPerpendicularIntercept(Coordinate a, Coordinate b, Coordinate c) {
		if (a.getY() == b.getY()) {
			return -1 * a.getX();
		}
		return c.getY() - (getPerpendicularSlope(a, b) * c.getX());
	}

	public static double getPerpendicularSlope(Coordinate a, Coordinate b) {
		if (a.getY() == b.getY()) {
			return 1;
		}

		return -1 * ((a.getX() - b.getX()) / (a.getY() - b.getY()));
	}

	public static double getSlope(Coordinate a, Coordinate b) {
		if (a.getX() == b.getX()) {
			return 1;
		}
		return (a.getY() - b.getY()) / (a.getX() - b.getX());
	}

	public static double segmentLength(Coordinate a, Coordinate b) {
		// return a.distance(b);
		return Math.sqrt(Math.pow((b.getY() - a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2));
	}

	double x, y;

	public Coordinate() {
		this.x = 0;
		this.y = 0;
	}

	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return ("(" + this.getX() + ", " + this.getY() + ")");
	}

	/*
	 * public static void main(String[] args) { Coordinate one = new
	 * Coordinate(); Coordinate two = new Coordinate(0, 4);
	 * System.out.println(Coordinate.getMidpoint(one, two)); }
	 */

}
