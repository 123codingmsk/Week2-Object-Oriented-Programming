import java.util.List;
import java.util.ArrayList;

class Patient{
	private String patName;
	private List<Doctor> doctors;
	
	Patient(String patName){
		this.patName = patName;
		this.doctors = new ArrayList<>();
	}
	
	public String getPatientName(){
		return patName;
	}
	
	public List<Doctor> getdoctors(){
		return doctors;
	}
	
	public void addDoctor(Doctor d){
		doctors.add(d);
	}
}

class Doctor{
	private String docName;
	private List<Patient> patients;
	
	Doctor(String docName){
		this.docName = docName;
		this.patients = new ArrayList<>();
	}
	
	public String getDocname(){
		return docName;
	}
	
	public void consult(Patient p){
		System.out.println("Doctor "+docName+" consulting -> "+p.getPatientName());
	}
	
	public List<Patient> getpatients(){
		return patients;
	}
	
	public void addPatient(Patient p){
		patients.add(p);
	}
}

class Hospital{
	private String HospName;
	private List<Patient> patients;
	private List<Doctor> doctors;
	
	Hospital(String HospName){
		this.HospName = HospName;
		this.patients = new ArrayList<>();
		this.doctors = new ArrayList<>();
	}
	
	public void addPatient(Patient p){
		patients.add(p);
	}
	
	public void addDoctor(Doctor d){
		doctors.add(d);
	}
	
	public void displayDoctors(){
		System.out.println("Doctors at "+HospName+" : ");
		for(Doctor doc : doctors){
			System.out.println("- "+doc.getDocname());
		}
	}
	
	public void displayPatients(){
		System.out.println("Patients at "+HospName+" : ");
		for(Patient pat : patients){
			System.out.println("- "+pat.getPatientName());
		}
	}
}

public class HospitalSystem{
	public static void main(String[] a){
		Doctor d1 = new Doctor("Dr. Raju");
		Doctor d2 = new Doctor("Dr. Teja");
		
		Patient p1 = new Patient("Manoj");
		
		Hospital hospital = new Hospital("SRM");
		
		hospital.addDoctor(d1);
		hospital.addPatient(p1);
		
		d1.addPatient(p1);
		p1.addDoctor(d1);
		
		hospital.displayDoctors();
		hospital.displayPatients();
		
		d1.consult(p1);
		d2.consult(p1);
		
	}
}