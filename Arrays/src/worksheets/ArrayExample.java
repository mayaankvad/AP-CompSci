package worksheets;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample {

	// 12. Write a tester that will create a random array of size 50 and test
	// all of these methods
	public static void main(String[] args) {
		ArrayExample ex = new ArrayExample();
		/*
		 * System.out.println("\n-DISPLAY-\n"); ex.display();
		 *
		 * System.out.println("\n-DISPLAY REVERSE-\n"); ex.displayReverse();
		 *
		 * System.out.println("\n-AVERAGE-\n");
		 * System.out.println(ex.average());
		 *
		 * System.out.println("\n-FIND MAX-\n");
		 * System.out.println(ex.findMax());
		 *
		 * System.out.println("\n-LINEAR SEARCH-\n");
		 * System.out.println(ex.linearSearch(1));
		 *
		 * System.out.println("\n-TALLY LIST-\n"); ex.tallyList();
		 *
		 * System.out.println("\n-LIST REVERSE AVERAGE-\n");
		 * ex.listReverseAvg();
		 *
		 * ex.sort(); ex.binarySearch(1);
		 */

		System.out.println("\n-DISPLAY REVERSE-\n");
		ex.displayReverse();

		System.out.println("\n-AVERAGE-\n");
		System.out.println(ex.average());

		System.out.println("\n-FIND MAX-\n");
		System.out.println(ex.findMax());
		System.out.println("\n-TALLY LIST-\n");
		ex.tallyList();

	}

	private int[] numbArray;

	// 1. Constructs a default array of size 10
	public ArrayExample() {
		numbArray = new int[10];
		numbArray[0] = 1;
		numbArray[1] = 3;
		numbArray[2] = 7;
		numbArray[3] = 19;
		numbArray[4] = 15;
		numbArray[5] = 19;
		numbArray[6] = 7;
		numbArray[7] = 3;
		numbArray[8] = 19;
		numbArray[9] = 48;
	}

	// 2. Constructs an array of random numbers (0-24) array of size count
	public ArrayExample(int count) {
		numbArray = new int[count];
		for (int i = 0; i < numbArray.length; i++) {
			numbArray[i] = new Random().nextInt(25);
		}
	}

	// 5. This method calculates and returns the average of all of the elements
	// The average of the default array is 14.1
	public double average() {
		int sum = 0;
		for (int i : numbArray) {
			sum += i;
		}
		return (double) sum / numbArray.length;
	}

	// 11. Binary Search. This method returns the index number of the first
	// instance of int lookFor
	// returns -1 if not in the list. The Array must be sorted to use the Binary
	// search
	// ex. Using the default array findIndex(15) will return 4
	public int binarySearch(int lookFor) {
		int[] temp = numbArray.clone();
		Arrays.sort(temp);
		return Arrays.binarySearch(temp, lookFor);
	}

	// 3. This method prints all of the elements of the array in list form
	public void display() {
		for (int i : numbArray) {
			System.out.print(i + " ");
		}
	}

	// 4. This method prints all of the elements in reverse order
	public void displayReverse() {
		for (int i = numbArray.length - 1; i >= 0; i--) {
			System.out.print(numbArray[i] + " ");
		}
	}

	// 6. This method returns the maximum value of all of the elements
	// The max of the default array is 48.
	public int findMax() {
		/*
		 * int max = 0; for(int i: numbArray) if(max < i) max = i; return max;
		 */
		int[] temp = numbArray.clone();
		Arrays.sort(temp);
		return temp[temp.length - 1];
	}

	// 7. This method returns the index number of the first instance of int
	// lookFor returns -1 if not in the list
	// ex. Using the default array findIndex(15) will return 4
	public int linearSearch(int lookFor) {
		for (int i = 0; i < numbArray.length; i++) {
			if (numbArray[i] == lookFor) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * 9. This method will print a column of numbers in the original order, a
	 * column of numbers in reverse order, and the average of the two. default
	 * constructor will be
	 *
	 * LIST REVERSE AVERAGE 1 48 24.5 3 19 11.0 3 19 11.0 7 19 13.0 7 15 11.0 15
	 * 7 11.0 19 7 13.0 19 3 11.0 19 3 11.0 48 1 24.5
	 */
	public void listReverseAvg() {
		System.out.printf("%10s \t %10s \t %10s \n", "List", "Reverse", "Average");
		for (int i = 0; i < numbArray.length; i++) {
			int reg = numbArray[i];
			int rev = numbArray[numbArray.length - i - 1];
			double avg = (reg + rev) / 2.0;
			System.out.printf("%10d \t %10d \t %10.2f \n", reg, rev, avg);
		}

	}

	// 10. This method will sort the array in ascending order
	public void sort() {
		Arrays.sort(numbArray);
	}

	/**
	 * 8. This method will print the elements and the tally. The list with the
	 * default constructor will be Number Frequency 1 1 3 2 7 2 15 1 19 3 48 1
	 */

	// Savas had us do this last year. and im lazy so i copied it
	// Dont ask how this works, it just does
	public void tallyList() {
		System.out.println("Number " + "\t" + "Frequency");
		int[] temp = numbArray.clone();
		Arrays.sort(temp);

		for (int i = 0; i < temp.length; i++) {
			int frequency = 0;
			if (temp[i] != Integer.MAX_VALUE) {
				for (int j = 0; j < temp.length; j++) {
					if (temp[i] == temp[j]) {
						frequency++;
						if (frequency > 1) {
							temp[j] = Integer.MAX_VALUE;
						}
					}
				}
				System.out.println(temp[i] + "\t" + frequency);
			}
		}
	}

}
