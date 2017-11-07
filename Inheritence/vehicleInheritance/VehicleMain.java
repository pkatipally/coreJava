package udemy;

public class VehicleMain {
	public static void main(String args[]){
		Vehicle vehicle=new Vehicle("Car","medium");
		System.out.println("Name of the Vehicle :"+vehicle.getName());
		System.out.println("Vehicle Size "+vehicle.getSize());
		vehicle.steer(50);
		vehicle.move(100, 40);
		Car car=new Car("Audi",4,4,true,4);
		System.out.println("Name of the car: "+car.getName());
		System.out.println(car.getName()+" car have "+car.getDoors()+" doors");
		System.out.println(car.getName()+" car have "+car.getGears()+" Gears");
		System.out.println(car.getName()+" car have "+car.getWheels()+" Wheels");
	
		car.changeGear(3);
		car.changVelocity(66, 30);
		Audi audi=new Audi(12);
		System.out.println(audi.getName()+" car have "+audi.getRoadServiceMonths()+" RoadServiceMonths");
		
		audi.changeGear(2);
		
		
		
	
		
		
	}

}
