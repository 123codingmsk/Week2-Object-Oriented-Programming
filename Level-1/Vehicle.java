class Vehicle{

	String ownername;
	String vehicleType;
	static int registrationFee;
	
	Vehicle(String ownername, String vehicleType){
		this.ownername = ownername;
		this.vehicleType = vehicleType; 
	}
	
	void displayVehicleDetails(){
		System.out.println(ownername);
		System.out.println(vehicleType);
	}
	
	void updateRegistrationFee(int newfee){
		registrationFee = newfee;
	}
	
	public static void main(String[] args){
		Vehicle p1 = new Vehicle("Manoj", "2 tyre");
		p1.updateRegistrationFee(500);
		
		p1.displayVehicleDetails();
		System.out.println(registrationFee);
		
	}
}