package maze;

import java.util.Arrays;

public class Maze {

	private int[][] maze;
	boolean exit = false;

	public Maze(int s, String data) {
		maze = new int[s][s];
		int c = 0;
		for (int i = 0; i < s; i++) {
			for (int j = 0; j < s; j++) {
				maze[i][j] = Integer.valueOf(data.substring(c, c + 1));
				c++;
			}
		}
		search(this.maze, 0, 0);
	}

	public boolean hasExit() {
		return exit;
	}

	private boolean inRange(int test, int min, int max) {
		return (test >= min) && (test <= max);
	}

	private void search(int[][] maze, int r, int c) {
		if (!exit) {
			if (inRange(r, 0, maze.length - 1) && inRange(c, 0, maze.length - 1) && ((maze[r][c]) == 1)) {
				maze[r][c] = -1;
				if (c == (maze.length - 1)) {
					exit = true;
				} else {
					search(maze, r - 1, c); // up
					search(maze, r + 1, c); // down
					search(maze, r, c - 1); // left
					search(maze, r, c + 1); // right
				}
			}
		}
	}

	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < maze.length; i++) {
			s += Arrays.toString(maze[i]) + "\n";
		}
		return s;
	}
}
