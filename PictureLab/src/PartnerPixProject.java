import java.awt.Color;

public class PartnerPixProject {

	public static void Chromakey() {
		// Initializing picture objects.
		Picture eric = new Picture("Eric.jpg");
		Picture blackhole = new Picture("BlackHole.jpg");

		// Display both pictures before they are combined.
		eric.explore();

		SimplePicture sp1 = new SimplePicture(eric);
		SimplePicture sp2 = new SimplePicture(blackhole);

		// Create two 2D Arrays to hold all the Pixels of both images.
		Pixel[][] ericPixels = sp1.getPixels2D();
		Pixel[][] spacePixels = sp2.getPixels2D();

		/*
		 * Loop through the 2D Array that holds the image of Eric. If a Pixel is
		 * close enough to being green, swap that Pixel with the same Pixel in
		 * the picture of space.
		 */
		for (int x = 0; x < ericPixels.length; x++) {
			for (int y = 0; y < ericPixels[0].length; y++) {
				// if(ericPixels[x][y].getGreen() < 70)
				ericPixels[x][y].setColor(spacePixels[x][y].getColor());
			}
		}

		// Display the picture of Eric after the picture of space has been added
		// to it.
		eric.explore();
	}

	public static void main(String[] args) {
		// Testing all 3 projects
		// Chromakey();
		// Steganography();
		// Mirror();
	}

	public static void Mirror() {
		// Initializing Picture object to be mirrored.
		Picture mirrored = new Picture("DuckFromKungFuPanda.jpg");

		// Display picture before mirroring takes place.
		mirrored.explore();

		SimplePicture sp1 = new SimplePicture(mirrored);

		// Create 2D Array to hold all the pixels in the picture.
		Pixel[][] duckPixels = sp1.getPixels2D();

		/*
		 * Create Pixels objects to be able to switch Pixels, and width to
		 * determine about what line the mirroring should take place.
		 */
		Pixel leftPixel = null;
		Pixel rightPixel = null;
		int width = duckPixels[0].length;

		/*
		 * Loop through the 2D Array. For each Pixel before the line of
		 * rotation, swap it with a Pixel that is the same distance from the
		 * opposite side of the picture.
		 */
		for (int row = 0; row < duckPixels.length; row++) {
			for (int col = 0; col < (width / 2); col++) {
				leftPixel = duckPixels[row][col];
				rightPixel = duckPixels[row][width - col - 1];
				rightPixel.setColor(leftPixel.getColor());
			}
		}

		// Display the picture after the mirroring has taken place.
		mirrored.explore();
	}

	public static void Steganography() {
		// Initialize a new Picture object and display it before changes have
		// been made.
		Picture duck = new Picture("DuckFromKungFuPanda.jpg");
		duck.explore();

		SimplePicture sp1 = new SimplePicture(duck);

		/*
		 * We are not displaying the message picture at all. Instead, after the
		 * message has been decoded we will display the duck picture, which will
		 * reveal what the message is.
		 */
		SimplePicture sp2 = new SimplePicture("ThatsYou.jpg");

		// Create two 2D Arrays to hold all the Pixels of both images.
		Pixel[][] duckPixels = sp1.getPixels2D();
		Pixel[][] messagePixels = sp2.getPixels2D();

		/*
		 * Loops through the duck 2D Array and changes all the red aspects of
		 * every Pixel to an even number.
		 */
		for (int x = 0; x < duckPixels.length; x++) {
			for (int y = 0; y < duckPixels[0].length; y++) {
				if ((duckPixels[x][y].getRed() % 2) == 1) {
					duckPixels[x][y].setRed(duckPixels[x][y].getRed() - 1);
				}
			}
		}

		/*
		 * Loop through the message 2D Array and checks for where the message is
		 * written (it is in black on a white background). If a pixel in the
		 * message picture is black, the corresponding pixel in the duck 2D
		 * Array has its red aspect changed to an odd number.
		 */
		for (int x = 0; x < messagePixels.length; x++) {
			for (int y = 0; y < messagePixels[0].length; y++) {
				if (messagePixels[x][y].colorDistance(Color.BLACK) < 50) {
					duckPixels[x][y].setRed(duckPixels[x][y].getRed() + 1);
				}
			}
		}

		/*
		 * Loop through the duck 2DArray after the message has been encoded.
		 * Everywhere the red aspect of a pixel is odd, that pixel's color is
		 * changed to black. Everything else is changed to white.
		 */
		for (int x = 0; x < duckPixels.length; x++) {
			for (int y = 0; y < duckPixels[0].length; y++) {
				if ((duckPixels[x][y].getRed() % 2) == 1) {
					duckPixels[x][y].setColor(Color.BLACK);
				} else {
					duckPixels[x][y].setColor(Color.WHITE);
				}
			}
		}

		// Displays the image with the secret message revealed.
		duck.explore();
	}
}