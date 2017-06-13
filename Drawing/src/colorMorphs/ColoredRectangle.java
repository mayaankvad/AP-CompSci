package colorMorphs;

import java.awt.Graphics;

public class ColoredRectangle extends ColorChanger {

	private Graphics g;
	int Xcoordinate;
	int Ycoordinate;
	int length;
	int width;

	public ColoredRectangle(Graphics g) {
		super();
		this.g = g;
		this.Xcoordinate = 0;
		this.Ycoordinate = 0;
		this.length = 0;
		this.width = 0;
	}

	public ColoredRectangle(Graphics g, int Xcoordinate, int Ycoordinate, int length, int width, int pause) {
		super();
		this.g = g;
		this.Xcoordinate = Xcoordinate;
		this.Ycoordinate = Ycoordinate;
		this.length = length;
		this.width = width;

	}

	public ColoredRectangle(int red, int green, int blue, int changeRed, int changeGreen, int changeBlue, Graphics g,
			int Xcoordinate, int Ycoordinate, int length, int width) {
		super();
		this.red = red;
		this.blue = blue;
		this.green = green;

		this.changeRed = changeRed;
		this.changeBlue = changeBlue;
		this.changeGreen = changeGreen;

		this.g = g;
		this.Xcoordinate = Xcoordinate;
		this.Ycoordinate = Ycoordinate;
		this.length = length;
		this.width = width;
	}

	public void draw() {
		this.g.setColor(super.nextColor());
		this.g.fillRect((this.Xcoordinate), (this.Ycoordinate), this.width, this.length);
	}

}
