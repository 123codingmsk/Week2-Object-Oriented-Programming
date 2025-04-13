import java.util.List;
import java.util.ArrayList;

class Student{
	private String studName;
	private List<Course> courses;
	
	Student(String studName){
		this.studName = studName;
		this.courses = new ArrayList<>();
	}
	
	public List<Course> getcourses(){
		return courses;
	}
	
	public void addCourse(Course course){
		courses.add(course);
	}
	
	public String getStudName(){
		return studName;
	}	
}

class Course{
	private String courseName;
	private List<Student> students;
	
	Course(String courseName){
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public List<Student> getstudents(){
		return students;
	}
}

class School{
	private String name;
	private List<Student> students;
	private List<Course> courses;
	
	School(String name){
		this.name = name;
		this.students = new ArrayList<>();
		this.courses = new ArrayList<>();
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void addCourse(Course course){
		courses.add(course);
	}
	
	public void enrollStudentinCourse(Student student, Course course){
		student.addCourse(course);
		course.addStudent(student);
	}
	
	public List<Student> getStudents() {
        return students;
    }

    public List<Course> getCourses() {
        return courses;
    }
	
	public void displayStudents(){
		System.out.println("Students in "+ name+ ":");
		for(Student student : students){
			System.out.println("- " + student.getStudName());
		}
	}
	
	public void displayCourses() {
        System.out.println("Courses offered at " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

public class SchoolSystem{
	public static void main(String[] args){
		Student s1 = new Student("Manoj");
		Student s2 = new Student("Raju");
		
		Course c1 = new Course("CSE");
		Course c2 = new Course("ECE");
		
		School school = new School("SRM");
		
		school.addStudent(s1);
		school.addStudent(s2);
		
		school.addCourse(c1);
		school.addCourse(c2);
		
		school.enrollStudentinCourse(s1, c1);
		school.enrollStudentinCourse(s2, c1);
		school.enrollStudentinCourse(s1, c2);
		school.enrollStudentinCourse(s2, c2);
		
		school.displayStudents();
		school.displayCourses();
		
		System.out.println("\nCourses for " + s1.getStudName() + ":");
		for(Course c : s1.getcourses()){
			System.out.println("- "+c.getCourseName());
		}
		System.out.println("\nStudents enrolled in " + c2.getCourseName() + ":");
		for(Student s : c2.getstudents()){
			System.out.println("- "+s.getStudName());
		}
	}
}
