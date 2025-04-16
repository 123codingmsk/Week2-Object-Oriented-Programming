interface Department{
	void assignDepartment(String departmentName);
	void getDepartmentDetails();
}

abstract class Employee implements Department{
	private int employeeID;
	private String name;
	private int baseSalary;
	private String departmentName;
	private int currSalary;
	
	Employee(int employeeID, String name, int baseSalary){
		this.employeeID = employeeID;
		this.name = name;
		this.baseSalary = baseSalary;
		this.currSalary = baseSalary;
	}
	
	abstract void calculateSalary();// abstract method, no body
	
	@Override
	public void assignDepartment(String departmentName){
		this.departmentName = departmentName;
	}
	
	@Override
	public void getDepartmentDetails(){
		System.out.println("Department Name: "+departmentName);
	}
	
	void displayDetails(){    // concrete method, with body
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Name: "+name);
		System.out.println("Base Salary: "+baseSalary);
		System.out.println("Current Salary: "+ currSalary);
		getDepartmentDetails();
	}
	
	public int getEmpID(){
		return employeeID;
	}
	
	public String getName(){
		return name;
	}
	
	public int getbaseSalary(){
		return baseSalary;
	}
	
	public void setCurrSalary(int salary){
		this.currSalary = salary;
	}
	
	public int getCurrSalary(){
		return currSalary;
	}
}

class FullTimeEmployee extends Employee{
	private int hours;
	
	FullTimeEmployee(int employeeID, String name, int baseSalary, int hours){
		super(employeeID, name, baseSalary);
		this.hours = hours;
	}
	
	@Override
	void calculateSalary(){
		if(hours > 5){
			int newSal = getbaseSalary() + 5000;
			setCurrSalary(newSal);
			System.out.println("Your current salary which is "+getbaseSalary()+ " incremented to "
				+newSal);
		}else{
			setCurrSalary(getbaseSalary());
		}
	}
}

class PartTimeEmployee extends Employee{
	private int hours;
	
	PartTimeEmployee(int employeeID, String name, int baseSalary, int hours){
		super(employeeID, name, baseSalary);
		this.hours = hours;
	}
	
	@Override
	void calculateSalary(){
		if(hours > 5){
			int newSal = getbaseSalary() + 5000;
			setCurrSalary(newSal);
			System.out.println("Your current salary which is "+getbaseSalary()+ " incremented to "
				+newSal);
		}else{
			setCurrSalary(getbaseSalary());
		}
	}
}

public class EmployeeManagement{
	public static void main(String[] a){
		Employee emp1 = new FullTimeEmployee(40, "Manoj", 10000, 6);
		emp1.calculateSalary();
		emp1.assignDepartment("CSE");
		emp1.displayDetails();
	}
}