package polygon;

public class Rectangle extends Polygon {

	private double length;
	private double width;

	public Rectangle() {
		super(4, "Rectangle");
		width = 0;
		length = 0;
	}

	public Rectangle(double len, double wid) {
		super(4, "Rectangle");
		length = len;
		width = wid;
	}

	@Override
	double getArea() {
		return length * width;
	}

	public double getLength() {
		return length;
	}

	@Override
	double getPerimeter() {
		return (2 * length) + (2 * width);
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return super.toString() + " width: " + getWidth() + " length: " + getLength();
	}

}
