package almanac;

public class Almanac {

	/**
	 *
	 * Almanac contains an Array of City objects
	 *
	 */

	City[] list;

	public Almanac() {
		list = new City[5];
		list[0] = new City(1547000, "Philadelphia");
		list[1] = new City(443775, "Atlanta");
		list[2] = new City(636470, "Boston");
		list[3] = new City(8336000, "New York");
		list[4] = new City(277347, "Newark");
	}

	public Almanac(int x) {
		list = new City[x];
	}

	/**
	 *
	 * Returns the average population
	 *
	 */
	public double averagePop() {
		double sum = 0;
		for (City c : this.list) {
			sum += c.getPopulation();
		}
		return sum / this.list.length;
	}

	/**
	 *
	 * Changes the population of a City that matches searchName to newPopulation
	 *
	 */
	public void changePop(String searchName, int newPopulation) {
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[i].getName().equalsIgnoreCase(searchName)) {
				this.list[i].setPopulation(newPopulation);
			}
		}
	}

	/**
	 *
	 * this method will add rate% to each population in the list
	 *
	 */
	public void increasePop(double rate) {
		for (int i = 0; i < this.list.length; i++) {
			this.list[i].setPopulation((int) (this.list[i].getPopulation() * (1 + (rate / 100))));
		}
	}

	/**
	 *
	 * Displays List of Cities
	 *
	 */
	public void printList() {
		for (City c : this.list) {
			System.out.printf("%-10s \t %-10d \n", c.getName(), c.getPopulation());
		}
		System.out.println("\n");
	}

	/**
	 *
	 * Find the city with the smallest population return the name.
	 *
	 */
	public String smallestPop() {
		int smallestPopIndex = 0;
		for (int i = 0; i < this.list.length; i++) {
			if (this.list[smallestPopIndex].getPopulation() > this.list[i].getPopulation()) {
				smallestPopIndex = i;
			}
		}
		return this.list[smallestPopIndex].getName();
	}

}
