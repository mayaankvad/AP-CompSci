import java.util.ArrayList;
import java.util.Arrays;

public class ExampleWorksheet {

	public static double average(ArrayList<Integer> temp) {
		int sum = 0;
		for (int i : temp) {
			sum += i;
		}
		return sum / (double) temp.size();
	}

	public static ArrayList<String> create() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		return list;
	}

	public static void displayEveryOther(ArrayList<String> temp) {
		for (int i = 0; i < temp.size(); i += 2) {
			System.out.println(temp.get(i));
		}
	}

	public static void main(String[] args) {
		// search
		System.out.println(search(create(), "d"));

		// every other
		displayEveryOther(create());

		// perfect squares
		System.out.println(Arrays.toString(perfectSquares().toArray()));

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		// average
		System.out.println(average(list));

		// remove odds
		System.out.println(Arrays.toString(removeOdds(list).toArray()));

	}

	public static ArrayList<Integer> perfectSquares() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 255; i++) {
			list.add((int) Math.pow(i, 2));
		}
		return list;
	}

	public static ArrayList<Integer> removeOdds(ArrayList<Integer> temp) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < temp.size(); i++) {
			if ((temp.get(i) % 2) == 0) {
				list.add(temp.get(i));
			}
		}

		return list;
	}

	public static boolean search(ArrayList<String> temp, String lookFor) {

		// for(String s: temp)
		// if(s.equals(lookFor))
		// return true;
		// return false;

		return temp.contains(lookFor);
	}

}
