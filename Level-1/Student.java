class Student{

	public int rollNumber;
	protected String name;
	private double CGPA;
	
	Student(int rollNumber, String name, double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public void setCGPA(double CGPA){
		this.CGPA = CGPA;
	}
	
	public double getCGPA(){
		return CGPA;
	}
	
	void display(){
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+CGPA);
	}
	
	public static void main(String[] args){
		Student p1 = new Student(40, "Manoj", 8.56);
		
		p1.setCGPA(9.0);
		p1.display();
		
		PostgraduteStudent pg1 = new PostgraduteStudent(40, "Manoj", 9.0, "CSE");
		pg1.setCGPA(8.56);
		pg1.display();
		
	}
}

class PostgraduteStudent extends Student{
	String specilization;
	
	PostgraduteStudent(int rollNumber, String name, double CGPA, String specilization){
		super(rollNumber, name, CGPA); //calls parent class
		this.specilization = specilization;
	}
	
	void display(){
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Name: "+name);
		System.out.println("CGPA: "+getCGPA());
		System.out.println("Specilization: "+specilization);
	}
	
}

