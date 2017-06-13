package circle;

public class Circle {

	private static final double PI = 3.141592;

	public static void main(String[] args) {
		System.out.println(Circle.PI);
		Circle one = new Circle();
		one.changeRadius(10);
		System.out.println(one);
		System.out.println();

		Circle two = new Circle(11.9);
		System.out.println(two);

	}

	private double radius;

	public Circle() {
		this.radius = 0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void changeRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return PI * Math.pow(radius, 2);
	}

	public double getCircumference() {
		return 2 * PI * this.radius;
	}

	public double getDiameter() {
		return this.radius * 2;
	}

	public double getRadius() {
		return this.radius;
	}

	@Override
	public String toString() {
		return "Circle \n\t Radius: " + getRadius() + "\n\t area: " + getArea() + "\n\t Circumference: "
				+ getCircumference();
	}

}
