package hotelReservations;

public class Reservation {
	private String name; // last name of the person reserving the room
	private double rate; // room rate for 1 night's stay

	public Reservation() {
		name = "Lepold";
		rate = 99.99;
	}

	public Reservation(String myName, double myRate) {
		this.name = myName;
		this.rate = myRate;
	}

	public String getName() {
		return this.name;
	}

	public double getRate() {
		return this.rate;
	}

	@Override
	public String toString() {
		return "{" + "Name: " + this.name + ", Rate: " + this.rate + "}";
	}

}
