import java.util.List;
import java.util.ArrayList;

class Faculty{
	private String name;
	private List<Department> departments;
	
	Faculty(String name){
		this.name = name;
		this.departments = new ArrayList<>();
	}
	
	public String getName(){
		return name;
	}
	
	public List<Department> getDepartment(){
		return departments;
	}
	
	public void addDepartment(Department department){
		departments.add(department);
	}
}

class Department{
	private String depName;
	private List<Faculty> facultymembers;
	
	Department(String depName){
		this.depName = depName;
		this.facultymembers = new ArrayList<>();
	}
	
	public String getDepName(){
		return depName;
	}
	
	public List<Faculty> getfacultynames(){
		return facultymembers;
	}
	
	public void addFaculty(Faculty faculty){
		facultymembers.add(faculty);
	}
}

class University{
	private String Univname;
	private List<Department> departments;
	private List<Faculty> facultymembers;
	
	University(String Univname){
		this.Univname = Univname;
		this.departments = new ArrayList<>();
		this.facultymembers = new ArrayList<>();
	}
	
	public String getUnivname(){
		return Univname;
	}
	
	public void addFaculty(Faculty faculty){
		facultymembers.add(faculty);
	}
	
	public List<Faculty> getfacultynames(){
		return facultymembers;
	}
	
	public void addDepartment(Department department){
		departments.add(department);
	}
	
	public List<Department> getDepartment(){
		return departments;
	}
	
	public void deleteUniversity(){
		departments.clear();
		System.out.println("All departments are deleted from University");
	}
}

public class UniversitySystem{
	public static void main(String[] a){
		Faculty f1 = new Faculty("Manoj");
		
		Department d1 = new Department("CSE");
		
		f1.addDepartment(d1);
		d1.addFaculty(f1);
		
		University u = new University("SRM");
		
		u.addDepartment(d1);
		u.addFaculty(f1);
		
		System.out.println("University: "+u.getUnivname());
		System.out.println("Departments in the University:");
		for(Department dep : u.getDepartment()){
			System.out.println("- "+dep.getDepName());
		}
		
		System.out.println("Faculty Members in the University:");
		for(Faculty fac : u.getfacultynames()){
			System.out.println("- "+fac.getName());
		}
		
		u.deleteUniversity();
		
		System.out.println("Faculty members: ");
		for(Faculty fac : u.getfacultynames()){
			System.out.println("- "+fac.getName());
		}
	}
}