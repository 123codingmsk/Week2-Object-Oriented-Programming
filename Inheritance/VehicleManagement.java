class Vehicle{
	private String model;
	private int maxSpeed;
	
	Vehicle(String model, int maxSpeed){
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	void display(){
		System.out.println("Model :"+model);
		System.out.println("MaxSpeed: "+maxSpeed);
	}
}

interface Refuelable{
	void refuel();
}

interface Chargable{
	void charge();
}

class ElectricVehicle extends Vehicle implements Refuelable, Chargable{
	ElectricVehicle(String model, int maxSpeed){
		super(model, maxSpeed);
	}
	
	@Override
	public void charge(){
		super.display();
		System.out.println("Vehicle charges");
	}
	
	@Override
	public void refuel(){
		System.out.println("Electric Vehicle cant get refueled");
	}
}

class PetrolVehicle extends Vehicle implements Refuelable, Chargable{
	PetrolVehicle(String model, int maxSpeed){
		super(model, maxSpeed);
	}
	
	@Override
	public void refuel(){
		super.display();
		System.out.println("Vehicle Refueled");
	}
	
	@Override
	public void charge(){
		System.out.println("Petrol Vehicle cant get charged");
	}
}

public class VehicleManagement{
	public static void main(String[] args){
		ElectricVehicle ev = new ElectricVehicle("Tesla", 100);
		PetrolVehicle pv = new PetrolVehicle("Bajaj", 200);
		
		ev.charge();
		ev.refuel();
		pv.refuel();
		pv.charge();
	}
}