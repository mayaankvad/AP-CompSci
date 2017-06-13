package gettysburgAddress;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static ArrayList<String> getWords() {

		ArrayList<String> words = new ArrayList<String>();

		File file = new File("C:\\Users\\19mv0714\\Desktop\\gettysburgAddress.txt");

		try {

			Scanner f = new Scanner(file);

			while (f.hasNext()) {

				String line = f.nextLine();
				// System.out.println(line);
				String[] ws = line.split(" ");
				for (String w : ws) {
					words.add(w);
					// System.out.println(w);
				}

			}
			f.close();

		} catch (Exception e) {
			System.out.println("ERR");
		}

		return words;

		/*
		 * String[] r = new String[words.size()]; for(int i = 0; i < r.length;
		 * i++) { r[i] = words.get(i); //System.out.println(r[i]); }
		 *
		 * return r;
		 */

	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(getWords().toArray()));
	}

}
