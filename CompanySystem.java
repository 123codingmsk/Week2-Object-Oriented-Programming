import java.util.List;
import java.util.ArrayList;


class Employee{
	private String empName;
	
	Employee(String empName){
		this.empName = empName;
	}
	
	public String getName(){
		return empName;
	}		
}

class Department{
	private String depName;
	private List<Employee> employees;
	
	Department(String depName){
		this.depName = depName;
		this.employees = new ArrayList<>();
	}
	
	public String getDepName(){
		return depName;
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public List<Employee> getEmployees(){
		return employees;
	}
}

class Company{
	private String compName;
	private List<Department> departments;
	
	Company(String compName){
		this.compName = compName;
		this.departments = new ArrayList<>();
	}
	
	public String getCompName(){
		return compName;
	}
	
	public void addDepartment(Department department){
		departments.add(department);
	}
	
	public List<Department> getDepartments(){
		return departments;
	}
	
	public void addintoDB(Employee employee, Department department){
		department.addEmployee(employee);
		if(!departments.contains(department)){
			departments.add(department);
		}
	}
}

public class CompanySystem{
	public static void main(String[] a){
		Company company = new Company("Tech Corp");

        Department IT = new Department("IT Department");
        Department HR = new Department("HR Department");

        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
		
		company.addDepartment(IT);
        company.addDepartment(HR);

        company.addintoDB(e1, IT);
        company.addintoDB(e2, HR);
		
		System.out.println("Company: " + company.getCompName());
        for (Department d : company.getDepartments()) {
            System.out.println("Department: " + d.getDepName());
            for (Employee e : d.getEmployees()) {
                System.out.println("  Employee: " + e.getName());
            }
        }
	}
}	