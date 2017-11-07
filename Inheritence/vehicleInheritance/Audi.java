package udemy;

public class Audi extends Car {
	private int roadServiceMonths;

	public Audi(int roadServiceMonths) {
		super("Audi", 4, 5,false, 4);
		this.roadServiceMonths=roadServiceMonths;
	}
	public int getRoadServiceMonths(){
		return this.roadServiceMonths;
	}
	
	

}
