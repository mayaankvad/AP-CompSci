package chapter3_ProblemSetA;

public class RetailItem {

	public static void main(String[] args) {
		System.out.printf("%10s %20s %20s %10s \n\n", "", "Description", "Units On Hand", "Price");

		RetailItem jacket = new RetailItem("Jacket", 12, 59.95);
		RetailItem jeans = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem shirt = new RetailItem("Shirt", 20, 24.95);

		System.out.printf("%10s %20s %15s %15s \n", "Item #1", jacket.getDescription(), jacket.getUnitsOnHand(),
				jacket.getPrice());
		System.out.printf("%10s %20s %15s %15s \n", "Item #2", jeans.getDescription(), jeans.getUnitsOnHand(),
				jeans.getPrice());
		System.out.printf("%10s %20s %15s %15s \n", "Item #3", shirt.getDescription(), shirt.getUnitsOnHand(),
				shirt.getPrice());
	}

	private String description;
	private int unitsOnHand;

	private double price;

	public RetailItem(String description, int unitsOnHand, double price) {
		this.description = description;
		this.unitsOnHand = unitsOnHand;
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}

	public int getUnitsOnHand() {
		return this.unitsOnHand;
	}

	public <E> void setInfo(String property, E value) {
		if (property.equalsIgnoreCase("description")) {
			this.description = (String) value;
		} else if (property.equalsIgnoreCase("description")) {
			this.unitsOnHand = (int) value;
		} else if (property.equalsIgnoreCase("price")) {
			this.price = (double) value;
		}
	}

}