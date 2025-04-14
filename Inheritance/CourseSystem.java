class Course{
	private String courseName;
	private int duration;
	
	Course(String courseName, int duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	
	void displayinfo(){
		System.out.println("CourseName: "+courseName);
		System.out.println("Duration: "+duration);
	}
}

class OnlineCourse extends Course{
	private String platform;
	private boolean isRecorded;
	
	OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
		super(courseName, duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	
	//@Override
	void displayinfo(){
		super.displayinfo();
		System.out.println("Platform: "+platform);
		System.out.println("Recorded: "+isRecorded);
	}
}

class PaidOnlineCourse extends OnlineCourse{
	private int fee;
	private double discount;
	
	PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, double discount){
		super(courseName, duration, platform, isRecorded); 
		this.fee = fee;
		this.discount = discount;
	}
	
	public double getFinalPrice() {
        return fee - (fee * discount / 100);
    }
	
	//@Override
	void displayinfo(){
		super.displayinfo();
		System.out.println("Fee: "+fee);
		System.out.println("Discount: "+discount);
		System.out.println("Final Fee: "+getFinalPrice());
	}
}

public class CourseSystem{
    public static void main(String[] args){
        
        Course course = new Course("Introduction to Programming", 6);
        course.displayinfo();

        
        OnlineCourse onlineCourse = new OnlineCourse("Data Structures", 8, "Udemy", true);
        onlineCourse.displayinfo();

        
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Machine Learning", 10, "Coursera", false, 200, 20);
        paidOnlineCourse.displayinfo();
    }
}