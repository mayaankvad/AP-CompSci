package polygon;

public class RightTriangle extends Polygon {

	public double length;
	public double width;

	public RightTriangle() {
		super(3, "Right Triangle");
		length = 3;
		width = 4;
	}

	public RightTriangle(double len, double wid) {
		super(3, "Right Triangle");
		length = len;
		width = wid;
	}

	@Override
	double getArea() {
		return length + width + getHypotenuse();
	}

	public double getHypotenuse() {
		return Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2)));
	}

	public double getLength() {
		return length;
	}

	@Override
	double getPerimeter() {
		return length * width;
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
		return super.toString() + " Hypotenuse: " + getHypotenuse() + " width: " + getWidth() + " Length: "
				+ getLength();
	}

}
