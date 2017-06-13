package athlete;

public class Marathoner extends Runner {

	public Marathoner(String fname, String lname, double miles, int races) {
		super(fname, lname, "Running", miles, races);
	}

	@Override
	public void race(double miles) {
		if (miles >= 10) {
			races++;
			this.miles += miles;
		} else {
			train(8.5 * miles);
		}
	}

}
