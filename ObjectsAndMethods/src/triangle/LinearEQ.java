package triangle;

import java.awt.Point;

public class LinearEQ {

	public static void main(String[] args) {
		LinearEQ one = new LinearEQ(2, -3, -2);
		LinearEQ two = new LinearEQ(4, 1, 24);

		Point p = new Point((int) one.XCramers(two), (int) one.YCramers(two));
		System.out.println("(" + p.getX() + ", " + p.getY() + ")");

	}

	public double xcoeff, ycoeff, constant;

	// default constructor
	public LinearEQ() {
		xcoeff = 0;
		ycoeff = 0;
		constant = 0;
	}

	// constructor takes an x-coordinate, y-coordinate, and constant
	public LinearEQ(double xc, double yc, double con) {
		xcoeff = xc;
		ycoeff = yc;
		constant = con;
	}

	// returns the x-value of the system's intersection
	public double XCramers(LinearEQ b) {
		return ((b.constant * ycoeff) - (constant * b.ycoeff)) / ((xcoeff * b.ycoeff) - (ycoeff * b.xcoeff));
	}

	// returns the y-value of the system's intersection
	public double YCramers(LinearEQ b) {
		return ((b.constant * xcoeff) - (b.xcoeff * constant)) / ((xcoeff * b.ycoeff) - (ycoeff * b.xcoeff));
	}

}
