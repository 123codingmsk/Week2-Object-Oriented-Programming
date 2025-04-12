class Vehicle{
	static int regfee = 200;
	String ownername;
	String vehicleType;
	final int regNum;
	
	Vehicle(String ownername, String vehicleType, int regNum){
		this.ownername = ownername;
		this.vehicleType = vehicleType;
		this.regNum = regNum;
	}
	
	static void updateRegistrationfee(int newregfee){
		regfee = newregfee;
	}
	
	void display(){
		System.out.println("Ownner name: "+ownername);
		System.out.println("Type: "+vehicleType);
		System.out.println("Reg Num: "+regNum);
		System.out.println("Reg Fee: "+regfee);
	}
}


public class Registration{
	public static void main(String[] args){
		Vehicle v1 = new Vehicle("Manoj", "2tyre", 001);
		
		if(v1 instanceof Vehicle){
			Vehicle.updateRegistrationfee(300);
			v1.display();
		}else{
			System.out.println("Not an instance");
		}
	}
}