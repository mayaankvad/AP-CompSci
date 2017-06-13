package stats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	// project abandoned

	public static Long average(ArrayList<Integer> arr) {
		long sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return (long) (sum / (double) arr.size());
	}

	public static ArrayList<Integer> fetchRawInput(String fileName) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				nums.add(Integer.valueOf(sCurrentLine));
			}
			br.close();
		} catch (Exception e) {
			// e.printStackTrace();
		}
		return nums;
	}

	public static void main(String[] args) {
		// for( Integer i :
		// fetchRawInput("C:\\Users\\19mv0714\\Desktop\\numbers.txt"))
		// System.out.println(i);

		// System.out.println(average(fetchRawInput("C:\\Users\\19mv0714\\Desktop\\numbers.txt")));

	}

}
