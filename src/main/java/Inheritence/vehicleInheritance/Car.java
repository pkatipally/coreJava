package udemy;

public class Car extends Vehicle {
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;

	public Car( String name,int doors,  int gears,boolean isManual,int wheels) {
		super(name, size);
		this.doors=doors;
		this.gears=gears;
		this.isManual=isManual;
		this.wheels=wheels;
		this.currentGear=1;
		this.name=name;
	}
	public String getName(){
		return this.name;
	}
	public int getDoors(){
		return this.doors;
	}
	public int getWheels(){
		return this.wheels;
	}
	public int getGears(){
		return this.gears;
	}
	public void changeGear(int currentGear){
		this.currentGear=currentGear;
		System.out.println("Car.setCurrentGear():changed to"+this.currentGear+"gear.");
	}
	public void changVelocity(int speed,int direction){
		super.move(speed,direction);
		System.out.println("Car.changeVelocity():Velocity"+ speed +" direction "+direction);
	}
	
	

}
