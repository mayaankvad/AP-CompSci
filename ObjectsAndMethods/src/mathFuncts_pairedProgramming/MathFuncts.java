package mathFuncts_pairedProgramming;

import java.awt.Point;
import java.text.DecimalFormat;

public class MathFuncts {

	public static int distance(int x, int y) {
		return Math.abs(x - y);
	}

	public static double getHypotenuse(double leg1, double leg2) {
		return Math.sqrt((Math.pow(leg1, 2) + Math.pow(leg2, 2)));
	}

	public static int getRandomClass() {
		// 4 -> spread 9 -> upper bound
		// (int) (Math.random() * 4) + 9
		return 9 + (int) (Math.random() * ((12 - 9) + 1));
	}

	public static double getSmallestAngleOfRightTri(double leg1, double leg2) {
		return Math.round(Math.toDegrees(Math.min(Math.atan(leg1 / leg2), Math.atan(leg2 / leg1))));
	}

	public static void main(String[] args) {

		System.out.println(maximum(100, 500));
		System.out.println(maximum(100, 500, 1000));
		System.out.println(getRandomClass());
		System.out.println(segmentLength(new Point(1, 3), new Point(-2, 7)));
		System.out.println(roundToHundredPlace(1999));

		System.out.println(getSmallestAngleOfRightTri(2.3, 2.3));
	}

	public static double maximum(double a, double b, double c) {
		return Math.max(Math.max(a, b), c);
	}

	public static int maximum(int a, int b) {
		return Math.max(a, b);
		// return (a >= b) ? a : b;
		// if(a >= b) return a; else return b;
	}

	public static double roundToHundredPlace(double x) {
		return Double.valueOf(new DecimalFormat("##.00").format(x));
	}

	public static int roundToHundredPlace(int x) {
		return ((x + 50) / 100) * 100;
	}

	public static double segmentLength(Point a, Point b) {
		// return a.distance(b);
		return Math.sqrt(Math.pow((b.getY() - a.getY()), 2) + Math.pow((b.getX() - a.getX()), 2));
	}

	public static double sphereSurfaceArea(int radius) {
		return 4 * Math.PI * Math.pow(radius, 2);
	}

	public static double sphereVolume(int radius) {
		return Math.PI * (Math.pow(radius, 3)) * (4 / 3);
	}

}
