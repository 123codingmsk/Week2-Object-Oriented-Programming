class Device{
	private int deviceID;
	private String status;
	
	Device(int deviceID, String status){
		this.deviceID = deviceID;
		this.status = status;
	}
	
	void displayStatus(){
		System.out.println("Device ID: " + deviceID);
        System.out.println("Status: " + status);
    }
}

class Thermostat extends Device{
	private String temperatureSetting;
	
	Thermostat(int deviceID, String status, String temperatureSetting) {
        super(deviceID, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHome{
	public static void main(String[] a){
		Thermostat thermostat = new Thermostat(1, "Phone", "Fah");
		
		thermostat.displayStatus();
	}
}