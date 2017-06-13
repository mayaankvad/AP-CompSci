package almanac;

public class City {

	private String name;
	private int population;

	public City(int newPop, String newName) {
		population = newPop;
		name = newName;
	}

	public void changeName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int newPop) {
		population = newPop;
	}

	@Override
	public String toString() {
		return getName() + ":   " + getPopulation();
	}

}