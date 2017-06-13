@SuppressWarnings("unused")
public class TestClass {

	public static void custom() {
		Picture aak = new Picture("k.png");
		Picture back = new Picture("cloud2.jpg");
		Picture tri = new Picture("tri2.png");

		// aak.chromakey(back);
		//
		// //aak.explore();
		//
		// aak.replaceColor(Color.WHITE, new Color(115, 161, 90) , 115);
		//
		// //aak.explore();
		//
		// aak.chromakey(tri);
		//
		// //aak.explore();
		//
		aak.invertColors();
		//
		aak.explore();

		// Picture.replaceCloudsWithPatternAndInvert(aak, back, tri);
		aak.explore();

	}

	public static void main(String[] args) {
		// testChromakey();
		// testEncodeDecode();
		// testInvert();
		// custom();

		// Picture aak = new Picture("aakanksha2.jpeg");
		Picture back = new Picture("cloud2.jpg");
		Picture tri = new Picture("tri2.png");

		Picture aak = new Picture("k.png");
		aak.invertColors();
		// Picture.replaceCloudsWithPatternAndInvert(aak, back, tri);
		aak.explore();
	}

	public static void testChromakey() {
		Picture aak = new Picture("aakanksha.jpeg");
		// Picture back = new Picture("tri.png");
		Picture back = new Picture("moon.jpg");

		// 750 1334

		aak.explore();
		aak.chromakey(back);
		aak.explore();
		// moon.explore();
	}

	public static void testEncodeDecode() {
		Picture pic = new Picture("swan.jpg");
		Picture msg = new Picture("msg.png");

		pic.explore();
		pic.encode(msg);
		pic.explore();

		Picture out = pic.decode();

		out.explore();

	}

	public static void testInvert() {
		// Picture pic = new Picture("aakanksha.jpeg");
		Picture pic = new Picture("swan.jpg");
		pic.explore();
		pic.invertColors();

		pic.explore();

	}

}
