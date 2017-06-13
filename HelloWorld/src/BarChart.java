public class BarChart {
	public static void main(String[] args) {
		int[] bar = { 0, 0, 0, 0, 0, 0 };
		for (int s = 1; s <= 5; s++) {
			System.out.println("Enter today's sales for store " + s + ":");
			bar[s] = (int) Math.round(new java.util.Scanner(System.in).nextDouble() / 100);
		}
		System.out.println("SALES BAR CHART [All values rounded to nearest hundred]");
		for (int s = 1; s <= 5; s++) {
			System.out.print("\nStore " + s + ": ");
			for (int b = 1; b <= bar[s]; b++) {
				System.out.print("*");
			}
		}
	}
}
