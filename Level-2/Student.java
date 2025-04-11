class Student{
	
	String name;
	int rollNumber;
	private int marks;
	
	Student(String name, int rollNumber, int marks){
		this.name = name;
		this.rollNumber = rollNumber;
		this.marks = marks;
	}
	
	String calculateGrade(){
		String grade = "";
		if(marks >= 90){
			grade = "O+";
		}else if(marks >= 80){
			grade = "A+";
		}else if(marks >= 70){
			grade = "A";
		}else if(marks >= 60){
			grade = "B+";
		}else if(marks >= 50){
			grade = "B";
		}else{
			grade = "F";
		}
		return grade;
	}
	
	void display(){
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Marks: "+marks);
		System.out.println("Grade: "+ calculateGrade());
	}		
	
	public static void main(String[] args){
		Student s1 = new Student("Manoj", 40, 82);
		
		s1.calculateGrade();
		s1.display();
	}
}