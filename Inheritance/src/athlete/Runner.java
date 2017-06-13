package athlete;

public class Runner extends Athlete {

	protected int races;
	protected double miles;

	public Runner(String fname, String lname, String sportPlayed, double miles, int races) {
		super(fname, lname, sportPlayed);
		this.races = races;
		this.miles = miles;
	}

	public double getMiles() {
		return miles;
	}

	public int getRaces() {
		return races;
	}

	public void race(double miles) {
		races++;
		this.miles += miles;
	}

	@Override
	public String toString() {
		return super.toString() + " miles: " + miles;
	}

}
