package polygon;

public abstract class Polygon {

	public static void main(String[] args) {
		// Polygon a = new Polygon(4,&quot;rectangle&quot;);
		// System.out.println(a);
	}

	private int sides;

	private String type;

	public Polygon() {
		sides = 3;
		type = "Triangle";
	}

	public Polygon(int mySides, String myType) {
		sides = mySides;
		type = myType;
	}

	abstract double getArea();

	abstract double getPerimeter();

	// public void doubleWidth() {
	// System.out.println(&quot;not all polygons have a true width&quot;);
	// }

	public int getSides() {
		return sides;
	}

	public String getType() {
		return type;
	}

	public void setType(String newType) {
		type = newType;
	}

	// public void doubleWidth(){}

	@Override
	public String toString() {
		return "\nPOLYGON: " + getType() + "\tSIDES: " + getSides() + "\nPERIMETER: " + getPerimeter() + "\tAREA: "
				+ getArea();
	}

}
