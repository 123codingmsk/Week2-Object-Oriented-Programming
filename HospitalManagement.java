import java.util.*;

interface MedicalRecord{
	void addRecord(String record);
	void viewRecords();
}	

abstract class Patient{
	private static int counter = 1;
	private int patientID;
	private String name;
	private int age;
	
	Patient(String name, int age){
		this.patientID = counter++;
		this.name = name;
		this.age = age;
	}
	
	abstract void calculateBill();
	
	void getPatientDetails(){
		System.out.println("Patient ID: "+patientID);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class InPatient extends Patient implements MedicalRecord{
	private String record;
	InPatient(String name, int age){
		super(name, age);
	}
	
	@Override 
	void calculateBill(){
		System.out.println("Patient is in hospital, Bill is in progress");
	}
	
	@Override
	public void addRecord(String record){
		this.record = record;
	}
	
	@Override
	public void viewRecords(){
		System.out.println("Record: "+record);
	}
}

class OutPatient extends Patient implements MedicalRecord{
	private String record;
	OutPatient(String name, int age){
		super(name, age);
	}
	
	@Override 
	void calculateBill(){
		System.out.println("Patient bill is calculated");
	}
	
	@Override
	public void addRecord(String record){
		this.record = record;
	}
	
	@Override
	public void viewRecords(){
		System.out.println("Record: "+record);
	}
}

public class HospitalManagement{
	public static void main(String[] a){
		List<Patient> patients = new ArrayList<>();
		
		InPatient p1 = new InPatient("Manoj", 21);
		p1.addRecord("Diagnosed with Cancer");
		patients.add(p1);
		
		OutPatient p2 = new OutPatient("Raju", 31);
		p2.addRecord("Fighting with Ulcer");
		patients.add(p2);
		
		for(Patient p : patients){
			p.getPatientDetails();
			p.calculateBill();
			
			if(p instanceof MedicalRecord){
			System.out.print("Medical Records: ");
				(( MedicalRecord) p).viewRecords();
			}
		}
	}
}

