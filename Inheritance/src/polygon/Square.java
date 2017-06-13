package polygon;

public class Square extends Rectangle {

	public Square() {
		super(0, 0);
		setType("Square");
	}

	public Square(double sideLength) {
		super(sideLength, sideLength);
		setType("Square");
	}

	public double getSideLength() {
		return getWidth();
	}

	public void setSideLength(double sideLength) {
		setWidth(sideLength);
		setLength(sideLength);
	}

}
