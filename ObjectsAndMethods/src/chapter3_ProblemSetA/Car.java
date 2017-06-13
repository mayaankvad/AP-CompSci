package chapter3_ProblemSetA;

public class Car {

	public static void main(String[] args) {
		Car c = new Car(2016, "Tesla");

		System.out.println(c.getSpeed());

		for (int i = 1; i <= 5; i++) {
			c.acccelerate();
			System.out.println(c.getSpeed());
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			c.brake();
			System.out.println(c.getSpeed());
		}

	}

	private int yearModel;
	private String make;

	private int Speed;

	public Car(int yearModel, String make) {
		this.yearModel = yearModel;
		this.make = make;
		this.Speed = 0;
	}

	public void acccelerate() {
		this.Speed += 5;
	}

	public void brake() {
		this.Speed -= 5;
	}

	public String getMake() {
		return this.make;
	}

	public int getSpeed() {
		return this.Speed;
	}

	public int getYearModel() {
		return this.yearModel;
	}

}
