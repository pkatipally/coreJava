package calculatePriceOfBurger;

public class Hamburger {
	private String name;
	private String meat;
	private double basePrice;
	private String breadRollType;
	private String additionalName1;
	private double additionalPrice1;
	private String additionalName2;
	private double additionalPrice2;
	private String additionalName3;
	private double additionalPrice3;

	public Hamburger(String name, String meat, Double basePrice, String breadRollType) {
		this.meat = meat;
		this.basePrice = basePrice;
		this.breadRollType = breadRollType;
		this.name = name;
	}

	public void additionalItem1(String name, double price) {
		this.additionalName1 = name;
		this.additionalPrice1 = price;
	}

	public void additionalItem2(String name, double price) {
		this.additionalName2 = name;
		this.additionalPrice2 = price;
	}

	public void additionalItem3(String name, double price) {
		this.additionalName3 = name;
		this.additionalPrice3 = price;
	}

	public double totalPriceHamburger() {
		double totalPrice = this.basePrice;
		System.out.println("name of the Hamburger:" + this.name + " with meat " + this.meat + " on a "
				+ this.breadRollType + " roll " + " and basePrice is " + basePrice);
		if (this.additionalName1 != null) {
			totalPrice += additionalPrice1;
			System.out.println("additionalName  " + this.additionalName1 + " added to " + this.name+" for an extra "+this.additionalPrice1);
		}
		if (this.additionalName2 != null) {
			totalPrice += additionalPrice2;
			System.out.println("additionalName  " + this.additionalName2 + " added to " + this.name+" for an extra "+this.additionalPrice2);
		}
		if (this.additionalName3 != null) {
			totalPrice += additionalPrice3;
			System.out.println("additionalName  " + this.additionalName3 + " added to " + this.name+" for an extra "+this.additionalPrice3);
		}

		return totalPrice;
	}
}
