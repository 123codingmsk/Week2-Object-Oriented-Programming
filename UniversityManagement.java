import java.util.List;
import java.util.ArrayList;
class Course{
	private String courseName;
	private List<Student> students;
	private Professor professor;
	
	Course(String courseName){
		this.courseName = courseName;
		this.students = new ArrayList<>();
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public List<Student> getStudents(){
		return students;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void assignProfessor(Professor professor){
		this.professor = professor;
	}
	
	public Professor getProfessor(){
		return professor;
	}
}

class Student{
	private String studName;
	private int studentCount = 1;
	private int studentID;
	private List<Course> courses;
	
	Student(String studName){
		this.studName = studName;
		this.studentID = studentCount++;
		this.courses = new ArrayList<>();
	}
	
	public String getStudName(){
		return studName;
	}
	
	public int getStudentID(){
		return studentID;
	}
	
	public List<Course> getCourses(){
		return courses;
	}
	
	public void enrollCourse(Course course){
		courses.add(course);
		course.addStudent(this);
	}
}

class Professor{
	private String professorName;
	private List<Course> coursesTeaching;
	
	Professor(String professorName){
		this.professorName = professorName;
		this.coursesTeaching = new ArrayList<>();
	}
	
	public String getprofessorName(){
		return professorName;
	}
	
	public List<Course> getCoursesteach(){
		return coursesTeaching;
	}
	
	public void assignCoursetoProff(Course course){
		coursesTeaching.add(course);
		course.assignProfessor(this);
	}
}

public class UniversityManagement{
	public static void main(String[] args){
		Student s1 = new Student("Manoj");
		Course c1 = new Course("CSE");
		Professor p1 = new Professor("Rajesh");
		
		s1.enrollCourse(c1);
		p1.assignCoursetoProff(c1);
		
		System.out.println(c1.getCourseName() + " is taught by " + c1.getProfessor().getprofessorName());
		for (Student student : c1.getStudents()) {
            System.out.println(student.getStudName());
        }
	}
}