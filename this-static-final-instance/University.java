class Student{
	static String universityName = "SRM";
	static int totalstudents = 0;
	String name;
	final int rollno;
	char grade;
	
	Student(String name, int rollno, char grade){
		this.name = name;
		this.rollno = rollno;
		this.grade = grade;
		totalstudents++;
	}
	
	static void displayTotalStudents(){
		System.out.println("Total Students: "+totalstudents);
	}
	
	void display(){
		System.out.println("University: "+universityName);
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollno);
		System.out.println("Grade: "+grade);
	}
}


public class University{
	public static void main(String[] args){
		Student s1 = new Student("Manoj", 40, 'A');
		
		if(s1 instanceof Student){
			s1.display();
			Student.displayTotalStudents();
		}else{
			System.out.println("Not an instance");
		}
	}
}