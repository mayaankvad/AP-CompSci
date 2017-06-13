public class Fruit {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		// f.displayEveryOtherFruit();
		// f.display();
		// f.displayReverse();

		// System.out.println(f.getLongest2());

		// System.out.println(f.getMinAlphabetically());
		// f.initials();
		// System.out.println(f.get(1));
		f.display();
		System.out.println();
		f.deleteFruit("kiwi");
		f.addFruit("passion fruit");

		f.display();

	}

	public static int[] multOfSeven(int n) {
		int[] res = new int[n];
		for (int i = 0; i < res.length; i++) {
			res[i] = (i + 1) * 7;
		}
		return res;
	}

	public static String[] nameArray(String name) {
		/*
		 * String[] res = new String[name.length()]; for(int i = 0; i <
		 * res.length; i++) res[i] = name.substring(i, i + 1); return res;
		 */
		return name.split("");
	}

	private String[] bowl;

	public Fruit() {
		this.bowl = new String[10];

		bowl[0] = "apple";
		bowl[1] = "bananna";
		bowl[2] = "kiwi";
		bowl[3] = "lemon";
		bowl[4] = "lime";
		bowl[5] = "mango";
		bowl[6] = "orange";
		bowl[7] = "pear";
		bowl[8] = "pineapple";
		bowl[9] = "plum";

	}

	public void addFruit(String fruit) {
		String[] temp = new String[this.bowl.length + 1];

		boolean f = true;
		for (int i = 0; i < bowl.length; i++) {
			if ((fruit.compareToIgnoreCase(this.bowl[i]) >= 0) || !f) {
				if (!f) {
					temp[i] = this.bowl[i - 1];
				} else {
					temp[i] = this.bowl[i];
				}
			} else if (f) {
				temp[i] = fruit;
				f = false;
			}
		}
		this.bowl = temp;
	}

	public void deleteFruit(String fruit) {
		boolean found = false;
		for (int i = 0; i < this.bowl.length; i++) {
			if (this.bowl[i].equalsIgnoreCase(fruit)) {
				found = true;
				for (int j = i; j < (this.bowl.length - 1); j++) {
					this.bowl[j] = this.bowl[j + 1];
				}
			}
		}

		if (found) {
			String[] temp = new String[this.bowl.length - 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = this.bowl[i];
			}
			this.bowl = temp;
		}
	}

	public void display() {
		for (String s : this.bowl) {
			System.out.println(s);
		}
	}

	public void displayEveryOtherFruit() {
		for (int i = 0; i < this.bowl.length; i += 2) {
			System.out.println(this.bowl[i]);
		}
	}

	public void displayReverse() {
		for (int i = this.bowl.length - 1; i >= 0; i -= 1) {
			System.out.println(this.bowl[i]);
		}
	}

	public String get(int x) {
		return ((x < 0) || (x >= bowl.length)) ? "Invalid Index" : bowl[x];
	}

	public String getLongest() {
		String l = "";
		for (String s : bowl) {
			if (s.length() > l.length()) {
				l = s;
			}
		}
		return l;
	}

	public String getLongest2() {
		int index = 0;
		for (int i = 1; i < bowl.length; i++) {
			if (bowl[i - 1].length() < bowl[i].length()) {
				index = i;
			}
		}
		return bowl[index];
	}

	public String getMinAlphabetically() {
		String res = bowl[0];
		for (String s : bowl) {
			if (res.compareToIgnoreCase(s) > 0) {
				res = s;
			}
		}
		return res;
	}

	public void initials() {
		for (String s : bowl) {
			System.out.println(s.charAt(0));
		}
	}

	public void replace(String lookFor, String replaceWith) {
		for (int i = 0; i < bowl.length; i++) {
			if (lookFor.equalsIgnoreCase(bowl[i])) {
				bowl[i] = replaceWith;
			}
		}
	}

}
