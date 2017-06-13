package areaRectangle;

public class Rectangle {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(14, 10);

		System.out.println(r1.getArea());
		System.out.println("Expected: 6");
		System.out.println(r2.getArea());
		System.out.println("Expected: 140");
	}

	// Declare instance variables here
	private int height;

	private int width;

	/**
	 * Constructs a new rectangle with integer dimensions.
	 *
	 * @param w
	 *            width
	 * @param h
	 *            height
	 */
	public Rectangle(int w, int h) {
		height = h;
		width = w;
	}

	/**
	 * Computes the area of the rectangle.
	 *
	 * @return the area
	 */
	public int getArea() {
		if (width == 1) {
			return height;
		} else {
			return new Rectangle(width - 1, height).getArea() + height;
		}
	}

}
