class Vehicle{
	private int maxSpeed;
	private String fuelType;
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayVehicleInfo(){
		System.out.println("Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
	}
}

class Car extends Vehicle{
	private int seatCapacity;
	
	Car(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	void displayInfo(){
		car();
		displayVehicleInfo();
		System.out.println("Seat Capacity: "+seatCapacity+"\n");
	}
	
	void car(){
		System.out.println("I'm a Car! These are my details");
	}
	
	public int getseatCapacity(){
		return seatCapacity;
	}
}

class Truck extends Car{
	
	Truck(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType, seatCapacity);
	}
	
	@Override
	void displayInfo(){
		truck();
		displayVehicleInfo();
		System.out.println("Seat Capacity: "+getseatCapacity()+"\n");
	}
	
	void truck(){
		System.out.println("I'm a Truck! These are my details");
	}
}

class Motorcycle extends Truck{
	Motorcycle(int maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed, fuelType, seatCapacity);
	}
	
	@Override
	void displayInfo(){
		motorcycle();
		displayVehicleInfo();
		System.out.println("Seat Capacity: "+getseatCapacity()+"\n");
	}
	
	void motorcycle(){
		System.out.println("I'm a Motorcycle! These are my details");
	}
}

public class TransportSystem{
	public static void main(String[] main){
		Car car = new Car(200, "Diesel", 6);
		car.displayInfo();
		
		Truck truck = new Truck(100, "Diesel", 2);
		truck.displayInfo();
		
		Motorcycle mc = new Motorcycle(150, "Petrol", 2);
		mc.displayInfo();
	}
}