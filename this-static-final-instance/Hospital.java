class Patient{
	static String hospitalName = "Apollo";
	final int patientId;
	String name;
	int age;
	String aliment;
	static int totalPatients = 0;
	
	Patient(String name, int age, String aliment){
		totalPatients++;
		this.name = name;
		this.age = age;
		this.aliment = aliment;
		this.patientId = totalPatients;
	}
	
	static int getTotalPatients(){
		return totalPatients;
	}
	
	void display(){
		System.out.println("Hospital: "+hospitalName);
		System.out.println("Patient ID: "+patientId);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Aliment: "+aliment);
	}
	
}

class Hospital{

	public static void main(String[] a){
		
		Patient p1 = new Patient("Manoj", 21, "take proteins");
		Patient p2 = new Patient("Raju", 22, "take vitamins");
		
		if(p1 instanceof Patient){
			p1.display();
			p2.display();
		}else{
			System.out.println("Not an instance");
		}
		
	}
}