package calculatePriceOfBurger;

public class Main {
	public static void main(String args[]){
		System.out.println("Basic hamburger");
		Hamburger hamburger=new Hamburger("Basic","chicken",2.50,"white");
//		hamburger.totalPriceHamburger();
		hamburger.additionalItem1("tamatos", 0.5);
		hamburger.additionalItem2("cheese", 0.25);
		hamburger.additionalItem3("jalapenos", 0.75);
		System.out.println("total price of the hamburger:"+hamburger.totalPriceHamburger());
		System.out.println("----------------------");
		System.out.println(" Add healthy Hamburger: ");
		HealthyBurger healthyBurger=new HealthyBurger("Chicken",6.50);
		healthyBurger.addTopping1("avocado", 0.76);
		healthyBurger.addTopping2("mushrooms", 1.00);
		System.out.println("Total price of Healthy HamBurger:"+healthyBurger.totalPriceHamburger());
		
	}

}
