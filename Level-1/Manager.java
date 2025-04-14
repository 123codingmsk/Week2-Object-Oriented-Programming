class Employee{
	
	public int employeeID;
	protected String department;
	private int salary;
	
	Employee(int employeeID, String department, int salary){
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	public void setSal(int salary){
		this.salary = salary;
	}
	
	public int getSal(){
		return salary;
	}
}

class Manager extends Employee{
	
	Manager(int employeeID, String department, int salary){
		super(employeeID, department, salary);
		setSal(50000);
	}
	
	void display(){
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+getSal());
	}
	
	public static void main(String[] args){
		
		Manager m1 = new Manager(50, "Raju", 40000);
		m1.display();
	}
}