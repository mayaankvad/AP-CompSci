package luckySevens;

public class Lucky {
	private static int helper(String num, int count, boolean flag) {

		if (num.length() <= 0) {
			return count;
		} else {
			char s = num.charAt(0);
			num = num.substring(1);
			if (s == '7') {
				if (flag) {
					count += 13;
				} else {
					count += 1;
				}
				return helper(num, count, true);
			} else {
				return helper(num, count, false);
			}
		}

	}

	/*
	 * luckySevens will return a count of the 7s in the number unless the 7s are
	 * side by side in which case they are worth 14
	 *
	 * 1087171 would return 2 as there are 2 7s 1077171 would return 15 as 2 7s
	 * side by side count as 14 + 1 = 15 77077 would return 28 ( 14 + 14 )
	 * 97171771707797 would return 32 ( 1 + 1 + 14 + 1 + 14 + 1 ) 1089651234
	 * would return 0
	 *
	 * the solution to this problem must use recursion
	 */
	public static int luckySevens(long number) {
		return Integer.valueOf(helper(Long.toString(number), 0, false));
	}

	public static void main(String[] args) {
		// System.out.println(luckySevens(1087171));
		// System.out.println(luckySevens(1077171));
		// System.out.println(luckySevens(77077));
		// System.out.println(luckySevens(97171771707797L));
		// System.out.println(luckySevens(1089651234));

		System.out.println("LUCKY SEVENS");
		System.out.println("1087171 scores a: \t\t" + Lucky.luckySevens(1087171));
		System.out.println("1077171 scores a: \t\t" + Lucky.luckySevens(1077171));
		System.out.println("77077 scores a: \t\t" + Lucky.luckySevens(77077));
		System.out.println("97171771707797L scores a: \t" + Lucky.luckySevens(97171771707797L));
		System.out.println("1089651234 scores a: \t\t" + Lucky.luckySevens(1089651234));
		System.out.println();

	}

}
