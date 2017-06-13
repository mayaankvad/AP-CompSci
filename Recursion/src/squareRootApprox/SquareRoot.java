package squareRootApprox;

public class SquareRoot {

	private static boolean inRange(double c, double x, double within) {
		double u = x + within;
		double d = x - within;
		return (c >= d) && (c <= u);
	}

	public static void main(String[] args) {
		// System.out.println(inRange(2, 5, 1));
		System.out.println(squareRoot(64));
	}

	public static double squareRoot(double x) {
		return squareRoot(x, x / 2);
	}

	private static double squareRoot(double x, double g) {
		if (inRange(Math.pow(g, 2), x, 0.001)) {
			return g;
		}
		return squareRoot(x, (g + (x / g)) / 2);
	}

}
