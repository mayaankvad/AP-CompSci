import java.util.Arrays;

public class CombineArrays {

	// returns a new array with alternating values from a and b
	public static int[] alternate(int[] a, int[] b) {
		for (int i = 0; i < Math.max(a.length, b.length);) {
			;
		}

		return null;
	}

	// returns a new array where b is appended to the end of a
	public static int[] append(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i + a.length] = b[i];
		}

		return c;
	}

	// displays the array
	public static void display(int[] a) {
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 7, 13, 24, 25 };
		int[] b = new int[] { 3, 10, 21, 26 };
		System.out.println("APPEND");
		display(append(a, b));
		System.out.println();
		System.out.println("ALTERNATE");
		display(alternate(b, a));
		System.out.println();
		System.out.println("MERGE");
		display(merge(b, a));
	}

	// returns a new ordered array
	// prerequisite a and b must be ordered
	public static int[] merge(int[] a, int[] b) {
		int[] c = append(a, b);
		Arrays.sort(c);
		return c;
	}

}
