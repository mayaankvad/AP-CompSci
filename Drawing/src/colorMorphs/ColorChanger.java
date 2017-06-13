package colorMorphs;

import java.awt.Color;

public class ColorChanger {

	int red;
	int green;
	int blue;

	int changeRed;
	int changeBlue;
	int changeGreen;

	public ColorChanger() {
		this.red = 10;
		this.blue = 100;
		this.green = 200;

		this.changeRed = 20;
		this.changeBlue = -20;
		this.changeGreen = -20;
	}

	public ColorChanger(int red, int green, int blue, int changeRed, int changeGreen, int changeBlue) {
		this.red = red;
		this.blue = blue;
		this.green = green;

		this.changeRed = changeRed;
		this.changeBlue = changeBlue;
		this.changeGreen = changeGreen;
	}

	public void changeColor() {
		this.checkBounds();
		this.red += this.changeRed;
		this.blue += this.changeBlue;
		this.green += this.changeGreen;
	}

	public void checkBounds() {
		if (((this.red + this.changeRed) > 255) || ((this.red + this.changeRed) < 0)) {
			this.changeRed = -this.changeRed;
		}

		if (((this.blue + this.changeBlue) > 255) || ((this.blue + this.changeBlue) < 0)) {
			this.changeBlue = -this.changeBlue;
		}

		if (((this.green + this.changeGreen) > 255) || ((this.green + this.changeGreen) < 0)) {
			this.changeGreen = -this.changeGreen;
		}
	}

	public Color getColor() {
		return new Color(this.red, this.green, this.blue);
	}

	public Color nextColor() {
		this.changeColor();
		return this.getColor();
	}

}
