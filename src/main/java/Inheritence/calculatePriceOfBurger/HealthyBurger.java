package calculatePriceOfBurger;

public class HealthyBurger extends Hamburger {
	private String addHealthyTopping1;
	private double addHealthyToppingPrice1;

	private String addHealthyTopping2;
	private double addHealthyToppingPrice2;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
		this.addHealthyTopping1 = meat;
		this.addHealthyToppingPrice1 = price;		
	}

	public void addTopping1(String topping, double price) {
		this.addHealthyTopping1 = topping;
		this.addHealthyToppingPrice1 = price;
	}

	public void addTopping2(String topping, double price) {
		this.addHealthyTopping2 = topping;
		this.addHealthyToppingPrice2 = price;
	}

	@Override
	public double totalPriceHamburger(){
		double hamburgerPrice=super.totalPriceHamburger();		
		if(this.addHealthyTopping1!=null){
			 hamburgerPrice += addHealthyToppingPrice1;
			 System.out.println("Healthy Topping1:"+this.addHealthyTopping1+" of price $"+addHealthyToppingPrice1);
		}
		if(addHealthyTopping2!=null){
			hamburgerPrice+=addHealthyToppingPrice2;
			System.out.println("healthy topping2:"+addHealthyTopping2+" of price $ "+addHealthyToppingPrice2);
		}
		return hamburgerPrice;
	}

}
