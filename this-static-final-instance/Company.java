class Employee{
	static String companyName = "Capgemini";
	static int totalEmp = 0;
	String name;
	final int id;
	String designation;
	
	Employee(String name, int id, String designation){
		this.name = name;
		this.id = id;
		this.designation = designation;
		totalEmp++;
	}	
	
	static void displayTotalEmployees(){
		System.out.println("Total Employees: "+totalEmp);
	}
	
	void display(){
		System.out.println("Company Name: "+companyName);
		System.out.println("Emplooyee Name: "+name);
		System.out.println("Emplooyee ID: "+id);
		System.out.println("Designation "+designation);
	}
}

public class Company{
	public static void main(String[] args){
		Employee p1 = new Employee("Manoj", 40, "Developer");

		if(p1 instanceof Employee){
			p1.display();
			Employee.displayTotalEmployees();
		}else{
			System.out.println("Not an instance of Emplooyee");
		}
	}
}