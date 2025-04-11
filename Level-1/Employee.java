class Employee{

	String name, id;
	int salary;
	
	public void display(){
		System.out.println("Name: "+ name);
		System.out.println("ID: "+ id);
		System.out.println("Salary: "+ salary);
	}
	public static void main(String[] args){
		Employee e1 = new Employee();
		e1.name = "Manoj";
		e1.id = "RA2111051010040";
		e1.salary = 30000;
		
		e1.display();
		
	}
}