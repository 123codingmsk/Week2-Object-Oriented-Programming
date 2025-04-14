class Employee{
	private String name;
	private int id;
	private int salary;
	
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return id;
	}
	
	public int getSalary(){
		return salary;
	}
	
	void displayDetails(){
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
}

class Manager extends Employee{
	private int teamsize;
	
	public Manager(String name, int id, int salary, int teamsize){
		super(name, id, salary);
		this.teamsize = teamsize;
	}
	
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("TeamSize: "+teamsize);
		manager();
	}
	
	void manager(){
		System.out.println("Im a Manager");
	}
}

class Developer extends Employee{
	private String language;
	
	public Developer(String name, int id, int salary, String language){
		super(name, id, salary);
		this.language = language;
	}
	
	@Override
	void displayDetails(){
		super.displayDetails();
		System.out.println("Language: "+language);
		developer();
	}
	
	void developer(){
		System.out.println("Im a Developer");
	}
}

class Intern extends Employee{
	
	public Intern(String name, int id, int salary){
		super(name, id, salary);
	}
	
	void intern(){
		System.out.println("Im an Intern");
	}
	
	void displayDetails(){
		super.displayDetails();
		intern();
	}
}

public class EmpManagement{
	public static void main(String[] args){
		Manager manager = new Manager("Raju", 1, 50000, 10);
		manager.teamsize = 20;
		manager.displayDetails();
		
		Developer developer = new Developer("Manoj", 1, 30000, "Java");
		developer.displayDetails();
		
		Intern intern = new Intern("Teja", 1, 10000);
		intern.displayDetails();
		
	}
}