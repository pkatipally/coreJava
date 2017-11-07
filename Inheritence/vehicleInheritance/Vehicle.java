package udemy;

public class Vehicle {
	protected static String name;
	private int currentVelocity;
	private int currentDirection;
	protected static String size;

	public Vehicle(String name, String size) {
		this.name = name;
		this.size =size; 
		this.currentDirection=0;
		this.currentVelocity=0;
	
	}

	public void steer(int direction) {
		this.currentDirection+=direction;
		System.out.println("Vehicle.steer():Steering at "+currentDirection+" degrees.");
	}
	public void move(int velocity,int direction){
		this.currentVelocity=velocity;
		this.currentDirection=direction;
		System.out.println("Vehicle.move():moving with velocity "+currentVelocity+" in direction "+currentDirection);
	}

	public String getName() {
		return name;
	}

	public String getSize() {
		return size;
	}
	public int currentVelocity(){
		return currentVelocity;
	}
	public int currentDirection(){
		return currentDirection;
	}
	public void stop(){
		this.currentVelocity=0;
		
	}
}
