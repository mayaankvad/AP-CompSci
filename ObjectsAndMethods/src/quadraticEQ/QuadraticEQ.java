package quadraticEQ;

public class QuadraticEQ {

	public static QuadraticEQ createQuadraticEQ() {
		java.util.Scanner scn = new java.util.Scanner(System.in);

		System.out.println("---------------- Createing a new Quadratic EQ -----------------");
		System.out.print("Enter the A value: ");
		int a = scn.nextInt();
		System.out.print("Enter the B value: ");
		int b = scn.nextInt();
		System.out.print("Enter the C value: ");
		int c = scn.nextInt();
		System.out.println("---------------- New Quadratic EQ instanciated-----------------");

		scn.close();
		return new QuadraticEQ(a, b, c);

	}

	private int a, b, c;

	public QuadraticEQ(int m, int n, int o) {
		this.a = m;
		this.b = n;
		this.c = o;
	}

	boolean discriminant() {
		return (Math.pow(this.b, 2) - (4 * this.a * this.c)) >= 0;
	}

	public double root1() {
		return (((-1 * this.b) + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2.0 * this.a));
	}

	public double root2() {
		return (((-1 * this.b) - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2.0 * this.a));
	}

	@Override
	public String toString() {
		String res = (discriminant()) ? ("The roots are: " + this.root1() + " & " + this.root2())
				: "This equation has No Real Solutions :(";
		return a + "x^2 + " + b + "x + " + c + ": " + res;
	}

}
