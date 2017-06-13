package maze;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	public static void main(String[] args) throws IOException {
		Scanner fr = new Scanner(new File("src/maze/maze.dat"));
		ArrayList<Maze> mazes = new ArrayList<Maze>();

		while (fr.hasNext()) {
			int size = Integer.valueOf(fr.nextLine().trim());
			String line = fr.nextLine().replace(" ", "");
			mazes.add(new Maze(size, line));
		}

		// print out
		for (Maze m : mazes) {
			// System.out.println(m);
			System.out.println(m.hasExit() ? "Exit Found" : "Exit Not Found");
			System.out.println();
		}

		fr.close();
	}
}
