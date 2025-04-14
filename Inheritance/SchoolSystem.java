class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	void displayInfo(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Teacher extends Person{
	private String subjectName;
	
	Teacher(String name, int age, String subjectName){
		super(name, age);
		this.subjectName = subjectName;
	}
	
	void displayRole(){
		super.displayInfo();
		System.out.println("Subject: "+subjectName+"\n");
	}
}

class Student extends Person{
	private char grade;
	
	Student(String name, int age, char grade){
		super(name, age);
		this.grade = grade;
	}
	
	void displayRole(){
		super.displayInfo();
		System.out.println("Grade: "+grade+"\n");
	}
}

class Staff extends Person{
	private int salary;
	
	Staff(String name, int age, int salary){
		super(name, age);
		this.salary = salary;
	}
	
	void displayRole(){
		super.displayInfo();
		System.out.println("Salary: "+salary+"\n");
	}
}

public class SchoolSystem{
	public static void main(String[] args){
		Teacher p1 = new Teacher("Raju", 31, "Maths");
		Student p2 = new Student("Manoj", 21, 'A');
		Staff p3 = new Staff("Teja", 22, 10000);
		
		p1.displayRole();
		p2.displayRole();
		p3.displayRole();
	}
}